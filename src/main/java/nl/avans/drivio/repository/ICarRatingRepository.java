package nl.avans.drivio.repository;

import nl.avans.drivio.model.CarRating;
import nl.avans.drivio.model.CarRatingId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICarRatingRepository extends JpaRepository<CarRating, CarRatingId> {
}
