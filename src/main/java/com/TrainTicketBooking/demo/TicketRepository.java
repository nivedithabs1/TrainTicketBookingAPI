package com.TrainTicketBooking.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.TrainTicketBooking.model.ticket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
    // You can add custom repository methods here if needed
}