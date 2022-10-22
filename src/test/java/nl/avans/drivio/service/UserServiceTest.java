package nl.avans.drivio.service;

import nl.avans.drivio.model.User;
import nl.avans.drivio.repository.IFuelCarRepository;
import nl.avans.drivio.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.any;

class UserServiceTest {

    @MockBean
    private UserRepository userRepository;

    private User user;

    @BeforeEach
    void beforeEach() {
        userRepository = mock(UserRepository.class);

        user = mock(User.class);
        user.setUserId(10);

        when(userRepository.save(any(User.class))).thenAnswer(i -> i.getArgument(0));

        when(userRepository.findById(10)).thenAnswer(i -> Optional.of(user));
    }

    @Test
    void updateUser() {

        verify(userRepository, times(0)).save(user);
    }
}