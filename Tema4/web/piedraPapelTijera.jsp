<%-- 
    Document   : piedraPapelTijera
    Created on : 9 feb. 2022, 21:21:37
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
     <%
                
                String email = getServletContext().getInitParameter("email");
                out.println("<br>try:" + request.getAttribute("result"));
        %>
    <form method="post" action="play">
        <p>Selecciona </p>
        Color:
        <select name="ppt" size="1">
            <option value="0"> piedra </option>
            <option value="1"> papel </option><!---->
            <option value="2"> tijera </option>
        </select>
        <input type="submit">
    </form>
</html>
