package nl.avans.drivio.service;

import nl.avans.drivio.model.FuelCar;
import nl.avans.drivio.repository.IFuelCarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuelCarService {

    private final IFuelCarRepository FuelCarRepository;

    @Autowired
    public FuelCarService(IFuelCarRepository fuelCarData) {
        this.FuelCarRepository = fuelCarData;
    }

    public List<FuelCar> getFuelCars() {
        return FuelCarRepository.findAll();
    }

    public Optional<FuelCar> getFuelCarById(int carId) {
        return FuelCarRepository.findById(carId);
    }

    public void addFuelCar(FuelCar fuelCar) {
        Optional<FuelCar> FuelOptional =  FuelCarRepository.findById(fuelCar.getCarId());
        if (FuelOptional.isPresent()) {
            throw new IllegalStateException("There is already an car with the id");
        }

        FuelCarRepository.save(fuelCar);
    }

    public void removeFuelCar(int carId) {
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
