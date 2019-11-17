<%-- 
    Document   : Couse
    Created on : Nov 17, 2019, 3:00:16 PM
    Author     : JJ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Course</title>
    </head>
    <body>
        <h1>Course</h1>
        <h2>${sessionScope.student.fullname}</h2>
        <hr>
        <a href="Science.jsp">Science Subject</a>
        <br>
        <a href="Mathematics.jsp">Math Subject</a>
        <br>
        <a href="Thai.jsp">Thai Subject</a>
        <br>
        <a href="English.jsp">English Subject</a>
        <br>
        <a href="SocialStudies.jsp">Social Studies Subject</a>
    </body>
</html>
