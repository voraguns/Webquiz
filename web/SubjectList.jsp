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
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>

        <title>Subject</title>
    </head>

    <body>
        <nav class="navbar navbar-light bg-light">
            <a class="navbar-brand" href="Webquiz">
                <img src="https://getbootstrap.com/docs/4.3/assets/brand/bootstrap-solid.svg" width="30" height="30" class="d-inline-block align-top" alt="">
                <B>Webquiz</B>
            </a>
            <nav class="navbar navbar-light bg-dark">
                <a href="SubjectList.jsp"><h3 style="color: wheat">Subject List</h3></a>
            </nav>
        </nav>
        <nav class="navbar navbar-light bg-dark">
            <h3 style="color: lightgrey">Welcome : ${student.firstname} ${student.lastname}</h3>
        </nav>
        <table  border="5" width="100%" style="text-align: center;border-style: ridge ;background-color: whitesmoke">
            <th><a href="Thai.jsp"title="Thai" style="color: black">Thai Subject</a></th>
            <th><a href="English.jsp"title="English"style="color: black">English Subject</a></th>
            <th><a href="Science.jsp" title="Science"style="color: black">Science Subject</a></th>
            <th><a href="Mathematics.jsp"title="Math"style="color: black">Math Subject</a></th>
            <th><a href="SocialStudies.jsp"title="Social Studies"style="color: black">Social Studies Subject</a></th>
        </table>
    </body>
</html>
