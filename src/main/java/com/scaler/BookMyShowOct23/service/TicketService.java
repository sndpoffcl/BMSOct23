package com.scaler.BookMyShowOct23.service;

import com.scaler.BookMyShowOct23.exception.ShowSeatAlreadyBookedException;
import com.scaler.BookMyShowOct23.models.ShowSeat;
import com.scaler.BookMyShowOct23.models.Ticket;
import com.scaler.BookMyShowOct23.models.User;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface TicketService {
    @Transactional(isolation = Isolation.SERIALIZABLE)
    Ticket bookTicket(List<Integer> showSeatIds, int userId) throws ShowSeatAlreadyBookedException;
}
