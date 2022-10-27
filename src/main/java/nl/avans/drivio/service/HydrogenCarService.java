package nl.avans.drivio.service;

import nl.avans.drivio.model.HydrogenCar;
import nl.avans.drivio.repository.HydrogenCarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HydrogenCarService {

    private final HydrogenCarRepository HydrogenCarRepository;

    @Autowired
    public HydrogenCarService(HydrogenCarRepository hydrogenCarData) {
        this.HydrogenCarRepository = hydrogenCarData;
    }

    public List<HydrogenCar> getHydrogenCars() {
        return HydrogenCarRepository.findAll();
    }

    public Optional<HydrogenCar> getHydrogenCarById(int carId) {
        return HydrogenCarRepository.findById(carId);
    }

    public void addHydrogenCar(HydrogenCar hydrogenCar) {
        // Check if there already is a car with the id
        Optional<HydrogenCar> HydrogenOptional =  HydrogenCarRepository.findById(hydrogenCar.getCarId());
        if (HydrogenOptional.isPresent()) {
            throw new IllegalStateException("There is already an car with the id");
        }

        HydrogenCarRepository.save(hydrogenCar);
    }

    public void removeHydrogenCar(Integer carId) {
        // Check if a car with the id exists
        boolean exists = HydrogenCarRepository.existsById(carId);
        if (!exists) {
            throw new IllegalStateException("car with id " + carId + " doesn't exists");
        }
        HydrogenCarRepository.deleteById(carId);
    }

    public void updateHydrogenCar(HydrogenCar hydrogenCar) {
        HydrogenCarRepository.save(hydrogenCar);
    }
}
