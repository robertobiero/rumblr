package com.example.rumblr.backend;

import com.example.rumblr.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserService {

    User findByUsername(String username);
    User findByEmail(String email);
    List<User> findAll();
    void save(User user);
}
