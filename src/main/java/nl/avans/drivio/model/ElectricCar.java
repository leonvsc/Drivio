package nl.avans.drivio.model;

import java.util.Collection;

public class ElectricCar extends Car {
    double whPerKm;
    String chargeConnection;
    int range;
    int chargeSpeed;
    int fastChargeSpeed;

    public ElectricCar(int carId, String brand, String model, String fuelType, int buildYear, String numberPlate, String carType, String gearBox, Collection<CarRating> ratings, double whPerKm, String chargeConnection, int range, int chargeSpeed, int fastChargeSpeed) {
        super(carId, brand, model, fuelType, buildYear, numberPlate, carType, gearBox, ratings);
        this.whPerKm = whPerKm;
        this.chargeConnection = chargeConnection;
        this.range = range;
        this.chargeSpeed = chargeSpeed;
        this.fastChargeSpeed = fastChargeSpeed;
    }
}
