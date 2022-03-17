<%-- 
    Document   : index
    Created on : 2 mar. 2022, 20:07:25
    Author     : PC
--%>

<%-- directiva page--%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="com.*" session="false"%>
<%-- directiva taglib--%>
<%-- directiva include--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contador</title>
    </head>
    <body>
        <%!
            public void jspInit() {
                ServletConfig sconfig = getServletConfig();
                String emailAddr = sconfig.getInitParameter("email");
                //alcance aplication getServletContext()
                ServletContext ctx = getServletContext();
                ctx.setAttribute("mail", emailAddr);
            }
        %>
        <%! int count = 0;%>
        <Label>La cuenta es
            <%
                Float two = new Float(22.4);
                pageContext.setAttribute("foo",two);
             
            %>
            <%= ++count%>
            <%= application.getAttribute("mail")%>
            ${applicationScope.mail}
            ${Contador.count}
            <jsp:useBean id="myBeanAttribute" class="com.MyBean" scope="request"/>
            <jsp:getProperty name="myBeanAttribute" property="count"/>
            <jsp:setProperty name="myBeanAttribute" property="count" value="5"/>
        </Label>

    </body>
</html>
