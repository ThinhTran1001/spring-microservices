package com.thinhtran.bookingservice.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Table(name="accomdation")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Accomodation {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    String id;

    String name;

    Double pricePerNight;

    Double pricePerDay;

    String type;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "location_id", referencedColumnName = "id")
    Location location;



}
