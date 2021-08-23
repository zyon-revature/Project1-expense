package com.revature.expense.dao;

import com.revature.expense.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TicketDao extends JpaRepository<Ticket, Integer> {
    //Ticket id
    public Ticket findTicketsByTicketNum(int ticketNum);
    @Query(value = "select * from tickets t where t.ticketnumber = ?1", nativeQuery = true)
    public List<Ticket> findByEmployeeID(int empId);
    @Query(value = "select * from tickets t where t.tickettype = ?1", nativeQuery = true)
    public List<Ticket> findByTicketType(String ticketType);
}
