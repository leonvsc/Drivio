package nl.avans.drivio.model;

import java.util.Collection;

public class FuelCar extends Car{
    double literPer100Km;
    int tankSize;
    int range;

    public FuelCar(int carId, String brand, String model, String fuelType, int buildYear, String numberPlate, String carType, String gearBox, Collection<CarRating> ratings, double literPer100Km, int tankSize, int range) {
        super(carId, brand, model, fuelType, buildYear, numberPlate, carType, gearBox, ratings);
        this.literPer100Km = literPer100Km;
        this.tankSize = tankSize;
        this.range = range;
    }
}
