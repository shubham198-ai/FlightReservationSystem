package com.example.FlightReservationSystem.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.FlightReservationSystem.dto.RequestReservation;
import com.example.FlightReservationSystem.entity.Flight;
import com.example.FlightReservationSystem.entity.Reservation;
import com.example.FlightReservationSystem.repository.FlightRepo;
import com.example.FlightReservationSystem.service.ReservationService;
import com.example.FlightReservationSystem.utilities.EmailUtility;
import com.example.FlightReservationSystem.utilities.PDFgenerator;

@Controller
public class ReservationController {
	private static String filePath="E:\\javaProject\\FlightReservationSystem\\FlightReservationSystem-1\\ticket\\booking";
	@Autowired
	private ReservationService reservationService;
	@Autowired
	private EmailUtility emailUtil;
	@Autowired
	private FlightRepo flightRepo;
@RequestMapping("/confirmReservation")
public String confirmReservation(RequestReservation request,ModelMap modelMap) {
	//System.out.println(reservation.getCardNumber());
	Reservation reservationId = reservationService.bookFlight(request);
	PDFgenerator pdf = new PDFgenerator();
	pdf.generatePDF(filePath+reservationId.getId()+".pdf", reservationId.getPassenger().getFirstName(),reservationId.getPassenger().getEmail(),reservationId.getPassenger().getPhone(),reservationId.getFlight().getOperatingAirlines(),reservationId.getFlight().getDateOfDeparture(),reservationId.getFlight().getArrivalCity(),reservationId.getFlight().getDepartureCity());
	//EmailUtility util = new EmailUtility();
	String attachment = filePath+reservationId.getId()+".pdf";
	emailUtil.sendItinerary(request.getEmail(), attachment);
	modelMap.addAttribute("reservationId",reservationId.getId() );
		return "confirmReservation";
	}

}
