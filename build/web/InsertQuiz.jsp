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
        <title>JSP Page</title>
    </head>
    <body>
        <h4 style="color: red">${smg}</h4>
        <h1>Insert Quiz</h1>
        <hr>
        <form method="post" action="InsertQuiz">
            <a href="TeacherFunction.jsp">Return to menu</a>
            <table>
                <tr>
                    <td>Subject ID</td>
                    <td><input type="text" name="subjectid"/></td>
                </tr>
                <tr>
                    <td>Quiz ID</td>
                    <td><input type="text" name="quizid"/></td>
                </tr>
                <tr>
                    <td>Question</td>
                    <td><input type="text" name="question"/></td>
                </tr>
                <tr>
                    <td>Choice 1</td>
                    <td><input type="text" name="choicea"/></td>
                </tr>
                <tr>
                    <td>Choice 2</td>
                    <td><input type="text" name="choiceb"/></td>
                </tr>
                <tr>
                    <td>Choice 3</td>
                    <td><input type="text" name="choicec"/></td>
                </tr>
                <tr>
                    <td>Choice 4</td>
                    <td><input type="text" name="choiced"/></td>
                </tr>
                <tr>
                    <td>Answer</td>
                    <td><input type="text" name="answer"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Update"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>

