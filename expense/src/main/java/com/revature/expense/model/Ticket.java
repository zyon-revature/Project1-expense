package com.revature.expense.model;

import javax.persistence.*;

@Entity
@Table(name="tickets")
public class Ticket {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_generator")
    @SequenceGenerator(name = "id_generator", sequenceName = "tickets_ticketnumber_seq", allocationSize = 1)
    @Column (name = "ticketnumber")
    private int ticketNum;
    @Column (name = "employeeid")
    private int employeeID;
    @Column (name = "tickettype")
    private String ticketType;
    @Column (name = "ticketamount")
    private double ticketVal;
    @Column
    private String description;

    public Ticket() {
    }

    public Ticket(int employeeID, String ticketType, double ticketVal, String description) {
        this.employeeID = employeeID;
        this.ticketType = ticketType;
        this.ticketVal = ticketVal;
        this.description = description;
    }

    public Ticket(int ticketNum, int employeeID, String ticketType, double ticketVal, String description) {
        this.ticketNum = ticketNum;
        this.employeeID = employeeID;
        this.ticketType = ticketType;
        this.ticketVal = ticketVal;
        this.description = description;
    }

    public int getTicketNum() {
        return ticketNum;
    }

    public void setTicketNum(int ticketNum) {
        this.ticketNum = ticketNum;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public double getTicketVal() {
        return ticketVal;
    }

    public void setTicketVal(double ticketVal) {
        this.ticketVal = ticketVal;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
