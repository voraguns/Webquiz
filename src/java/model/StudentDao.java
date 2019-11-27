/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import connection.BuildConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author GunPc
 */
public class StudentDao {

    public String registerStudent(Students student) {
        String username = student.getUsername();
        String password = student.getPassword();
        String firstname = student.getFirstname();
        String lastname = student.getLastname();
        String fullname = student.getFullname();
        String studentid = student.getStudentid();

        Connection con = null;
        PreparedStatement preparedStatement = null;

        try {
            con = BuildConnection.getConnection();
            String query = "insert into students(firstname,lastname,username,password,fullname) values (?,?,?,?,?)"; //Insert user details into the table 'USERS'
            preparedStatement = con.prepareStatement(query); //Making use of prepared statements here to insert bunch of data
            preparedStatement.setString(1, firstname);
            preparedStatement.setString(2, lastname);
            preparedStatement.setString(3, username);
            preparedStatement.setString(4, password);
            preparedStatement.setString(5, fullname);

            int i = preparedStatement.executeUpdate();

            if (i != 0) //Just to ensure data has been inserted into the database
            {
                return "SUCCESS";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return "Oops.. Something went wrong there..!";  // On failure, send a message from here.
    }
    
        public int AddClient(String studentid,String firstname, String lastname, String username, String password) {

        Connection conn = BuildConnection.getConnection();
        int status = -1;
        try {
            String ADD = "INSERT INTO STUDENTS(studentid,firstname,lastname,username,password) VALUES (?,?,?,?,?)";
            PreparedStatement pstm = conn.prepareStatement(ADD); 
            pstm.setString(1, studentid);
            pstm.setString(2, firstname);
            pstm.setString(3, lastname);
            pstm.setString(4, username);
            pstm.setString(5, password);
            
            status = pstm.executeUpdate();
            conn.commit();
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

}
