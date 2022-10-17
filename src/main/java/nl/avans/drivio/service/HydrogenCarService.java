package nl.avans.drivio.service;

import nl.avans.drivio.model.HydrogenCar;
import nl.avans.drivio.repository.IHydrogenCarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HydrogenCarService {

    private final IHydrogenCarRepository hydrogenCarRepository;

    @Autowired
    public HydrogenCarService(IHydrogenCarRepository hydrogenCarData) {
        this.hydrogenCarRepository = hydrogenCarData;
    }

    public List<HydrogenCar> getHydrogenCars() {
        return hydrogenCarRepository.findAll();
    }

    public Optional<HydrogenCar> getHydrogenCarById(int carId) {
        return hydrogenCarRepository.findById(carId);
    }

    public void addHydrogenCar(HydrogenCar hydrogenCar) {
        Optional<HydrogenCar> HydrogenOptional =  hydrogenCarRepository.findById(hydrogenCar.getCarId());
        if (HydrogenOptional.isPresent()) {
            throw new IllegalStateException("There is already an car with the id");
        }

        hydrogenCarRepository.save(hydrogenCar);
    }

    public void removeHydrogenCar(int carId) {
        boolean exists = hydrogenCarRepository.existsById(carId);
        if (!exists) {
            throw new IllegalStateException("car with id " + carId + " doesn't exists");
        }
        hydrogenCarRepository.deleteById(carId);
    }

    public void updateHydrogenCar(HydrogenCar hydrogenCar) {
        hydrogenCarRepository.save(hydrogenCar);
    }
}
