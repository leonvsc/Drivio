package nl.avans.drivio.repository;

import nl.avans.drivio.model.Advertisement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdvertisementRepository extends JpaRepository<Advertisement, Integer> {
}
