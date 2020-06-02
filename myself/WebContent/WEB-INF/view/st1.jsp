<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML>
<html>
<head>
<title>Hello Myself
</title>
</head>
<Body bgcolor="pink"><h2></h2>
<form:form action="processform" modelAttribute="studentattri">
 First name : <form:input path="entefirstname"/>
 <br>
 Last name : <form:input path="entelastname"/>
 <br>
 
 Select your country: <form:select path="country">
   					 <form:options items="${studentattri.countryOptions }"/>
  		    </form:select>
  		    <br>
  		    <br>
  		   Java <form:radiobutton path="entecourse" value="Java"/>
  		    <br>
  		    Python <form:radiobutton path="entecourse" value="Python"/>
  		     <br>
  		  Kotlin <form:radiobutton path="entecourse" value="Kotlin"/>
  		  <br>
  		  <br>
 Music : 		  <form:checkbox path="entecourses" value="Music"/>
  		   <br>
 Cooking  		  <form:checkbox path="entecourses" value="Cooking"/>
  		   <br>
  Movies		  <form:checkbox path="entecourses" value="Movies"/>
  <br>
  		    
 
 <button type="Submit">Submit</button>
</form:form>


</Body>
</html>