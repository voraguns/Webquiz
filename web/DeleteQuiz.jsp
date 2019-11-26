<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Delete Quiz</h1>
        <a href="SubjectList.jsp">Return to subject</a><hr>
        <h4 style="color: green">${delete}</h4>
        <form method="post" action="DeleteQuiz">
            Delete Quiz by Quiz ID<br>
            <input type="text" name="quizid"/>
            <input type="submit" value="Delete"/>
            <hr>
        </form>

        <form method="post" action="deleteQuizbySubjectid">
            Delete Quiz by Subject ID<br>
            <input type="text" name="subjectid"/>
            <input type="submit" value="Delete"/>
            <hr>
        </form>
    </body>
</html>
