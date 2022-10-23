package nl.avans.drivio.service;


import nl.avans.drivio.model.User;
import nl.avans.drivio.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final IUserRepository userRepository;

    @Autowired
    public UserService(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    public User getUserById(int userId) {
        Optional<User> user = userRepository.findById(userId);
        if (user.isPresent()) {
            return user.get();
        } else {
            throw new IllegalArgumentException("No user found with given id["+ userId +"]");
        }
    }

    public void add(User user) {
        userRepository.save(user);
    }

    public User updateUser(User user, int userId) {

        // check whether a user with given id exists in the DB or not
        User existingUser = userRepository.findById(userId).orElseThrow(
                () -> new IllegalArgumentException("No user found with given id["+ userId +"]"));

        // set properties to be changed
        existingUser.setFirstName(user.getFirstName());
        existingUser.setLastName(user.getLastName());
        existingUser.setCity(user.getCity());
        existingUser.setPhone(user.getPhone());
        existingUser.setEmail(user.getEmail());
        existingUser.setPasswords(user.getPasswords());

        // save existing user to the Database
        userRepository.save(existingUser);
        return existingUser;
    }

    public void deleteUser(int userId) {

        // check whether a user exists in the database. if not, throw exception.
        Optional<User> user = userRepository.findById(userId);
        if (user.isPresent()) {
            // delete user with given id
            userRepository.deleteById(userId);
        } else {
            throw new IllegalArgumentException("No user found with given id["+ userId +"]");
        }
    }
}

