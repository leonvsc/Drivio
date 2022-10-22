package nl.avans.drivio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
public class HydrogenCar extends Car {
    @Column(name = "CarRange")
    private int carRange;
    private double kgPer100Km;
    private int tankSpeed;
    private int tankSize;

    public HydrogenCar(String brand, String model, String fuelType, int buildYear, String numberPlate, String carType, String gearBox, User user, int carRange, double kgPer100Km, int tankSpeed, int tankSize) {
        super(brand, model, fuelType, buildYear, numberPlate, carType, gearBox, user);
        this.carRange = carRange;
        this.kgPer100Km = kgPer100Km;
        this.tankSpeed = tankSpeed;
        this.tankSize = tankSize;
    }

    public HydrogenCar() {

    }

    public int getCarRange() {
        return carRange;
    }

    public void setCarRange(int range) {
        this.carRange = range;
    }

    public double getKgPer100Km() {
        return kgPer100Km;
    }

    public void setKgPer100Km(double kgPer100Km) {
        this.kgPer100Km = kgPer100Km;
    }

    public int getTankSpeed() {
        return tankSpeed;
    }

    public void setTankSpeed(int tankSpeed) {
        this.tankSpeed = tankSpeed;
    }

    public int getTankSize() {
        return tankSize;
    }

    public void setTankSize(int tankSize) {
        this.tankSize = tankSize;
    }

    @Override
    public String toString() {
        return "HydrogenCar{" +
                "range=" + carRange +
                ", kgPer100Km=" + kgPer100Km +
                ", tankSpeed=" + tankSpeed +
                ", tankSize=" + tankSize +
                '}';
    }
}
