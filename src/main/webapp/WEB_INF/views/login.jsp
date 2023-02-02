<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
    <title>Hello...</title>
</head>
<body>
<%
Date date = new Date();
%>
<div>Current date is <%=date%> </div>
My First JSP ${name} and ${password}
<form action="/login.do" method="post">
    Enter your name <input type="text" name="name"/> <input type="submit"/>

</form>
</body>
</html>