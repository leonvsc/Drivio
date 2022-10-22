package nl.avans.drivio.service;

import nl.avans.drivio.model.Car;
import nl.avans.drivio.model.HydrogenCar;
import nl.avans.drivio.model.Password;
import nl.avans.drivio.model.User;
import nl.avans.drivio.repository.IHydrogenCarRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class HydrogenCarServiceTest {

    @Autowired
    private IHydrogenCarRepository underTest;

    @Test
    void removeHydrogenCar() {
        // given
        Integer carId = null;
        Long phoneNumber = 12345678L;
        Password password1 = new Password("test123");
        User user1 = new User(
                "Niels",
                "Warnaar",
                "Linchoten",
                phoneNumber,
                "niels-warnaar@live.nl",
                password1);
        HydrogenCar hydrogenCar = new HydrogenCar(
                "Toyoya",
                "Mirai",
                "Hydrogen",
                2022,
                "11-hlz-1",
                "Sedan",
                "Automatic",
                user1,
                600,
                10.5,
                5,
                60);
        underTest.save(hydrogenCar);
        // when
        boolean exists = underTest.existsById(hydrogenCar.getCarId());
        //then
        assertThat(exists).isTrue();
    }
}