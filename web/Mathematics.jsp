<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Do Quizs</h1>
        <h2>Mathematics</h2>
        <h4 style="color: red">${smg}</h4>
        <form method="post" action="Mathematics">
            <a href="SubjectList.jsp">Return to subject</a><hr>
            <c:forEach items='${Quiz}' var='q'>
                <h3>${q.getQuestion()}?</h3>
                <div class="answer">
                <label><input type="radio" name="choicea"/>A. ${q.getChoicea()} </label>
                <br>
                <label><input type="radio" name="choiceb"/>B. ${q.getChoiceb()} </label>
                <br>
                <label><input type="radio" name="choicec"/>C. ${q.getChoicec()} </label>
                <br>
                <label><input type="radio" name="choiced"/>D. ${q.getChoiced()} </label>
                <hr>
                </div>
            </c:forEach>
                <input type="submit" value="Submit"/>
        </form>
    </body>
</html>
