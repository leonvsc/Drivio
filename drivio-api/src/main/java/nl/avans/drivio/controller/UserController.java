package nl.avans.drivio.controller;

import nl.avans.drivio.business.IUserManager;
import nl.avans.drivio.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")  // Optional
public class UserController {

    private final IUserManager userManager;

    @Autowired
    public UserController(IUserManager userManager) {
        this.userManager = userManager;
    }

    @GetMapping(path = "/users")
    public List<User> getAllUsers() {
        return this.userManager.findAll();
    }

    @GetMapping(path = "/users/{id}")              // Curly braces means 'expecting an id arg'
    public User findById(@PathVariable int id) {     // Get arg from body. Example: /api/users/1
        return this.userManager.findById(id);
    }

    @PostMapping(path = "/add")
    public void add(@RequestBody User user) {        // Arg will be given from the body of the request (postman)
        this.userManager.add(user);
    }

    @PostMapping(path = "/update")
    public void update(@RequestBody User user) {
        this.userManager.update(user);
    }

    @PostMapping(path = "/delete")
    public void delete(@RequestBody User user) {
        this.userManager.delete(user);
    }
}
