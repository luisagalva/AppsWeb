<%-- 
    Document   : Third
    Created on : 9 mar. 2022, 20:23:08
    Author     : PC
--%>
<%@taglib  %>
<%@page import="java.math.BigInteger"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!
            public static int fact(int a) {
                
               int i, fact = 1;
                int number = a;
                for (i = 1; i <= number; i++) {
                    fact = fact * i;
                }
                return fact;
            }
        %>
        <form action="Fourth.jsp" method="post">
            <input type="text" name="number">
            <input type="submit" value="Calcular">
            
            <%
                    if(request.getParameter("number")!= null){
                      out.print(fact(Integer.parseInt(request.getParameter("number"))));
                        
                    }
             %>
            
        </form>
    </body>
</html>
