/* /////
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
import model.Teacher;

/**
 *
 * @author GunPc
 */
public class TeacherController {

    private final static String FIND_BY_USERNAME = "select * from teachers where username = ?";
    private final static String FIND_BY_PASSWORD = "select * from teachers where password = ?";
    
    public Teacher findByUsername(String username) {
        Teacher teacher = null;
        Connection conn = BuildConnection.getConnection();
        try {
            PreparedStatement pstm = conn.prepareStatement(FIND_BY_USERNAME);
            pstm.setString(1, username);
            ResultSet rs = pstm.executeQuery();
            if (rs.next()) {
                teacher = ResultSetToStudent(rs);
            }
            rs.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(TeacherController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return teacher;
    }

       public Teacher findByPassword(String password) {
        Teacher student = null;
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
            Logger.getLogger(TeacherController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return student;
    }
       
        static Teacher ResultSetToStudent(ResultSet rs) {
        try {
            Teacher teacher = new Teacher(rs.getInt("TEACHERID"), rs.getString("USERNAME"), rs.getString("PASSWORD"), rs.getString("FULLNAME"));
            if (teacher.getId()!= 0) {
                return teacher;
            }
        } catch (SQLException ex) {
            Logger.getLogger(TeacherController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
