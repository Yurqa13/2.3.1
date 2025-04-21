package com.myapp.service;

import com.myapp.dao.UserDao;
import com.myapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service

public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Autowired
    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getAllUsers() {
        return userDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public User getUserById(Long id) {
        return userDao.findById(id);
    }

    @Override
    @Transactional
    public void createUser(String name, int age, String email) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        user.setEmail(email);
        userDao.save(user);
    }

    @Override
    @Transactional
    public void updateUser(Long id, String name, int age, String email) {
        User existing = userDao.findById(id);
        if (existing != null) {
            existing.setName(name);
            existing.setAge(age);
            existing.setEmail(email);
            userDao.update(existing);
        }
    }



    @Override
    @Transactional
    public void deleteUser(Long id) {
        userDao.delete(id);
    }
}