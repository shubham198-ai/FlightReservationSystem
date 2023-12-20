package com.example.FlightReservationSystem.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.FlightReservationSystem.dto.ReservationUpdateRequest;
import com.example.FlightReservationSystem.entity.Reservation;
import com.example.FlightReservationSystem.repository.ReservationRepo;

@RestController
public class ReservationRestController {
@Autowired
private ReservationRepo reservationRepo;
private Optional<Reservation>findById;
@GetMapping("/reservation/{id}")
public Reservation findReservation(@PathVariable Long id) {
	 findById = reservationRepo.findById(id);
	Reservation reservation = findById.get();
	return reservation;
}
@PostMapping("/reservation")
public Reservation updateReservation(@RequestBody ReservationUpdateRequest request) {
	Optional<Reservation> findById = reservationRepo.findById(request.getId());
	Reservation reservation = findById.get();
	reservation.setCheckedIn(request.isCheckedIn());
	reservation.setNumberOfBags(request.getNumberOfBags());
	return reservationRepo.save(reservation);
}
}