package com.scaler.BookMyShowOct23.models;

import com.scaler.BookMyShowOct23.models.constants.BaseModel;
import com.scaler.BookMyShowOct23.models.constants.PaymentMethod;
import com.scaler.BookMyShowOct23.models.constants.Status;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
public class Payment extends BaseModel {
    private LocalDateTime paymentTime;
    private double amount;
    private String referenceId;
    @Enumerated(EnumType.STRING)
    private Status status;
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;
    @ManyToOne
    private Ticket ticket;
}

//TODO : Create the models for multi-transaction payment

/*
    Multi-Transaction payment
        Transaction class
        @OneToMany
        List<Transaction> inside payment class



    Ticket Payment
    1      M
    1       1
 */