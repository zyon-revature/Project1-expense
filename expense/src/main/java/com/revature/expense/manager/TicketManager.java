package com.revature.expense.manager;

import com.revature.expense.model.Ticket;


import java.util.List;

public interface TicketManager {
    Ticket create(Ticket t);
    public List<Ticket> findAll();
    Ticket findById(int id);
    List<Ticket> findByEmployee(int id);
}
