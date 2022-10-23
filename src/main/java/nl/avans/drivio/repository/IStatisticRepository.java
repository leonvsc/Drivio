package nl.avans.drivio.repository;

import nl.avans.drivio.model.Statistic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStatisticRepository extends JpaRepository<Statistic, Integer> {
}
