package nl.avans.drivio.controller;

import nl.avans.drivio.model.User;
import nl.avans.drivio.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping()
    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    @GetMapping("{userId}")
    public Optional<User> getById(@PathVariable("userId") int userId) {
        return userRepository.findById(userId);
    }

    @PostMapping
    public void add(@RequestBody User user) {
        userRepository.save(user);
    }

    @PutMapping("/update")
    public void updateUser(@RequestBody User user) {
        userRepository.save(user);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody User user) {
        userRepository.delete(user);
    }
}
