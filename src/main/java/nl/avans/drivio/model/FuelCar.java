package nl.avans.drivio.model;

import org.springframework.data.geo.Point;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "fuel_cars")
public class FuelCar extends Car{

    @Column(name = "liter_per_100km")
    private double literPer100Km;
    @Column(name = "tank_size")
    private int tankSize;
    @Column(name = "car_range")
    private int carRange;

    public FuelCar(String imageUrl, String brand, String model, String fuelType, int buildYear, String numberPlate, String carType, String gearBox, User user, double latitude, double longitude, double literPer100Km, int tankSize, int range) {
        // Gets the values from the car class
        super(imageUrl, brand, model, fuelType, buildYear, numberPlate, carType, gearBox, user, latitude, longitude);
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
                ", carRange=" + carRange +
                '}';
    }
}
