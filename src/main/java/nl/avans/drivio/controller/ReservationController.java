package nl.avans.drivio.controller;

import nl.avans.drivio.model.Reservation;
import nl.avans.drivio.service.ReservationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1/reservation")
public class ReservationController {

    private final ReservationService ReservationService;

    public ReservationController(ReservationService reservationService) {
        ReservationService = reservationService;
    }

    @GetMapping
    public List<Reservation> getReservations() {
        return ReservationService.getReservations();
    }

    @GetMapping(path = "{reservationId}")
    public Optional<Reservation> getReservationId(@PathVariable("reservationId") int reservationId) {
        return ReservationService.getReservationById(reservationId);
    }

    @PostMapping
    public void createReservation(@RequestBody Reservation reservation) {
        ReservationService.createReservation(reservation);
    }

    @PutMapping(path = "/update")
    public void updateReservation(@RequestBody Reservation reservation) {
        ReservationService.updateReservation(reservation);
    }

    @DeleteMapping(path = "/delete/{reservationId}")
    public void deleteReservation(@PathVariable("reservationId") int reservationId) {
        ReservationService.deleteReservation(reservationId);
    }
}
