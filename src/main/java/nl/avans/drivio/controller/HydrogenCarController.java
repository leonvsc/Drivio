package nl.avans.drivio.controller;

import nl.avans.drivio.model.Car;
import nl.avans.drivio.model.HydrogenCar;
import nl.avans.drivio.service.HydrogenCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/HydrogenCar")
public class HydrogenCarController {

    private final HydrogenCarService HydrogenCarService;

    @Autowired
    public HydrogenCarController(HydrogenCarService HydrogenCarService) {
        this.HydrogenCarService = HydrogenCarService;
    }

    @GetMapping
    public List<HydrogenCar> getHydrogenCars() {
        return HydrogenCarService.getHydrogenCars();
    }

    @PutMapping(path = "/update")
    public void updateHydrogenCar(@RequestBody HydrogenCar hydrogenCar) {
        HydrogenCarService.updateHydrogenCar(hydrogenCar);
    }

    @PostMapping
    public void addHydrogenCar(@RequestBody HydrogenCar hydrogenCar) {
        HydrogenCarService.addHydrogenCar(hydrogenCar);
    }

    @DeleteMapping(path = "{carId}")
    public void removeHydrogenCar(@PathVariable("carId") int carId) {
        HydrogenCarService.removeHydrogenCar(carId);
    }
}
