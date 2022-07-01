
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>LIST CONSEILLER</title>
</head>
<body>
<h2>LIST CONSEILLER</h2>
<form name="formconseiller" action="AppServlet">
<table nome="tbconseiller">
  <tr>
    <th>ID</th>
    <th>Name</th>
    <th>FirstName</th>
    <th>DoB</th>
    <th>Salary</th>
    <th>DateCreation</th>
  </tr>
  <tr>
    <td>${id}</td>
    <td>${name}</td>
    <td>${firstName}</td>
    <td>${DoB}</td>
    <td>${salary}</td>
    <td>${dateCreation}</td>
  </tr>
  <tr>
    <td>Centro comercial Moctezuma</td>
    <td>Francisco Chang</td>
    <td>Mexico</td>
  </tr>
</table>


</ul>

</form>
</body>
</html>
