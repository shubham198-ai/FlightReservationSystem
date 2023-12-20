package com.example.FlightReservationSystem.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Passenger extends AbstractEntity{
private String firstName;
private String middleName;
private String lastName;
private String email;
private String phone;

}
