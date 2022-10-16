package nl.avans.drivio.service;

import nl.avans.drivio.model.ElectricCar;
import nl.avans.drivio.repository.ElectricCarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ElectricCarService {

    private final ElectricCarRepository electricCarData;

    @Autowired
    public ElectricCarService(ElectricCarRepository electricCarData) {
        this.electricCarData = electricCarData;
    }

    public List<ElectricCar> getElectricCars() {
        return electricCarData.findAll();
    }

    public void addElectricCar(ElectricCar electricCar) {
        Optional<ElectricCar> electricCarOptional =  electricCarData.findById(electricCar.getCarId());
        if (electricCarOptional.isPresent()) {
            throw new IllegalStateException("There is already an car with the id");
        }
        electricCarData.save(electricCar);
    }

    public void removeElectricCar(int carId) {
        boolean exists = electricCarData.existsById(carId);
        if (!exists) {
            throw new IllegalStateException("car with id " + carId + " doesn't exists");
        }
        electricCarData.deleteById(carId);
    }

    public void updateElectricCar(ElectricCar electricCar) {
        electricCarData.save(electricCar);
    }
}
