package nl.avans.drivio.repository;

import nl.avans.drivio.model.FuelCar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFuelCarRepository extends JpaRepository<FuelCar, Integer> {
}
