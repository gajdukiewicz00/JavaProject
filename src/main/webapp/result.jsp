<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body>
<h1>Result</h1>
<%
    Integer result = (Integer) request.getAttribute("result");
    String error = (String) request.getAttribute("error");
%>
<% if (error != null) { %>
<p style="color:red;"><%= error %></p>
<% } else { %>
<p>The doubled number is: <%= result %></p>
<% } %>
<a href="index.jsp">Back to Home</a>
</body>
</html>
