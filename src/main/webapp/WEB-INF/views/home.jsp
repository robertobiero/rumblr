<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <title><h1><s:message code="rumblr.welcome" /></h1></title>
    <link rel="stylesheet"
          type="text/css"
          href="<c:url value="" />" >
</head>
<body>
<h1>Welcome to Spittr</h1>
<a href="<c:url value="/" />">Spittles</a> |
<a href="<c:url value="/" />">Register</a>
</body>
</html>