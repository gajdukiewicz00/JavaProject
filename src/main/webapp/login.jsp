<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<h1>Login</h1>
<% String error = (String) request.getAttribute("error"); %>
<% if (error != null) { %>
<p style="color:red;"><%= error %></p>
<% } %>
<form action="login" method="post">
    Username: <input type="text" name="username" required /><br />
    Password: <input type="password" name="password" required /><br />
    <input type="submit" value="Login" />
</form>
</body>
</html>
