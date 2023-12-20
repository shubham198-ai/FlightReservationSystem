package com.example.FlightReservationSystem.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FlightReservationSystem.dto.RequestReservation;
import com.example.FlightReservationSystem.entity.Flight;
import com.example.FlightReservationSystem.entity.Passenger;
import com.example.FlightReservationSystem.entity.Reservation;
import com.example.FlightReservationSystem.repository.FlightRepo;
import com.example.FlightReservationSystem.repository.PassengerRepo;
import com.example.FlightReservationSystem.repository.ReservationRepo;
@Service
public class ReservationServiceImpl implements ReservationService {
	@Autowired
	private FlightRepo flightRepo;
	@Autowired
	private PassengerRepo passengerRepo;
	@Autowired
	private ReservationRepo reservationRepo;

	@Override
	public Reservation bookFlight(RequestReservation request) {
		
		  long flightId=request.getFlightId();
	        Optional<Flight> findById = flightRepo.findById(flightId);
	        Flight flight = findById.get();
	        
		        Passenger passenger = new Passenger();
		        passenger.setFirstName(request.getFirstName());
		        passenger.setMiddleName(request.getMiddleName());
		        passenger.setLastName(request.getLastName());
		        passenger.setEmail(request.getEmail());
		        passenger.setPhone(request.getPhone());
		        passengerRepo.save(passenger);
		   
		        Reservation reservation = new Reservation();
		        reservation.setFlight(flight);
		        reservation.setPassenger(passenger);
		        reservation.setCheckedIn(false);
		        reservation.setNumberOfBags(0);

		        reservationRepo.save(reservation);
		        return reservation;
		   
	}
}