package com.revature.expense.dao;

import com.revature.expense.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserDao extends JpaRepository<User, Integer> {
    @Query(value = "select * from employeelogin e where e.manager = true", nativeQuery = true)
    public List<User> findManagers();

    @Query(value = "select * from employeelogin e where e.manager = false", nativeQuery = true)
    public List<User> findEmployees();

    public User findByUsernameAndUserpassword( String username, String password);
}
