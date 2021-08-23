package com.revature.expense.model;


import javax.persistence.*;

@Entity
@Table(name="employeelogin")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_generator")
    @SequenceGenerator(name = "id_generator", sequenceName = "tickets_ticketnumber_seq", allocationSize = 1)
    @Column
    private int employeeid;
    @Column
    private String username;
    @Column
    private String address;
    @Column
    private String city;
    @Column
    private String userpassword;
    @Column
    private boolean manager;

    public User(){
        super();
    }

    public User(String username, String address, String city, String userpassword, boolean manager) {
        this.username = username;
        this.address = address;
        this.city = city;
        this.userpassword = userpassword;
        this.manager = manager;
    }

    public User(int employeeid, String username, String address, String city, String userpassword, boolean manager) {
        this.employeeid = employeeid;
        this.username = username;
        this.address = address;
        this.city = city;
        this.userpassword = userpassword;
        this.manager = manager;
    }

    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public boolean isManager() {
        return manager;
    }

    public void setManager(boolean manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
