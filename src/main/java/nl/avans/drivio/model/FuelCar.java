package nl.avans.drivio.model;

public class FuelCar extends Car{
    double literPer100Km;
    int tankSize;
    int range;

    public FuelCar(int carId, String brand, String model, String fuelType, int buildYear, String numberPlate, String carType, String gearBox, User owner, User renter, double literPer100Km, int tankSize, int range) {
        super(carId, brand, model, fuelType, buildYear, numberPlate, carType, gearBox, owner, renter);
        this.literPer100Km = literPer100Km;
        this.tankSize = tankSize;
        this.range = range;
    }

}
