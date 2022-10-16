package nl.avans.drivio.controller;

import nl.avans.drivio.model.Car;
import nl.avans.drivio.model.FuelCar;
import nl.avans.drivio.service.FuelCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PutMapping(path = "/update")
    public void updateFuelCar(@RequestBody FuelCar fuelCar) {
        FuelCarService.updateFuelCar(fuelCar);
    }

    @PostMapping
    public void addFuelCar(@RequestBody FuelCar fuelCar) {
        FuelCarService.addFuelCar(fuelCar);
    }

    @DeleteMapping(path = "{carId}")
    public void removeFuelCar(@PathVariable("carId") int carId) {
        FuelCarService.removeFuelCar(carId);
    }
}
