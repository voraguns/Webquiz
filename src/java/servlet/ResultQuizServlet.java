package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Quiz;
import model.controller.QuizController;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ResultQuizServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        System.out.println("111111111111");
        getServletContext().getRequestDispatcher("/ResultQuiz.jsp").forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter pw = response.getWriter();
        response.setContentType("text/html");
//        Quiz q = new Quiz();
//        QuizController qc = new QuizController();
//         Arraylist <Quiz> ary = new Quiz();
//        ary = qc.getResultBySubjectId(0)
//        ArrayList<Quiz> quizs = null;
//        String[] answer = request.getParameterValues("answer");
//        Map m = request.getParameterMap();
//        Set s = m.entrySet();
//        Iterator r = s.iterator();
//        while(r.hasNext()){
//            Map.Entry<String,String[]>entry = (Map.Entry<String,String[]>)r.next();
//            String key = entry.getKey();
//            String[] value = entry.getValue();
//            pw.println("Key is "+key+"<br>");
//            if(value.length>1){
//                for(int i = 0; i < value.length;i++){
//                    
//                    if(value.equals(q.getAnswer())){
//                        int score = 0;
//                        score++;
//                    }
////                    pw.println("");
//                }
//            }else
//                pw.println();
//        }
//        System.out.println(answer);
//        quizdao.insertQuiz(Integer.valueOf(quizid), question, choicea, choiceb, choicec, choiced, answer, Integer.valueOf(subjectid));
//        try {
//            int score = 0;
//
//            PrintWriter writer = response.getWriter();
//            response.setContentType("text/html");
//            if (answer.equals(q.getAnswer())) {
//                score++;
//                System.out.println("Your score is : " + score);
//
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
