package nl.avans.drivio.business;

import nl.avans.drivio.model.User;
import nl.avans.drivio.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class UserManager implements IUserManager {

    private IUserRepository userRepository;

    @Autowired
    public UserManager(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    @Override
    public User findById(Integer userId) {
        return this.userRepository.findById(userId);
    }

    @Override
    @Transactional
    public void add(User user) {
        this.userRepository.add(user);
    }

    @Override
    @Transactional
    public void update(User user) {
        this.userRepository.update(user);

    }

    @Override
    @Transactional
    public void delete(User user) {
        this.userRepository.delete(user);
    }
}
