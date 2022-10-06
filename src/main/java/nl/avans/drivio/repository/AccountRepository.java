package nl.avans.drivio.repository;

import nl.avans.drivio.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

    @Query("SELECT s FROM Account s WHERE s.Email = ?1")
    Optional<Account> findaccountModelByEmail(String Email);

}
