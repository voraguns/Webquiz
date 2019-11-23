/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import connection.BuildConnection;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GunPc
 */
public class Students {
    
    
    private int studentid;
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String fullname;

    public Students() {
    }

    public Students(int studentid, String username, String password, String firstname, String lastname) {
        this.studentid = studentid;
        this.username = username;
        this.password = password;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Students(int studentid, String username, String password) {
        this.studentid = studentid;
        this.username = username;
        this.password = password;
    }

    public Students(String username, String password, String fullname) {
        this.username = username;
        this.password = password;
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getStudentid() {
        return studentid;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setStudentid(int studentid) {
        this.studentid = studentid;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Students{" + "studentid=" + studentid + ", firstname=" + firstname + ", lastname=" + lastname + '}';
    }
    
    public void scccessAndUpdateDatabase(String username,String password){
        try {
            BuildConnection db = new BuildConnection();
            Connection conn = db.getConnection();
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO STUDENTS(studentid,firstname,lastname,username,password,fullname) VALUES ('"+studentid+"' , '"+firstname+"' , '"+lastname+"' ,'"+username+"','"+password+"','"+fullname+"')");
        } catch (SQLException ex) {
            Logger.getLogger(Students.class.getName()).log(Level.SEVERE, null, ex);
        }   
      
    }
    
}
