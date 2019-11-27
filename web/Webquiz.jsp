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
    <body style="background-color: lavender">
        <!-- Image and text -->
        <nav class="navbar navbar-light bg-dark">
            <a class="navbar-brand" href="Webquiz" style="color: whitesmoke">
                <img src="https://getbootstrap.com/docs/4.3/assets/brand/bootstrap-solid.svg" width="30" height="30" class="d-inline-block align-top" alt="">
                Webquiz
            </a>
            <c:if test="${student != null && teacher == null}">
                <span class="navbar-text" style="color: whitesmoke">
                    Welcome : ${student.firstname} ${student.lastname}
                    <a href="Logout" class="btn btn-danger btn-lg active" role="button" aria-pressed="true">Log out</a>
                </span>
            </c:if>
            <c:if test="${teacher != null && student == null}">
                <span class="navbar-text" style="color: whitesmoke">
                    Welcome : ${teacher.fullname}
                    <a href="Logout" class="btn btn-danger btn-lg active" role="button" aria-pressed="true">Log out</a>
                </span>
            </c:if>
            <c:if test="${student != null && teacher != null}">
                <c:if test="${student != null}">
                    <span class="navbar-text" style="color: whitesmoke">
                        Welcome : ${student.firstname} ${student.lastname}
                        <a href="Logout" class="btn btn-danger btn-lg active" role="button" aria-pressed="true">Log out</a>
                    </span>
                </c:if>
            </c:if>

        </nav>

        <div class="jumbotron" style="align-items: center" >
            <div class="container" style="color: teal ;background-color: gainsboro;border-style: double" >
                <br>
                <br>
                <h1 class="display-3">Hello, Everybody!</h1>
                <br>
                <p>This is a template for education to create and do a exam website.
                    <br>It makes for teacher and student in school. 
                    <br>Use it as a starting point to create something more unique.</p>
                    <c:if test="${student == null && teacher == null}">
                    <br>
                    <p><a class="btn btn-primary btn-lg" href="LoginStudent" role="button" style="background-color: lightblue;color: black">Sign in (Student)&raquo;</a>
                        <a class="btn btn-primary btn-lg" href="LoginTeacher" role="button" style="background-color: lightblue;color: black">Sign in (Teacher) &raquo;</a>
                        <a class="btn btn-primary btn-lg" href="Signup" role="button" style="background-color: lightblue;color: black">Sign up &raquo;</a>
                    </p>
                    <br>
                </c:if>
                <c:if test="${student != null && teacher == null}">
                    <br>
                    <p>
                        <a class="btn btn-primary btn-lg" href="SubjectList" role="button" style="background-color: lightblue;color: black">Start Exam &raquo;</a>
                    </p>
                    <br>                   
                </c:if>
                <c:if test="${teacher != null && student == null}">
                    <br>
                    <p>
                        <a class="btn btn-primary btn-lg" href="TeacherFunction" role="button" style="background-color: lightblue;color: black">Create Exam &raquo;</a>
                    </p>
                    <br>                   
                </c:if>
                <c:if test="${teacher != null && student != null}">
                    <br>
                    <p>
                        <a class="btn btn-primary btn-lg" href="SubjectList" role="button" style="background-color: lightblue;color: black">Start Exam &raquo;</a>
                    </p>
                    <br> 
                </c:if>

            </div>
        </div>

    </body>
</html>
