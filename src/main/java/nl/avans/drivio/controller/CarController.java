package nl.avans.drivio.controller;

import nl.avans.drivio.model.Car;
import nl.avans.drivio.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/car")
public class CarController {

    private final CarService CarService;

    @Autowired
    public CarController(CarService CarService) {
        this.CarService = CarService;
    }

    @GetMapping
    public List<Car> getCars() {
        return CarService.getCars();
    }

    @PutMapping(path = "/update")
    public void updateCar(@RequestBody Car car) {
        CarService.updateCar(car);
    }

    @PostMapping
    public void addCar(@RequestBody Car car) {
        CarService.addCar(car);
    }

    @DeleteMapping(path = "{carId}")
    public void removeCar(@PathVariable("carId") int carId) {
        CarService.removeCar(carId);
    }
}
