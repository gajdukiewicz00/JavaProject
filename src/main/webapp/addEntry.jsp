<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Phonebook Entry</title>
</head>
<body>
<h1>Add Phonebook Entry</h1>
<form action="addEntry" method="post">
    Last Name: <input type="text" name="lastname" required /><br />
    Phone Number: <input type="text" name="phone" required /><br />
    <input type="submit" value="Add Entry" />
</form>
<a href="phonebook.jsp">View Phonebook</a>
</body>
</html>
