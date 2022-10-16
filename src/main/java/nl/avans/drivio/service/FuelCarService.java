package nl.avans.drivio.service;

import nl.avans.drivio.model.FuelCar;
import nl.avans.drivio.repository.FuelCarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FuelCarService {

    private final FuelCarRepository fuelCarData;

    @Autowired
    public FuelCarService(FuelCarRepository fuelCarData) {
        this.fuelCarData = fuelCarData;
    }

    public List<FuelCar> getFuelCars() {
        return fuelCarData.findAll();
    }

    public void addFuelCar(FuelCar fuelCar) {
        Optional<FuelCar> FuelOptional =  fuelCarData.findById(fuelCar.getCarId());
        if (FuelOptional.isPresent()) {
            throw new IllegalStateException("There is already an car with the id");
        }

        fuelCarData.save(fuelCar);
    }

    public void removeFuelCar(int carId) {
        boolean exists = fuelCarData.existsById(carId);
        if (!exists) {
            throw new IllegalStateException("car with id " + carId + " doesn't exists");
        }
        fuelCarData.deleteById(carId);
    }

    public void updateFuelCar(FuelCar fuelCar) {
        fuelCarData.save(fuelCar);
    }
}
