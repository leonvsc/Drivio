package nl.avans.drivio.controller;

import nl.avans.drivio.model.User;
import nl.avans.drivio.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/drivio")
public class UserController {

    private UserRepository userRepository;


    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping(path = "/users")
    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    @GetMapping(path = "/users/{id}")
    public Optional<User> getById(@PathVariable int id) {
        return userRepository.findById(id);
    }

    @PostMapping(path = "/add")
    public void add(@RequestBody User user) {
        userRepository.save(user);
    }


    @DeleteMapping(path = "/delete")
    public void delete(@RequestBody User user) {
        userRepository.delete(user);
    }
}
