package com.example.FlightReservationSystem.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReservationUpdateRequest {
	private long id;
	private boolean checkedIn;
	private int numberOfBags;
	
}
