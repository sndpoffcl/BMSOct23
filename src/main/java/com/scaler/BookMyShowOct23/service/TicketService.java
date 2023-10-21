package com.scaler.BookMyShowOct23.service;

import com.scaler.BookMyShowOct23.exception.ShowSeatAlreadyBookedException;
import com.scaler.BookMyShowOct23.models.ShowSeat;
import com.scaler.BookMyShowOct23.models.Ticket;
import com.scaler.BookMyShowOct23.models.User;

import java.util.List;

public interface TicketService {
    Ticket bookTicket(List<Integer> showSeatIds, User user) throws ShowSeatAlreadyBookedException;
}
