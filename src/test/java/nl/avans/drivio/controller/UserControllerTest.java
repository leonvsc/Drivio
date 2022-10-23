package nl.avans.drivio.controller;

import nl.avans.drivio.model.Password;
import nl.avans.drivio.model.User;
import nl.avans.drivio.repository.IUserRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@DataJpaTest
@TestPropertySource(locations = "classpath:application-test.properties")
class UserControllerTest {

    @Autowired
    private IUserRepository repository;

    @AfterEach
    void tearDown() {
        repository.deleteAll();
    }


    @Test
    void testDifferentUserId() {
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

        User user2 = new User(
                "Niels",
                "Warnaar",
                "Linschoten",
                12345L,
                "niels-warnaar@live.nl",
                password1);
        repository.save(user1);
        repository.save(user2);

        // When
        int id1 = user1.getUserId();
        int id2 = user2.getUserId();

        // Then
        assertNotEquals(id1, id2);
    }
}