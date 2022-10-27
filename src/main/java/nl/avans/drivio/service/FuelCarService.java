package nl.avans.drivio.service;

import nl.avans.drivio.model.FuelCar;
import nl.avans.drivio.repository.FuelCarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuelCarService {

    private final FuelCarRepository FuelCarRepository;

    @Autowired
    public FuelCarService(FuelCarRepository fuelCarData) {
        this.FuelCarRepository = fuelCarData;
    }

    public List<FuelCar> getFuelCars() {
        return FuelCarRepository.findAll();
    }

    public Optional<FuelCar> getFuelCarById(int carId) {
        return FuelCarRepository.findById(carId);
    }

    public void addFuelCar(FuelCar fuelCar) {
        // Check if there already is a car with the id
        Optional<FuelCar> FuelOptional =  FuelCarRepository.findById(fuelCar.getCarId());
        if (FuelOptional.isPresent()) {
            throw new IllegalStateException("There is already an car with the id");
        }

        FuelCarRepository.save(fuelCar);
    }

    public void removeFuelCar(int carId) {
        // Check if a car with the id exists
        boolean exists = FuelCarRepository.existsById(carId);
        if (!exists) {
            throw new IllegalStateException("car with id " + carId + " doesn't exists");
        }
        FuelCarRepository.deleteById(carId);
    }

    public void updateFuelCar(FuelCar fuelCar) {
        FuelCarRepository.save(fuelCar);
    }
}
