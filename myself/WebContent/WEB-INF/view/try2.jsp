<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
<head>
<title>Hello Myself
</title>
</head>
<Body bgcolor="yellow"><h2></h2>


	<h2>	You have been checked succesfully : </h2>
		<center>
		<br>
		First name : ${tryattri.tryfname} <br>
		Last name :${tryattri.trylname}
		<br>
		
		<h2><a href="/myself">Home</a></h2>
</center>

</Body>
</html>