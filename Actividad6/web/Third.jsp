<%-- 
    Document   : Third
    Created on : 9 mar. 2022, 20:23:08
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
        <form action="Third.jsp" method="post">
            <input type="text" name="number">
            <input type="submit" value="Calcular">
            <%
                out.print(request.getParameter("number"));
                    if(request.getParameter("number")!= null){
                        
                        int i, fact = 1;
                        int number = Integer.parseInt(request.getParameter("number"));
                        for (i = 1; i <= number; i++) {
                            fact = fact * i;
                        }

                        out.print("Factorial of "+number+" is: "+fact);
                    }
                        %>
        </form>
    </body>
</html>
