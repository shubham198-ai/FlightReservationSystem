<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<style>
body{
background-image: url('images/Passenger_Airplanes_Learjet_45_Flight_Clouds_538246_1920x1080.jpg');
 background-size: 100% 100%;
  background-repeat: no-repeat;
  background-attachment: fixed; 
}
</style>
<title>flight</title>
</head>
<body class="text-center">
<h1>Find the Flight Here</h1>

<form action="findFlight" method="post" >
<pre>
From:         <input type="text" name="from"/></br>
To:           <input type="text" name="to"/></br>
Departure date:<input type="text" name="departureDate"/></br>
<input type="Submit" value="search"/>
</pre>
</form>
 <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>
</html>