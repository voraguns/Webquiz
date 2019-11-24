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
        <title>Subject</title>
    </head>
    
    <body>
        <nav class="navbar navbar-light bg-light">
            <a class="navbar-brand" href="Webquiz">
                <img src="https://getbootstrap.com/docs/4.3/assets/brand/bootstrap-solid.svg" width="30" height="30" class="d-inline-block align-top" alt="">
            </a>
            <h1>Subject List</h1>
                <span class="navbar-text">
                    Welcome : ${user.fullname}
                </span>
        </nav>
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
