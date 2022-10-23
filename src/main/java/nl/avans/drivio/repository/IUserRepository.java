package nl.avans.drivio.repository;

import nl.avans.drivio.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<User, Integer> {
}
