<%-- 
    Document   : Webquiz
    Created on : Nov 15, 2019, 6:56:31 AM
    Author     : GunPc
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
        <title>Webquiz</title>
    </head>
    <body>
        <!-- Image and text -->
        <nav class="navbar navbar-light bg-light">
            <a class="navbar-brand" href="Webquiz">
                <img src="https://getbootstrap.com/docs/4.3/assets/brand/bootstrap-solid.svg" width="30" height="30" class="d-inline-block align-top" alt="">
                Webquiz
            </a>
            <c:if test="${user != null}">
                <span class="navbar-text">
                    Welcome : ${user.fullname}
                </span>
            </c:if>
        </nav>

        <div class="jumbotron">
            <div class="container">
                <h1 class="display-3">Hello, Everybody!</h1>
                <p>This is a template for education to create and do a exam website.
                    <br>It makes for teacher and student in school. 
                    <br>Use it as a starting point to create something more unique.</p>
                    <c:if test="${user == null}">
                    <p><a class="btn btn-primary btn-lg" href="Signin" role="button">Sign in &raquo;</a>
                     <a class="btn btn-primary btn-lg" href="Signup" role="button">Sign up &raquo;</a></p>
                    </c:if>
            </div>
        </div>
        
    </body>
</html>
