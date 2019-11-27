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
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Students;

/**
 *
 * @author GunPc
 */
public class StudentsController {
    
     private final static String FIND_BY_ID = "select * from students where studentid = ?";
    private final static String FIND_BY_FIRSTNAME = "select * from students where firstname = ?";
    private final static String FIND_BY_LASTNAME = "select * from students where lastname = ?";
    private final static String FIND_BY_USERNAME = "select * from students where username = ?";
    private final static String FIND_BY_PASSWORD = "select * from students where password = ?";

    public Students findById(int studentid) {
        Students student = null;
        Connection conn = BuildConnection.getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement(FIND_BY_ID);
            pstm.setInt(1, studentid);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                student = ResultSetToStudent(rs);
            }
            rs.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return student;
    }

    public Students findByFirstname(String firstname) {
        Students student = null;
        Connection conn = BuildConnection.getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement(FIND_BY_FIRSTNAME);
            pstm.setString(1, firstname);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                student = ResultSetToStudent(rs);
            }
            rs.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return student;
    }
    
     public Students findBylastname(String lastname) {
        Students student = null;
        Connection conn = BuildConnection.getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement(FIND_BY_LASTNAME);
            pstm.setString(1, lastname);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                student = ResultSetToStudent(rs);
            }
            rs.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return student;
    }
     
       public Students findByUsername(String username) {
        Students student = null;
        Connection conn = BuildConnection.getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement(FIND_BY_USERNAME);
            pstm.setString(1, username);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                student = ResultSetToStudent(rs);
            }
            rs.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return student;
    }

       public Students findByPassword(String password) {
        Students student = null;
        Connection conn = BuildConnection.getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement(FIND_BY_PASSWORD);
            pstm.setString(1, password);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                student = ResultSetToStudent(rs);
            }
            rs.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return student;
    }
       
    static Students ResultSetToStudent(ResultSet rs) {
        try {
            Students student = new Students(rs.getString("STUDENTID"),rs.getString("USERNAME"), rs.getString("PASSWORD"), rs.getString("FIRSTNAME"), rs.getString("LASTNAME"));
            if (student.getStudentid() != null ||! student.getStudentid().isEmpty() ) {
                return student;
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
