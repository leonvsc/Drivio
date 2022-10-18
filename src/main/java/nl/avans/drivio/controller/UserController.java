package nl.avans.drivio.controller;

import nl.avans.drivio.model.User;
import nl.avans.drivio.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/drivio/user")
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    @GetMapping("/users/{id}")
    public Optional<User> getById(@PathVariable int id) {
        return userRepository.findById(id);
    }

    @PostMapping("/add")
    public void add(@RequestBody User user) {
        userRepository.save(user);
    }


    @DeleteMapping("/delete")
    public void delete(@RequestBody User user) {
        userRepository.delete(user);
    }
}
