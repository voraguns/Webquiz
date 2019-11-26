package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Quiz;
import model.controller.QuizController;
import java.util.ArrayList;

public class ResultQuizServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        getServletContext().getRequestDispatcher("ResultQuiz.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                processRequest(request, response);

        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Quiz q = new Quiz();
        QuizController qc = new QuizController();
        ArrayList<Quiz> quizs = null;
        quizs = qc.listQuizEng();
//        quizdao.insertQuiz(Integer.valueOf(quizid), question, choicea, choiceb, choicec, choiced, answer, Integer.valueOf(subjectid));
        
try {
            String choicea = request.getParameter("choicea");
            String choiceb = request.getParameter("choiceb");
            String choicec = request.getParameter("choicec");
            String choiced = request.getParameter("choiced");
            
            PrintWriter writer = response.getWriter();
            response.setContentType("text/html");
           writer.println("Your score is : ");
           
//           String score = (choicea.equals(q.getAnswer())?);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
