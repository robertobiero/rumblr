package com.example.rumblr.backend;

import com.example.rumblr.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    @Override
    public User findByUsername(String username) {

        return userDao.findByUsername(username);

    }

    @Override
    public User findByEmail(String email) {
        return userDao.findByEmail(email);

    }

    @Override
    public List<User> findAll() {

        return userDao.findAll();
    }

    public void save(User user){
        userDao.save(user);
    }
}
