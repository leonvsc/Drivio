package nl.avans.drivio.repository;

import nl.avans.drivio.model.User;

import java.util.List;

public interface IUserRepository {

    List<User> findAll();
    User findById(Integer userId);
    void add(User user);
    void update(User user);
    void delete(User user);

}
