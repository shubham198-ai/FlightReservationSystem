<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Reserve flight</title>
</head>
<body>
<h2>Flight Details</h2>
	Flight Number: ${flight.flightNumber} <br/>
	Operating Airlines: ${flight.operatingAirlines} <br/>
	Departure City: ${flight.departureCity} <br/>
	Arrival City: ${flight.arrivalCity} <br/>
	Date Of Departure: ${flight.dateOfDeparture} <br/>
	Estimated DepartureTime: ${flight.estimatedDepartureTime} <br/>
	
	<h2>Passenger Details</h2>
	<form action="confirmReservation" method="post">
	<pre>
		First Name<input type="text" name="firstName"/>
		last Name<input type="text" name="lastName"/>
		Middle Name<input type="text" name="middleName"/>
		Email<input type="text" name="email"/>
		Phone<input type="text" name="phone"/>
		<input type="hidden" name="flightId" value="${flight.id}"/>
	<h2>Enter the card details</h2>
	Name Of TheCard<input type="text" name="nameOfThecard"/><br/>
		Card Number<input type="text" name="cardNumber"/><br/>
		CVV<input type="text" name="cvv"/><br/>
		Expiry Date<input type="text"name="expiryDate" /><br/>
		<input type="Submit" value="complete Reservation"/>
	</pre>
	</form>
</body>
</html>
