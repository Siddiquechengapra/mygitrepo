<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
<head>
<style>
.myerror{color:red}
</style>
<body bgcolor="orange">
<form:form action="processform" modelAttribute="tryattri">
<center>
<h2>This is the Try Form</h2><br><br>


First name  : <form:input path="tryfname"/><br>
<form:errors path="tryfname" cssClass="myerror"/><br>

Last name :  <form:input path="trylname"/><br>

		<form:errors path="trylname" cssClass="myerror"/>


<br>
<input type="Submit" value="Check"/>
</center>

</form:form>

</body></head></html>