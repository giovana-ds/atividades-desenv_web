<%-- 
    Document   : Calculadora
    Created on : 19 de out. de 2025, 00:03:29
    Author     : Giovana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Calculadora</title>
    </head>
    <body>
        <%
            int val1 = Integer.parseInt(request.getParameter("val1"));
            int val2 = Integer.parseInt(request.getParameter("val2"));
            int resultado = val1 + val2;
        %>
        <p> Resultado: <%=resultado%>
    </body>
</html>
