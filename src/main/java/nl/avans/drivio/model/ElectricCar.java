package nl.avans.drivio.model;

public class ElectricCar extends Car {
    double whPerKm;
    String chargeConnection;
    int range;
    int chargeSpeed;
    int fastChargeSpeed;

    public ElectricCar(int carId, String brand, String model, String fuelType, String buildYear, String numberPlate, String carType, String gearBox, User owner, User renter, double whPerKm, String chargeConnection, int range, int chargeSpeed, int fastChargeSpeed) {
        super(carId, brand, model, fuelType, buildYear, numberPlate, carType, gearBox, owner, renter);
        this.whPerKm = whPerKm;
        this.chargeConnection = chargeConnection;
        this.range = range;
        this.chargeSpeed = chargeSpeed;
        this.fastChargeSpeed = fastChargeSpeed;
    }

}
