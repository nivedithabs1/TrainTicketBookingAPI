package com.TrainTicketBooking.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.trainbooking.model.Ticket;
import com.example.trainbooking.repository.TicketRepository;

@RestController
public class TicketController {
    @Autowired
    private TicketRepository ticketRepository;

    @PostMapping("/api/tickets")
    public Ticket purchaseTicket(@RequestBody Ticket ticket) {
        // Here you can add logic to allocate seat based on section (A or B)
        // For simplicity, let's assume the section is passed in the request or randomly assigned
        // You can also validate the ticket data before saving

        return ticketRepository.save(ticket);
    }
}
