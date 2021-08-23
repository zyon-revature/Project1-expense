package com.revature.expense.controller;

import com.revature.expense.manager.TicketManager;
import com.revature.expense.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/tickets")
public class TicketController {

    @Autowired
    private TicketManager manager;

    @PostMapping(consumes = "application/json", produces = "application/json")
    public Ticket create(@RequestBody Ticket t) {
        return manager.create(t);
    }

    @GetMapping(produces = "application/json")
    public List<Ticket> findAll() {
        return manager.findAll();
    }

    @GetMapping(path="/{id}", produces = "application/json")
    public List<Ticket> getEmployeeTickets(@PathVariable int id){
        return manager.findByEmployee(id);
    }

    @GetMapping(path="/ticket/{id}", produces = "application/json")
    public Ticket getTicket(@PathVariable int id){
        return manager.findById(id);
    }
}
