package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Quiz;
import model.controller.QuizController;


public class InsertQuizServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/InsertQuiz.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("Quiz id : " + request.getParameter("quizid"));
        System.out.println("Question : " + request.getParameter("question"));
        System.out.println("Choine 1 : " + request.getParameter("choicea"));
        System.out.println("Choine 2 : " + request.getParameter("choiceb"));
        System.out.println("Choine 3 : " + request.getParameter("choicec"));
        System.out.println("Choine 4 : " + request.getParameter("choiced"));
        System.out.println("subjectID : " + request.getParameter("subjectid"));
        System.out.println("Answer: " + request.getParameter("answer"));

        String quizid = request.getParameter("quizid");
        String question = request.getParameter("question");
        String choicea = request.getParameter("choicea");
        String choiceb = request.getParameter("choiceb");
        String choicec = request.getParameter("choicec");
        String choiced = request.getParameter("choiced");
        String answer = request.getParameter("answer");
        String subjectid = request.getParameter("subjectid");

        Quiz q = new Quiz( question, choicea, choiceb, choicec, choiced, answer);
        System.out.println(":: " + q.getQuizid());

        QuizController qc = new QuizController();
        qc.insertQuiz(Integer.valueOf(quizid),question,choicea,choiceb,choicec,choiced,answer,Integer.valueOf(subjectid));
        System.out.println("Insert Success");
        getServletContext().getRequestDispatcher("/InsertQuiz.jsp").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
