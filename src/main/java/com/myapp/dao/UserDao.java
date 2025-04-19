package com.myapp.dao;

import com.myapp.model.User;

import java.util.List;

public interface UserDao {
    List<User> findAll();
    User findById(Long id);
    void save(User user);
    void update(User user);
    void delete(Long id);
}