package com.revature.expense.manager;

import com.revature.expense.dao.UserDao;
import com.revature.expense.model.User;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class UserManagerimpl implements UserManager{


    @Autowired
    private UserDao dao;

    @Override
    public User create(User u) {

        return dao.save(u);
    }

    @Override
//	public List<User> findAll() {
//		return dao.findAll().stream()
//				.collect(Collectors.toList());
//	}
    public List<User> findAll() {
        return StreamSupport.stream(dao.findAll().spliterator(), false)
                .collect(Collectors.toList());
    }

    @Override
    public User findById(int id) {
        return dao.findById(Integer.valueOf(id)).get();
    }

    @Override
    public User login(String username, String password) {
        return dao.findByUsernameAndUserpassword(username, password);
    }
}
