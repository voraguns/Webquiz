<%-- 
    Document   : InsertQuiz
    Created on : Nov 24, 2019, 4:02:08 PM
    Author     : USER
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
        
        <title>JSP Page</title>
    </head>
    <body>
    <body style="background-color: lavender">
        <nav class="navbar navbar-light bg-dark">
            <a class="navbar-brand" href="Webquiz" style="color: whitesmoke">
                <img src="https://getbootstrap.com/docs/4.3/assets/brand/bootstrap-solid.svg" width="30" height="30" class="d-inline-block align-top" alt="">       
                <B>Webquiz</B>
            </a>
        </nav>

        <nav class="navbar navbar-light bg-dark">
            <a href="TeacherFunction.jsp"><h3 style="color: wheat">Function List</h3></a>
        </nav>
        <nav class="navbar navbar-light bg-dark">
            <h3 style="color: lightgrey">Welcome Teacher : ${teacher.fullname}</h3>
        </nav>
        <table   width="100%" style="text-align: center;border-style: ridge ;background-color: whitesmoke">
            <th><a href="InsertQuiz">Insert your Quiz</a></th>
        </table>

        <h4 style="color: red">${smg}</h4>

        <form method="post" action="InsertQuiz">
            <table border="2" width="75%" style="text-align: center;background-color: #5c8484;color: white;">
                <tr style="background-color: #006c6c">
                    <th><b>List</b></th>
                    <th><b>Insert your data</b></th>
                </tr>
                <tr>
                    <td><b>Subject ID</b></td>
                    <td><input type="text" name="subjectid"size="50" style="background-color: #afc7c7"/></td>
                </tr>
                <tr>
                    <td><b>Quiz ID</b></td>
                    <td><input type="text" name="quizid"size="50"style="background-color: #afc7c7"/></td>
                </tr>
                <tr>
                    <td><b>Question</b></td>
                    <td><input type="text" name="question"size="50"style="background-color: #afc7c7"/></td>
                </tr>
                <tr>
                    <td><b>Choice 1</b></td>
                    <td><input type="text" name="choicea" size="50" style="height: 100px;background-color: #afc7c7"/></td>
                </tr>
                <tr>
                    <td><b>Choice 2</b></td>
                    <td><input type="text" name="choiceb"size="50" style="height: 100px;background-color: #afc7c7"/></td>
                </tr>
                <tr>
                    <td><b>Choice 3</b></td>
                    <td><input type="text" name="choicec"size="50" style="height: 100px;background-color: #afc7c7"/></td>
                </tr>
                <tr>
                    <td><b>Choice 4</b></td>
                    <td><input type="text" name="choiced"size="50" style="height: 100px;background-color: #afc7c7"/></td>
                </tr>
                <tr>
                    <td><b>Answer</b></td>
                    <td><input type="text" name="answer"size="50"style="background-color: #afc7c7"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Update"style="background-color: #afc7c7"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>

