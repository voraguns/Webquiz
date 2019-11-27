/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.controller;

import connection.BuildConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Quiz;

/**
 *
 * @author GunPc
 */
public class QuizController {
    public String quizList(Quiz quizs) {
        int quizid = quizs.getQuizid();
        String question = quizs.getQuestion();
        String choicea = quizs.getChoicea();
        String choiceb = quizs.getChoiceb();
        String choicec = quizs.getChoicec();
        String choiced = quizs.getChoiced();
        String answer = quizs.getAnswer();
        int subjectid = quizs.getSubjectid();
        Connection c = null;
        PreparedStatement pstm = null;

        try {
            c = BuildConnection.getConnection();
            String sql = "INSERT INTO QUIZ (quizid,question,choicea,choiceb,choicec,choiced,answer,subject) VALUES (?,?,?,?,?,?,?,?)";
            pstm = c.prepareStatement(sql);
            pstm.setInt(1, quizid);
            pstm.setString(2, question);
            pstm.setString(3, choicea);
            pstm.setString(4, choiceb);
            pstm.setString(5, choicec);
            pstm.setString(6, choiced);
            pstm.setString(7, answer);
            pstm.setInt(8, subjectid);

            int i = pstm.executeUpdate();
            if (i != 0) {
                return "Success";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "Something went wrong";
    }

//เพิ่มคำถาม
    public int insertQuiz(int quizid, String question, String choicea, String choiceb, String choicec, String choiced, String answer, int subjectid) {
        Connection c = BuildConnection.getConnection();
        int status = -1;
        try {
            String sql = "INSERT INTO ADMINNA.QUIZ (quizid,question,choicea,choiceb,choicec,choiced,answer,subjectid) VALUES (?,?,?,?,?,?,?,?)";
            PreparedStatement pstm = c.prepareStatement(sql);
            pstm.setInt(1, quizid);
            pstm.setString(2, question);
            pstm.setString(3, choicea);
            pstm.setString(4, choiceb);
            pstm.setString(5, choicec);
            pstm.setString(6, choiced);
            pstm.setString(7, answer);
            pstm.setInt(8, subjectid);

            status = pstm.executeUpdate();
            c.commit();
            c.close();
        } catch (SQLException e) {
            Logger.getLogger(Quiz.class.getName()).log(Level.SEVERE, null, e);
        }
        return status;
    }

// แสดงรายการคำถาม
    public ArrayList<Quiz> listQuizMath() {
        ArrayList<Quiz> ary = new ArrayList<>();
        Connection c = BuildConnection.getConnection();
        String sql = "SELECT * FROM QUIZ WHERE SUBJECTID = 401";
        try {
            PreparedStatement pstm = c.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Quiz quiz = new Quiz(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8));
                ary.add(quiz);
                System.out.println(quiz);
            }
            rs.close();
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(Quiz.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ary;
    }
    public ArrayList<Quiz> listQuizThai() {
        ArrayList<Quiz> ary = new ArrayList<>();
        Connection c = BuildConnection.getConnection();
        String sql = "SELECT * FROM QUIZ WHERE SUBJECTID = 101";
        try {
            PreparedStatement pstm = c.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Quiz quiz = new Quiz(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8));
                ary.add(quiz);
                System.out.println(quiz);
            }
            rs.close();
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(Quiz.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ary;
    }
    public ArrayList<Quiz> listQuizEng() {
        ArrayList<Quiz> ary = new ArrayList<>();
        Connection c = BuildConnection.getConnection();
        String sql = "SELECT * FROM QUIZ WHERE SUBJECTID = 201";
        try {
            PreparedStatement pstm = c.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Quiz quiz = new Quiz(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8));
                ary.add(quiz);
                System.out.println(quiz);
            }
            rs.close();
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(Quiz.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ary;
    }
    public ArrayList<Quiz> listQuizScience() {
        ArrayList<Quiz> ary = new ArrayList<>();
        Connection c = BuildConnection.getConnection();
        String sql = "SELECT * FROM QUIZ WHERE SUBJECTID = 301";
        try {
            PreparedStatement pstm = c.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Quiz quiz = new Quiz(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8));
                ary.add(quiz);
                System.out.println(quiz);
            }
            rs.close();
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(Quiz.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ary;
    }
    public ArrayList<Quiz> listQuizSocial() {
        ArrayList<Quiz> ary = new ArrayList<>();
        Connection c = BuildConnection.getConnection();
        String sql = "SELECT * FROM QUIZ WHERE SUBJECTID = 501";
        try {
            PreparedStatement pstm = c.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Quiz quiz = new Quiz(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getInt(8));
                ary.add(quiz);
                System.out.println(quiz);
            }
            rs.close();
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(Quiz.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ary;
    }

    public int deleteQuiz(int quizid) {
        int status = 1;
        Connection c = BuildConnection.getConnection();
        try {
            String sql = "DELETE from quiz where quizid=?";
            PreparedStatement pstm = c.prepareStatement(sql);
            pstm.setInt(1, quizid);

            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(Quiz.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    public int deleteQuizbySubjectid(int subjectid) {
        int status = 1;
        Connection c = BuildConnection.getConnection();
        try {
            String sql = "DELETE from quiz where subjectid=?";
            PreparedStatement pstm = c.prepareStatement(sql);
            pstm.setInt(1, subjectid);
            pstm.executeUpdate();
            pstm.close();
        } catch (SQLException ex) {
            Logger.getLogger(Quiz.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }
//ไม่น่าถูก
    public Quiz getResultBySubjectId(int subjectid){
        Quiz quiz=null;
        Connection c = BuildConnection.getConnection();
        try {
            PreparedStatement pstm=c.prepareStatement("SELECT * FROM QUIZ WHERE subjectid =?");
            pstm.setInt(1, subjectid);
            ResultSet rs=pstm.executeQuery();
            while(rs.next()){
                quiz=new Quiz(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)
                ,rs.getString(6),rs.getString(7),rs.getInt(8));
                System.out.println(quiz);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Quiz.class.getName()).log(Level.SEVERE, null, ex);
        }
        return quiz;
    }
    
//        public Quiz getResultBySubjectId(int subjectid){
//        Quiz quiz=null;
//        Connection c = BuildConnection.getConnection();
//        try {
//            PreparedStatement pstm=c.prepareStatement("SELECT * FROM QUIZ WHERE subjectid =?");
//            pstm.setInt(1, subjectid);
//            int score = 0;
//            if()
////            ResultSet rs=pstm.executeQuery();
////            while(rs.next()){
////                quiz=new Quiz(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)
////                ,rs.getString(6),rs.getString(7),rs.getInt(8));
////                System.out.println(quiz);
////            }
//        } catch (SQLException ex) {
//            Logger.getLogger(QuizDao.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return quiz;
//    }


//    public static void viewPoint(Quiz[] quiz) {
//            int score =0;
//            for (int i = 0; i < quiz.length(); i++) {
//                System.out.println(quiz[i].subjectid);
//                String ans = ;
//    }

//ไว้ลองtest
    public static void main(String[] args) {
        QuizController qc = new QuizController();
//        qd.listQuiz();
        qc.insertQuiz(5012, "Orange", "a", "b", "c", "Orange", "Orange", 501);
//        qd.deleteQuiz(1013);
//        qd.getResultBySubjectId(101);
}


   

}
