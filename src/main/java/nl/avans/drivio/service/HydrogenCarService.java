package nl.avans.drivio.service;

import nl.avans.drivio.model.HydrogenCar;
import nl.avans.drivio.repository.HydrogenCarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HydrogenCarService {

    private final HydrogenCarRepository hydrogenCarData;

    @Autowired
    public HydrogenCarService(HydrogenCarRepository hydrogenCarData) {
        this.hydrogenCarData = hydrogenCarData;
    }

    public List<HydrogenCar> getHydrogenCars() {
        return hydrogenCarData.findAll();
    }

    public void addHydrogenCar(HydrogenCar hydrogenCar) {
        Optional<HydrogenCar> HydrogenOptional =  hydrogenCarData.findById(hydrogenCar.getCarId());
        if (HydrogenOptional.isPresent()) {
            throw new IllegalStateException("There is already an car with the id");
        }

        hydrogenCarData.save(hydrogenCar);
    }

    public void removeHydrogenCar(int carId) {
        boolean exists = hydrogenCarData.existsById(carId);
        if (!exists) {
            throw new IllegalStateException("car with id " + carId + " doesn't exists");
        }
        hydrogenCarData.deleteById(carId);
    }

    public void updateHydrogenCar(HydrogenCar hydrogenCar) {
        hydrogenCarData.save(hydrogenCar);
    }
}
