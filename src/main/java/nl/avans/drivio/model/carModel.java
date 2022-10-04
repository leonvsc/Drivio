package nl.avans.drivio.model;

public class carModel {
    private String CarId;
    private String Brand;
    private String Model;
    private String FuelType;
    private String BuildYear;
    private String NumberPlate;
    private String CarType;
    private String GearBox;
    private userModel Owner;
    private userModel Renter;

    public carModel(String carId, String brand, String model, String fuelType, String buildYear, String numberPlate, String carType, String gearBox, userModel owner, userModel renter) {
        this.CarId = carId;
        this.Brand = brand;
        this.Model = model;
        this.FuelType = fuelType;
        this.BuildYear = buildYear;
        this.NumberPlate = numberPlate;
        this.CarType = carType;
        this.GearBox = gearBox;
        this.Owner = owner;
        this.Renter = renter;

    }

    public String getCarId() {
        return CarId;
    }

    public void setCarId(String carId) {
        this.CarId = carId;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        this.Brand = brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        this.Model = model;
    }

    public String getFuelType() {
        return FuelType;
    }

    public void setFuelType(String fuelType) {
        this.FuelType = fuelType;
    }

    public String getBuildYear() {
        return BuildYear;
    }

    public void setBuildYear(String buildYear) {
        this.BuildYear = buildYear;
    }

    public String getNumberPlate() {
        return NumberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.NumberPlate = numberPlate;
    }

    public String getCarType() {
        return CarType;
    }

    public void setCarType(String carType) {
        this.CarType = carType;
    }

    public String getGearBox() {
        return GearBox;
    }

    public void setGearBox(String gearBox) {
        this.GearBox = gearBox;
    }

    public userModel getOwner() {
        return Owner;
    }

    public void setOwner(userModel owner) {
        Owner = owner;
    }

    public userModel getRenter() {
        return Renter;
    }

    public void setRenter(userModel renter) {
        Renter = renter;
    }
}
