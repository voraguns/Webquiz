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
        <h2>Thai</h2>
        <h4 style="color: red">${smg}</h4>
        <form action="Thai" method="post" >
            
            <a href="SubjectList">Return to subject</a><hr>
            <c:forEach items='${Quiz}' var='q' varStatus="i">
               <%--<c:forEach items='${Quiz}' var='q'>--%>
                <h3>${q.getQuestion()}?</h3>
                <div class="answer">
                    <label><input type="radio" name="answer${i.index}" value="a"/>A. ${q.getChoicea()} </label>
                <br>
                <label><input type="radio" name="answer${i.index}" value="b"/>B. ${q.getChoiceb()} </label>
                <br>
                <label><input type="radio" name="answer${i.index}" value="c"/>C. ${q.getChoicec()} </label>
                <br>
                <label><input type="radio" name="answer${i.index}" value="d"/>D. ${q.getChoiced()} </label>
                <hr>
                </div>
                
            </c:forEach>
                <input type="submit" value="Submit"/>
        </form>
    </body>
</html>
