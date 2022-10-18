package nl.avans.drivio.service;

import nl.avans.drivio.model.ElectricCar;
import nl.avans.drivio.repository.IElectricCarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ElectricCarService {

    private final IElectricCarRepository electricCarRepository;

    @Autowired
    public ElectricCarService(IElectricCarRepository electricCarData) {
        this.electricCarRepository = electricCarData;
    }

    public List<ElectricCar> getElectricCars() {
        return electricCarRepository.findAll();
    }

    public Optional<ElectricCar> getElectricCarById(int carId) {
        return electricCarRepository.findById(carId);
    }

    public void addElectricCar(ElectricCar electricCar) {
        Optional<ElectricCar> electricCarOptional =  electricCarRepository.findById(electricCar.getCarId());
        if (electricCarOptional.isPresent()) {
            throw new IllegalStateException("There is already an car with the id");
        }
        electricCarRepository.save(electricCar);
    }

    public void removeElectricCar(int carId) {
        boolean exists = electricCarRepository.existsById(carId);
        if (!exists) {
            throw new IllegalStateException("car with id " + carId + " doesn't exists");
        }
        electricCarRepository.deleteById(carId);
    }

    public void updateElectricCar(ElectricCar electricCar) {
        electricCarRepository.save(electricCar);
    }
}
