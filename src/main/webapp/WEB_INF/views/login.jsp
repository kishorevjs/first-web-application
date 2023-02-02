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
    <p>${errorMessage}</p>
    Enter your name <input type="text" name="name"/>
                    <input type="password" name="password"/>
                    <input type="submit"/>

</form>
</body>
</html>