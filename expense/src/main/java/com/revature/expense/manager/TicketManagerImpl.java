package com.revature.expense.manager;

import com.revature.expense.dao.TicketDao;
import com.revature.expense.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class TicketManagerImpl implements TicketManager{

    @Autowired
    private TicketDao dao;

    @Override
    public Ticket create(Ticket t) {
        return dao.save(t);
    }

    @Override
    public List<Ticket> findAll() {
        return StreamSupport.stream(dao.findAll().spliterator(), false).collect(Collectors.toList());
    }

    @Override
    public Ticket findById(int id) {
        return dao.findTicketsByTicketNum(id);
    }

    @Override
    public List<Ticket> findByEmployee(int id) {
        return dao.findByEmployeeID(id);
    }


}
