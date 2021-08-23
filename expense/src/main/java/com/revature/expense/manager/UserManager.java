package com.revature.expense.manager;

import com.revature.expense.model.User;

import java.util.List;

public interface UserManager {
    User create(User u);
    public List<User> findAll();
    User findById(int id);
    public User login(String username, String password);
}
