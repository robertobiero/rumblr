<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<%@ page session="false" %>
<html>
<head>
    <title>Spittr</title>
</head>
<body>
<h1>Register</h1>
<sf:form method="POST" modelAttribute="user">
    user id: <sf:input path="userId" /><sf:errors path="userId" cssClass="error"/><br/>
    First Name: <sf:input path="firstName" /><sf:errors path="firstName" cssClass="error"/><br/>
    Last Name: <sf:input path="lastName" /> <sf:errors path="lastName" /><br/>
    Email: <sf:input path="email" /> <sf:errors path="email"/><br/>
    Username: <sf:input path="username" /> <sf:errors path="username"/><br/>
    Password: <sf:password path="password" /><sf:errors path="password"/><br/>
    Phone: <sf:input path="phone" /><sf:errors path="phone"/><br/>
    <input type="submit" value="Register" />
</sf:form>
</body>
</html>