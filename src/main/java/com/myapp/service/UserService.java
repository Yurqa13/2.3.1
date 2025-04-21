package com.myapp.service;

import com.myapp.model.User;
import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    void createUser(String name, int age, String email);
    void updateUser(Long id, String name, int age, String email);
    void deleteUser(Long id);
}
