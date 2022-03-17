<%-- 
    Document   : tagtest
    Created on : 16 mar. 2022, 20:31:39
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="my" uri="/WEB-INF/list.tld" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <my:ListTag>
            Hello
        </my:ListTag>
    </body>
</html>
