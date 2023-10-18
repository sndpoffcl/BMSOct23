package com.scaler.BookMyShowOct23.models;

import com.scaler.BookMyShowOct23.models.constants.AuditoriumFeature;
import com.scaler.BookMyShowOct23.models.constants.BaseModel;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Auditorium extends BaseModel {
    private String name;
    private int capacity;
    @OneToMany
    private List<Show> shows;
    @OneToMany
    private List<Seat> seats;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<AuditoriumFeature> auditoriumFeatures;

}
