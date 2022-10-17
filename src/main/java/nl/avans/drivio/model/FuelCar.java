package nl.avans.drivio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class FuelCar extends Car{

    private double literPer100Km;
    private int tankSize;
    @Column(name = "CarRange")
    private int carRange;

    public FuelCar(int carId, String brand, String model, String fuelType, int buildYear, String numberPlate, String carType, String gearBox, User user, double literPer100Km, int tankSize, int range) {
        super(carId, brand, model, fuelType, buildYear, numberPlate, carType, gearBox, user);
        this.literPer100Km = literPer100Km;
        this.tankSize = tankSize;
        this.carRange = range;
    }

    public FuelCar() {

    }

    public double getLiterPer100Km() {
        return literPer100Km;
    }

    public void setLiterPer100Km(double literPer100Km) {
        this.literPer100Km = literPer100Km;
    }

    public int getTankSize() {
        return tankSize;
    }

    public void setTankSize(int tankSize) {
        this.tankSize = tankSize;
    }

    public int getCarRange() {
        return carRange;
    }

    public void setCarRange(int range) {
        this.carRange = range;
    }

    @Override
    public String toString() {
        return "FuelCar{" +
                "literPer100Km=" + literPer100Km +
                ", tankSize=" + tankSize +
                ", range=" + carRange +
                '}';
    }
}
