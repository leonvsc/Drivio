package nl.avans.drivio.service;

import nl.avans.drivio.model.*;
import nl.avans.drivio.repository.IFuelCarRepository;
import nl.avans.drivio.repository.IHydrogenCarRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@TestPropertySource(locations = "classpath:application-test.properties")
class HydrogenCarServiceTest {
    @Autowired
    private IHydrogenCarRepository repository;
    Password password1 = new Password(
            "Voorbeeld1");
    User user1 = new User(
            "Niels",
            "Warnaar",
            "Linschoten",
            12345L,
            "niels-warnaar@live.nl",
            password1);
    HydrogenCar car1 = new HydrogenCar(
            "Opel",
            "Corsa",
            "Fuelcar",
            2022,
            "aa180",
            "Hatchback",
            "Manual",
            user1,
            300,
            50.4,
            700,
            300);
    HydrogenCar car2 = new HydrogenCar(
            "Opel",
            "Corsa",
            "Fuelcar",
            2022,
            "aa180",
            "Hatchback",
            "Manual",
            user1,
            500,
            3.2,
            5,
            50);

    @Test
    void removeHydrogenCar() {

        long countBefore = repository.count();
        repository.save(car1);
        repository.save(car2);

        repository.deleteById(car1.getCarId());
        repository.deleteById(car2.getCarId()); ;
        assertThat(repository.count()).isEqualTo(countBefore + 1);
//        // given
//        Integer carId = null;
//        Long phoneNumber = 12345678L;
//        Password password1 = new Password("test123");
//        User user1 = new User(
//                "Niels",
//                "Warnaar",
//                "Linchoten",
//                phoneNumber,
//                "niels-warnaar@live.nl",
//                password1);
//        HydrogenCar hydrogenCar = new HydrogenCar(
//                "Toyoya",
//                "Mirai",
//                "Hydrogen",
//                2022,
//                "11-hlz-1",
//                "Sedan",
//                "Automatic",
//                user1,
//                600,
//                10.5,
//                5,
//                60);
//        underTest.save(hydrogenCar);
//        // when
//        boolean exists = underTest.existsById(hydrogenCar.getCarId());
//        //then
//        assertThat(exists).isTrue();
    }
}