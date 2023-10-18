package com.scaler.BookMyShowOct23.models;

import com.scaler.BookMyShowOct23.models.constants.BaseModel;
import com.scaler.BookMyShowOct23.models.constants.MovieFeature;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Movie extends BaseModel {
    private String name;
    private String description;
    private String language;
    @ManyToMany
    private List<Actor> actors;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<MovieFeature> movieFeatures;

}
