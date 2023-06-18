<%-- 
    Document   : index
    Created on : 29-Apr-2023, 6:23:58 PM
    Author     : Rohith Rao
--%>

<%@page import="com.mycompany.helper.FactoryProvider"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TCS-home</title>
        <%@include file="components/common_css_js.jsp" %>
    </head>
    <body>
        <%@include file ="components/navbar.jsp" %>
        
        <style>
            body{
                background-image:url('img/campus2.jpg');
                background-repeat: no-repeat;
                background-attachment: fixed;
                background-size: 100% 100%;
            }
        </style>
        <blockquote class="blockquote text-center">
        <h1 class="mb-0">Timetable Consensus Scheduler</h1>
        <footer class="blockquote-footer">OOPS Project<cite title=""></cite></footer>
        </blockquote>
        
        
    </body>
</html>
