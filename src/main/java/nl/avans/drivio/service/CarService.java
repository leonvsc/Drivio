//package nl.avans.drivio.service;
//
//import nl.avans.drivio.repository.CarRepository;
//import nl.avans.drivio.model.Car;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class CarService {
//
//    private final CarRepository carData;
//
//    @Autowired
//    public CarService(CarRepository carData) {
//        this.carData = carData;
//    }
//
//    public List<Car> getCars() {
//        return carData.findAll();
//    }
//
//    public void addCar(Car car) {
//        Optional<Car> accountOptional =  carData.findById(car.getCarId());
//        if (accountOptional.isPresent()) {
//            throw new IllegalStateException("There is already an car with the id");
//        }
//
//        carData.save(car);
//    }
//
//    public void removeCar(int carId) {
//        boolean exists = carData.existsById(carId);
//        if (!exists) {
//            throw new IllegalStateException("car with id " + carId + " doesn't exists");
//        }
//        carData.deleteById(carId);
//    }
//
//    public void updateCar(Car car) {
//        carData.save(car);
//    }
//}
