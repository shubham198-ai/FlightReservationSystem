package com.example.FlightReservationSystem.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Reservation extends AbstractEntity{
private boolean checkedIn;
private int numberOfBags;
@OneToOne
private Passenger passenger;
@OneToOne
private Flight flight;


}
