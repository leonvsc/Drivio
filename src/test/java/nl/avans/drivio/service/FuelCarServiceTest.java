package nl.avans.drivio.service;

import nl.avans.drivio.model.FuelCar;
import nl.avans.drivio.model.User;
import nl.avans.drivio.repository.IFuelCarRepository;
import nl.avans.drivio.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;

class FuelCarServiceTest {

    @MockBean
    private UserRepository userRepository;

    @MockBean
    private IFuelCarRepository iFuelCarRepository;

    private FuelCarService test;
    private User user;
    private FuelCar fuelCar;

    @BeforeEach
    void beforeEach() {
        userRepository = mock(UserRepository.class);
        iFuelCarRepository = mock(IFuelCarRepository.class);
        test = new FuelCarService(iFuelCarRepository);


        user = mock(User.class);
        fuelCar = mock(FuelCar.class);
        user.setUserId(10);
        fuelCar.setCarId(10);

        when(userRepository.save(any(User.class))).thenAnswer(i -> i.getArgument(0));
        when(iFuelCarRepository.save(any(FuelCar.class))).thenAnswer(i -> i.getArgument(0));

        when(userRepository.findById(10)).thenAnswer(i -> Optional.of(user));
        when(iFuelCarRepository.findById(10)).thenAnswer(i -> Optional.of(fuelCar));
    }


    @Test
    void updateFuelCar() {
        test.removeFuelCar(-1);
        assertEquals("car with id 10 doesn't exists", );
        verify(iFuelCarRepository, times(0)).save(fuelCar);
    }
}