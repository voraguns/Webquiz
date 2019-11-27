package servlet;

import connection.BuildConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Quiz;
import model.controller.QuizController;

public class ThaiServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        getServletContext().getRequestDispatcher("/Thai.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String[] answer = request.getParameterValues("answer");
        
        QuizController qc = new QuizController();
        ArrayList<Quiz> quizs = null;
        try {
            quizs = qc.listQuizThai();
            qc.findByAnswer(answer);
        } catch (Exception e) {
            e.printStackTrace();
        }
        request.setAttribute("Quiz", quizs);
        request.getRequestDispatcher("/Thai.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        processRequest(request, response);
        request.getRequestDispatcher("/ResultQuiz.jsp").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
