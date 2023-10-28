package com.scaler.BookMyShowOct23.controller;

import com.scaler.BookMyShowOct23.dto.BookTicketRequestDTO;
import com.scaler.BookMyShowOct23.dto.TicketResponseDTO;
import com.scaler.BookMyShowOct23.exception.ShowSeatAlreadyBookedException;
import com.scaler.BookMyShowOct23.models.Ticket;
import com.scaler.BookMyShowOct23.service.TicketService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class TicketController {

    private TicketService ticketService;

    @PostMapping("/ticket")
    public ResponseEntity createTicket(@RequestBody BookTicketRequestDTO bookTicketRequestDTO) throws ShowSeatAlreadyBookedException {
        //Ticket ticket = ticketService.bookTicket(bookTicketRequestDTO.getShowSeatIds(), bookTicketRequestDTO.getUserId());
        TicketResponseDTO ticket = new TicketResponseDTO();
        ticket.setAuditoriumName("AUDI 01");
        ticket.setMovieName("SUPER COMMANDO DHRUV");
        ticket.setTotalAmount(400);
        ticket.setTimeOfShow(LocalDateTime.now());
        ticket.setSeatNumbers(List.of("A01", "A02"));
        return ResponseEntity.ok(ticket);
    }
}
