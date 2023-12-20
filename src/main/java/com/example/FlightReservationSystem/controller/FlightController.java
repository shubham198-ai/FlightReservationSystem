package com.example.FlightReservationSystem.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.FlightReservationSystem.entity.Flight;
import com.example.FlightReservationSystem.repository.FlightRepo;

@Controller
public class FlightController {
@Autowired
private FlightRepo flightRepo;

	@RequestMapping("/findFlight")
	public String fingFlight(@RequestParam("from")String from,@RequestParam("to")
	String to,@RequestParam("departureDate")@DateTimeFormat(pattern="MM-dd-yyyy")Date departureDate,ModelMap modelMap) {
		List<Flight>flight=flightRepo.findFlight(from,to,departureDate);
		System.out.println(flight);
		modelMap.addAttribute("flight", flight);
		return "displayFlights";
	}
	@RequestMapping("/showCompleteReservation")
	public String showCompleteReservation (@RequestParam("flightId") Long flightId,ModelMap modelMap) {
		System.out.println(flightId);
		Optional<Flight> findById = flightRepo.findById(flightId);
		Flight flight = findById.get();
		modelMap.addAttribute("flight", flight);
		return "showCompleteReservation";
	}
}
