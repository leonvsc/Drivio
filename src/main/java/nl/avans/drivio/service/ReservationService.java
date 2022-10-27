package nl.avans.drivio.service;

import nl.avans.drivio.model.Advertisement;
import nl.avans.drivio.model.Reservation;
import nl.avans.drivio.repository.AdvertisementRepository;
import nl.avans.drivio.repository.ReservationRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ReservationService {

    private final ReservationRepository ReservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.ReservationRepository = reservationRepository;

    }

    public List<Reservation> getReservations() {
        return ReservationRepository.findAll();
    }

    public Optional<Reservation> getReservationById(int reservationId) {
        return ReservationRepository.findById(reservationId);
    }

    public void createReservation(Reservation reservation) {
//        LocalDate startDate = reservation.getStartDate();
//        LocalDate endDate = reservation.getEndDate();
//        Optional<Advertisement> advertisementOptional = AdvertisementRepository.findById(advertisement.getAdvertisementId());
//        Optional<Reservation> reservationOptional = ReservationRepository.findById(reservation.getAdvertisement());
//
//        if (advertisementOptional.isPresent()) {
//
//        }
//
//        else
            ReservationRepository.save(reservation);
    }

    public void updateReservation(Reservation reservation) {
        ReservationRepository.save(reservation);
    }

    public void deleteReservation(int reservationId) {
        boolean exists = ReservationRepository.existsById(reservationId);
        if (!exists) {
            throw new IllegalStateException("Statistic with id " + reservationId + " doesn't exists");
        }
        ReservationRepository.deleteById(reservationId);
    }
}
