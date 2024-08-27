<%-- 
    Document   : index
    Created on : Aug 8, 2024, 10:10:33 PM
    Author     : dinht
--%>
 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP 4444Page</title>
    </head>
    <body>
        <h1>List user : </h1>
        <ul>
    <c:forEach items="${User}" var="u">
        <li>${u.id} - ${u.firstName} - ${u.email}    </li> 
    </c:forEach>
</ul>

    </body>
</html>
