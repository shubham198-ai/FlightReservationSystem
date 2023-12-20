package com.example.FlightReservationSystem.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RequestReservation {
private long flightId;
private String firstName;
private String lastName;
private String middleName;
private String email;
private String phone;
private String nameOfThecard;
private String cardNumber;
private String cvv;
private String expiryDate;

}
