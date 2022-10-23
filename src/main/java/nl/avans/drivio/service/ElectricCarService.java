package nl.avans.drivio.service;

import nl.avans.drivio.model.ElectricCar;
import nl.avans.drivio.repository.IElectricCarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ElectricCarService {

    private final IElectricCarRepository ElectricCarRepository;

    @Autowired
    public ElectricCarService(IElectricCarRepository electricCarData) {
        this.ElectricCarRepository = electricCarData;
    }

    public List<ElectricCar> getElectricCars() {
        return ElectricCarRepository.findAll();
    }

    public Optional<ElectricCar> getElectricCarById(int carId) {
        return ElectricCarRepository.findById(carId);
    }

    public void addElectricCar(ElectricCar electricCar) {
        Optional<ElectricCar> electricCarOptional =  ElectricCarRepository.findById(electricCar.getCarId());
        if (electricCarOptional.isPresent()) {
            throw new IllegalStateException("There is already an car with the id");
        }
        ElectricCarRepository.save(electricCar);
    }

    public void removeElectricCar(int carId) {
        boolean exists = ElectricCarRepository.existsById(carId);
        if (!exists) {
            throw new IllegalStateException("car with id " + carId + " doesn't exists");
        }
        ElectricCarRepository.deleteById(carId);
    }

    public void updateElectricCar(ElectricCar electricCar) {
        ElectricCarRepository.save(electricCar);
    }
}
