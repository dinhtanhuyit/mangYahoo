<%-- 
    Document   : index
    Created on : Aug 8, 2024, 10:10:33 PM
    Author     : dinht
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP 4444Page</title>
    </head>
    <body>
        <h1>Hello     ssssssssssWorld!</h1>
        <h2>${msg}</h2>
        <ul>
            <c:forEach iteams="${user}" var="u">
                <<li>${u.id} - ${u.userName} - ${u.phone} </li>
            </c:forEach>
        </ul>

    </body>
</html>
