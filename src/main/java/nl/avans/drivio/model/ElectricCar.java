package nl.avans.drivio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "electric_cars")
public class ElectricCar extends Car {

    @Column(name = "wh_per_km")
    private double whPerKm;
    @Column(name = "charge_connection")
    private String chargeConnection;
    @Column(name = "car_range")
    private int carRange;
    @Column(name = "charge_speed")
    private int chargeSpeed;
    @Column(name = "fast_charge_speed")
    private int fastChargeSpeed;

    public ElectricCar(int carId, String brand, String model, String fuelType, int buildYear, String numberPlate, String carType, String gearBox, User user, double whPerKm, String chargeConnection, int range, int chargeSpeed, int fastChargeSpeed) {
        super(carId, brand, model, fuelType, buildYear, numberPlate, carType, gearBox, user);
        this.whPerKm = whPerKm;
        this.chargeConnection = chargeConnection;
        this.carRange = range;
        this.chargeSpeed = chargeSpeed;
        this.fastChargeSpeed = fastChargeSpeed;
    }

    public ElectricCar() {
    }

    public double getWhPerKm() {
        return whPerKm;
    }

    public void setWhPerKm(double whPerKm) {
        this.whPerKm = whPerKm;
    }

    public String getChargeConnection() {
        return chargeConnection;
    }

    public void setChargeConnection(String chargeConnection) {
        this.chargeConnection = chargeConnection;
    }

    public int getCarRange() {
        return carRange;
    }

    public void setCarRange(int range) {
        this.carRange = range;
    }

    public int getChargeSpeed() {
        return chargeSpeed;
    }

    public void setChargeSpeed(int chargeSpeed) {
        this.chargeSpeed = chargeSpeed;
    }

    public int getFastChargeSpeed() {
        return fastChargeSpeed;
    }

    public void setFastChargeSpeed(int fastChargeSpeed) {
        this.fastChargeSpeed = fastChargeSpeed;
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "whPerKm=" + whPerKm +
                ", chargeConnection='" + chargeConnection + '\'' +
                ", range=" + carRange +
                ", chargeSpeed=" + chargeSpeed +
                ", fastChargeSpeed=" + fastChargeSpeed +
                '}';
    }
}
