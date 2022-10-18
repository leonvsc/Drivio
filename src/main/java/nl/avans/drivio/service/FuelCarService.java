package nl.avans.drivio.service;

import nl.avans.drivio.model.FuelCar;
import nl.avans.drivio.repository.IFuelCarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuelCarService {

    private final IFuelCarRepository fuelCarRepository;

    @Autowired
    public FuelCarService(IFuelCarRepository fuelCarData) {
        this.fuelCarRepository = fuelCarData;
    }

    public List<FuelCar> getFuelCars() {
        return fuelCarRepository.findAll();
    }

    public Optional<FuelCar> getFuelCarById(int carId) {
        return fuelCarRepository.findById(carId);
    }

    public void addFuelCar(FuelCar fuelCar) {
        Optional<FuelCar> FuelOptional =  fuelCarRepository.findById(fuelCar.getCarId());
        if (FuelOptional.isPresent()) {
            throw new IllegalStateException("There is already an car with the id");
        }

        fuelCarRepository.save(fuelCar);
    }

    public void removeFuelCar(int carId) {
        boolean exists = fuelCarRepository.existsById(carId);
        if (!exists) {
            throw new IllegalStateException("car with id " + carId + " doesn't exists");
        }
        fuelCarRepository.deleteById(carId);
    }

    public void updateFuelCar(FuelCar fuelCar) {
        fuelCarRepository.save(fuelCar);
    }
}
