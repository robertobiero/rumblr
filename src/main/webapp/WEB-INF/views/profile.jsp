<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<html>
<body>
<h1>Your Profile</h1>
<c:out value="${user.username}" /><br/>
<c:out value="${user.firstName}" />
<c:out value="${user.lastName}" />
</body>
</html>