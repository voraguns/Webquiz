package model;

import connection.BuildConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class QuizDao {

    public String quizList(Quiz quizs) {
        int quizid = quizs.getQuizid();
        String question = quizs.getQuestion();
        String choicea = quizs.getChoicea();
        String choiceb = quizs.getChoiceb();
        String choicec = quizs.getChoicec();
        String choiced = quizs.getChoiced();
        String answer = quizs.getAnswer();

        Connection c = null;
        PreparedStatement pstm = null;

        try {
            c = BuildConnection.getConnection();
            String sql = "INSERT INTO QUIZ (quizid,question,choicea,choiceb,choicec,choiced,answer) VALUES (?,?,?,?,?,?,?)";
            pstm = c.prepareStatement(sql);
            pstm.setInt(1, quizid);
            pstm.setString(2, question);
            pstm.setString(3, choicea);
            pstm.setString(4, choiceb);
            pstm.setString(5, choicec);
            pstm.setString(6, choiced);
            pstm.setString(7, answer);

            int i = pstm.executeUpdate();
            if (i != 0) {
                return "Success";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Something went wrong";
    }

    public int insertQuiz(int quizid, String question, String choicea, String choiceb, String choicec, String choiced, String answer) {
        Connection c = BuildConnection.getConnection();
        int status = -1;
        try {
            String sql = "INSERT INTO QUIZ (quizid,question,choicea,choiceb,choicec,choiced,answer) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement pstm = c.prepareStatement(sql);
            pstm.setInt(1, quizid);
            pstm.setString(2, question);
            pstm.setString(3, choicea);
            pstm.setString(4, choiceb);
            pstm.setString(5, choicec);
            pstm.setString(6, choiced);
            pstm.setString(7, answer);

            status = pstm.executeUpdate();
            c.commit();
            c.close();
        } catch (SQLException e) {
            Logger.getLogger(QuizDao.class.getName()).log(Level.SEVERE, null, e);
        }
        return status;
    }

}
