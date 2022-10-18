package nl.avans.drivio.model;

import java.util.Collection;

public class HydrogenCar extends Car {
    int range;
    double kgPer100Km;
    int tankSpeed;
    int tankSize;

    public HydrogenCar(int carId, String brand, String model, String fuelType, int buildYear, String numberPlate, String carType, String gearBox, Collection<CarRating> ratings, int range, double kgPer100Km, int tankSpeed, int tankSize) {
        super(carId, brand, model, fuelType, buildYear, numberPlate, carType, gearBox, ratings);
        this.range = range;
        this.kgPer100Km = kgPer100Km;
        this.tankSpeed = tankSpeed;
        this.tankSize = tankSize;
    }
}
