package nl.avans.drivio.data;

import nl.avans.drivio.model.accountModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICrudData extends JpaRepository<accountModel, Integer> {

    @Query("SELECT s FROM accountModel s WHERE s.Email = ?1")
    Optional<accountModel> findaccountModelByEmail(String Email);

}
