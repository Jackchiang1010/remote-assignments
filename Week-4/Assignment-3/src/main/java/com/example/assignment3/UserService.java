package com.example.assignment3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService {

    @Autowired
    private UserDao userDao;

    public Integer createUser(User user) {
        return userDao.createUser(user);
    }

    public User getUserByEmail(String email) {
        return userDao.getUserByEmail(email);
    }

}
