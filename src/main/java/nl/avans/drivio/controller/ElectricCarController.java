package nl.avans.drivio.controller;

import nl.avans.drivio.model.Car;
import nl.avans.drivio.model.ElectricCar;
import nl.avans.drivio.service.ElectricCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/ElectricCar")
public class ElectricCarController {

    private final ElectricCarService ElectricCarService;

    @Autowired
    public ElectricCarController(ElectricCarService ElectricCarService) {
        this.ElectricCarService = ElectricCarService;
    }

    @GetMapping
    public List<ElectricCar> getElectricCars() {
        return ElectricCarService.getElectricCars();
    }

    @PutMapping(path = "/update")
    public void updateElectricCar(@RequestBody ElectricCar electricCar) {
        ElectricCarService.updateElectricCar(electricCar);
    }

    @PostMapping
    public void addElectricCar(@RequestBody ElectricCar electricCar) {
        ElectricCarService.addElectricCar(electricCar);
    }

    @DeleteMapping(path = "{carId}")
    public void removeElectricCar(@PathVariable("carId") int carId) {
        ElectricCarService.removeElectricCar(carId);
    }
}
