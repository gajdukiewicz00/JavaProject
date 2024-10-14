<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Phonebook</title>
</head>
<body>
<h1>Phonebook Entries</h1>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Last Name</th>
        <th>Phone Number</th>
    </tr>
    <c:forEach var="entry" items="${phonebook}">
        <tr>
            <td>${entry.id}</td>
            <td>${entry.lastname}</td>
            <td>${entry.phoneNumber}</td>
        </tr>
    </c:forEach>
</table>
<a href="addEntry.jsp">Add New Entry</a>
<a href="logout">Logout</a>
</body>
</html>
