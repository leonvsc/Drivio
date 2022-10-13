package nl.avans.drivio.repository;

import nl.avans.drivio.model.User;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class UserRepository implements IUserRepository {

    private final EntityManager entityManager;

    @Autowired
    public UserRepository(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<User> findAll() {
        Session session = entityManager.unwrap(Session.class);
        List<User> users = session.createQuery("from User", User.class).getResultList();
        session.close();
        return users;
    }

    @Override
    public User findById(Integer userId) {
        return entityManager.find(User.class, userId);
    }

    @Override
    @Transactional
    public void add(User user) {
        Session session = entityManager.unwrap(Session.class);
        session.save(user);
//        session.close();
    }

    @Override
    @Transactional
    public void update(User user) {
        Session session = entityManager.unwrap(Session.class);
        session.update(user);
        session.close();
    }

    @Override
    @Transactional
    public void delete(User user) {
        Session session = entityManager.unwrap(Session.class);
        User deleteUser = session.get(User.class, user.getUserId());
        session.delete(deleteUser);
        session.close();
    }
}
