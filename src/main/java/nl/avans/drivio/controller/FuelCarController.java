package nl.avans.drivio.controller;

import nl.avans.drivio.model.FuelCar;
import nl.avans.drivio.service.FuelCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "api/v1/FuelCar")
public class FuelCarController {

    private final FuelCarService FuelCarService;

    @Autowired
    public FuelCarController(FuelCarService FuelCarService) {
        this.FuelCarService = FuelCarService;
    }

    @GetMapping
    public List<FuelCar> getFuelCars() {
        return FuelCarService.getFuelCars();
    }

    @GetMapping(path = "{carId}")
    public Optional<FuelCar> getFuelCarById(@PathVariable("carId") int carId) {
        return FuelCarService.getFuelCarById(carId);
    }

    @PutMapping(path = "/update")
    public void updateFuelCar(@RequestBody FuelCar fuelCar) {
        FuelCarService.updateFuelCar(fuelCar);
    }

    @PostMapping
    public void addFuelCar(@RequestBody FuelCar fuelCar) {
        FuelCarService.addFuelCar(fuelCar);
    }

    @DeleteMapping(path = "/delete/{carId}")
    public void removeFuelCar(@PathVariable("carId") int carId) {
        FuelCarService.removeFuelCar(carId);
    }
}
