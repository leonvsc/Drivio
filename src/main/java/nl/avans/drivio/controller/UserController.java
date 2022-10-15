package nl.avans.drivio.controller;

import nl.avans.drivio.model.User;
import nl.avans.drivio.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/user")
public class UserController {

    private final IUserRepository userRepository;


    @Autowired
    public UserController(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping(path = "/users")
    public List<User> getAllUsers() {
        return (List<User>) userRepository.findAll();
    }

    @PostMapping(path = "/add")
    public void add(@RequestBody User user) {
        userRepository.save(user);
    }

    @PutMapping(path = "/update")
    public void update(@RequestBody User user) {
        userRepository.save(user);
    }

    @DeleteMapping(path = "/delete")
    public void delete(@RequestBody User user) {
        userRepository.delete(user);
    }
}
