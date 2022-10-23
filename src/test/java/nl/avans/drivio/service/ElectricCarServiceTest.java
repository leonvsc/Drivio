package nl.avans.drivio.service;


import nl.avans.drivio.model.ElectricCar;
import nl.avans.drivio.model.Password;
import nl.avans.drivio.model.User;
import nl.avans.drivio.repository.IElectricCarRepository;
import nl.avans.drivio.repository.IUserRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;

// Test if the carId is equal to 1
@DataJpaTest
@TestPropertySource(locations = "classpath:application-test.properties")
class ElectricCarServiceTest {
    @Autowired
    private IElectricCarRepository repository;

    @Autowired
    private IUserRepository userRepository;

    @AfterEach
    void tearDown() {
        repository.deleteAll();
    }


    @Test
    void getElectricCarByIdTest() {
        // Given
        Password password1 = new Password(
                "Voorbeeld1");
        User user1 = new User(
                "Niels",
                "Warnaar",
                "Linschoten",
                12345L,
                "niels-warnaar@live.nl",
                password1);
        ElectricCar car = new ElectricCar(
                "Opel",
                "Corsa",
                "Fuelcar",
                2022,
                "aa180",
                "Hatchback",
                "Manual",
                user1,
                10.3,
                "normal",
                400,
                70,
                30);
        userRepository.save(user1);
        repository.save(car);
        // When
        // Then
        assertEquals(1, car.getCarId());
    }
}