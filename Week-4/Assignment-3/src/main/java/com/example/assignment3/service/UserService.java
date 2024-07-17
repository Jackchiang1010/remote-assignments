package com.example.assignment3.service;

import com.example.assignment3.dao.UserDao;
import com.example.assignment3.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public Integer createUser(User user) {
        return userDao.createUser(user);
    }

    public User getUserByEmail(String email) {
        return userDao.getUserByEmail(email);
    }

    public User getUserByPassword(String password) {
        return userDao.getUserByPassword(password);
    }

    public User getUserByEmailAndPassword(String email, String password) {
        return userDao.getUserByEmailAndPassword(email, password);
    }

}
