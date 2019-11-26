package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Quiz;
import model.controller.QuizController;


public class DeleteQuizServlet extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/DeleteQuiz.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String quizid = request.getParameter("quizid");
        QuizController qc = new QuizController();
//        QuizDao quizdao = new QuizDao();
        if (quizid.isEmpty()) {
            request.setAttribute("delete", "No Information!");
            getServletContext().getRequestDispatcher("/DeleteQuiz.jsp").forward(request, response);
        }
        qc.deleteQuiz(Integer.valueOf(quizid));
        System.out.println("Delete Success(qid)");
        request.setAttribute("delete", "Delete by Quiz ID Success!");
        getServletContext().getRequestDispatcher("/DeleteQuiz.jsp").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

