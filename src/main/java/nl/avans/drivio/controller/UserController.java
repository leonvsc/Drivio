package nl.avans.drivio.controller;

import nl.avans.drivio.model.User;
import nl.avans.drivio.repository.UserRepository;
import nl.avans.drivio.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping()
    public List<User> getAllUsers() {
        return (List<User>) userService.getAllUsers();
    }

    @GetMapping("{userId}")
    public Optional<User> getById(@PathVariable("userId") int userId) {
        return userService.getById(userId);
    }

    @PostMapping()
    public void add(@RequestBody User user) {
        userService.add(user);
    }

    @PostMapping("/update")
    public void update(@RequestBody User user) {
        userService.update(user);
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody User user) {
        userService.delete(user);
    }
}
