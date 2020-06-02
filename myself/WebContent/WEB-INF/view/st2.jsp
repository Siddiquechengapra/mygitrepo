<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
<head>
<title>Hello Myself
</title>
</head>
<Body bgcolor="Orange"><h2></h2>
You have been registered succesfully : ${studentattri.entefirstname} ${studentattri.entelastname}
<br>
<br>
<div>

Your country is : ${studentattri.country}
<br>
Your course name is :${studentattri.entecourse}
<br>
</div>
<div>
  <ul>

      <c:forEach var="temp" items="${studentattri.entecourses}">
      <li>
      			${temp}
      </li>
      </c:forEach>
  
  </ul>
  </div>
</Body>
</html>