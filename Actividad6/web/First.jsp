<%-- 
    Document   : First
    Created on : 9 mar. 2022, 19:56:43
    Author     : PC
--%>

<%@page import="java.util.*"%>
<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!
            String miCadena = "Esto es una cadena a convertir";
            String fecha = new Date().toString();
            int operacion = 3+4;
         %>
         <%
             String rr = new Math.Random().toString();
         %>

        <h1>Hello World!</h1>
        <%= fecha%>
        <br>
        <%= miCadena.toUpperCase() %>
        <br>
        <%= operacion%>
        <br>
        <%= rr%>
    </body>
</html>
