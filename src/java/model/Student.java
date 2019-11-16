/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author GunPc
 */
public class Student {
    private int id;
    private String username;
    private String password;
    private String fullname;

    public Student() {
    }

    public Student(int id, String name, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", username=" + username + ", password=" + password + ", fullname=" + fullname + '}';
    }
    
}
