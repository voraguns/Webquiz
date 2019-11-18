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
import model.Student;

/**
 *
 * @author GunPc
 */
public class StudentController {

    Connection conn;

    public Student getStudentByUsername(String username) {
        try {
            conn = BuildConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM students WHERE username = ?");
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Student(rs.getInt("id"), rs.getString("username"), rs.getString("password"));
            }
            rs.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public Student getStudentById(int id) {
        try {
            conn = BuildConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT * FROM students WHERE id = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Student(rs.getInt("id"), rs.getString("username"), rs.getString("password"));
            }
            rs.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
        }

        return null;
    }

    public ArrayList<Student> getResultListStudent(ResultSet rs) throws SQLException {
        ArrayList<Student> allStudent = new ArrayList();
        allStudent.add(new Student(rs.getInt("id"), rs.getString("username"), rs.getString("password")));
        return allStudent;

    }

    public ResultSet getStudentResult(ResultSet rs) {
        try {
            conn = BuildConnection.getConnection();
            if (rs.next()) {
                return (ResultSet) new Student(rs.getInt("id"), rs.getString("username"), rs.getString("password"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public void successsAndUpdateStudentDB(String fullname){
         try {
            conn = BuildConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement("INSERT INTO STUDENTS (Username, Password) VALUES (?, ?)");
            ps.setString(1, fullname);
            ResultSet rs = ps.executeQuery();

        } catch (SQLException ex) {
            Logger.getLogger(StudentController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void main(String[] args) {
        StudentController stc = new StudentController();
        Student s = stc.getStudentById(1);
        System.out.println(s);
    }
}
