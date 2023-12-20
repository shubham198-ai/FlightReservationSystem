<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flight detail</title>
<style>
body{
background-image: url('images/Passenger_Airplanes_Learjet_45_Flight_Clouds_538246_1920x1080.jpg');
 background-size: 100% 100%;
  background-repeat: no-repeat;
  background-attachment: fixed; 
}
</style>

</head>
<body>
	<h2>Flight Search Results</h2>

<table border="1">
<tr>
	<tr>
	<th>Airlines</th>
	<th>Departure City</th>
	<th>Arrival City</th>
	<th>Departure Time</th>
	<th>Select Flight</th>
</tr>
<c:forEach items="${flight}" var="findFlight">
	
		<tr>
			<td>${findFlight.operatingAirlines}</td>
			<td>${findFlight.departureCity}</td>
			<td>${findFlight.arrivalCity}</td>
			<td>${findFlight.estimatedDepartureTime}</td>
			<td><a href="showCompleteReservation?flightId=${findFlight.id}">Select</a></td>
			</tr>

</c:forEach>
</table>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>