<%-- 
    Document   : TeacherFunction
    Created on : Nov 24, 2019, 8:46:50 PM
    Author     : JJ
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Teacher Function</title>
    </head>
    <body>
        <nav class="navbar navbar-light bg-light">
            <a class="navbar-brand" href="Webquiz">
                <img src="https://getbootstrap.com/docs/4.3/assets/brand/bootstrap-solid.svg" width="30" height="30" class="d-inline-block align-top" alt="">
                
            </a> 
            <h1>Manage your quiz</h1>       
                <span class="navbar-text">
                    Welcome : ${user.fullname}
                </span>
        </nav>
        <hr>
        <h3>Function List</h3>
        <br>
        <a href="InsertQuiz">Insert your Quiz</a>
    </body>
</html>
