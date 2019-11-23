/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  GunPc
 * Created: Nov 20, 2019
 */

CREATE TABLE Quiz (
    QuizID int NOT NULL PRIMARY KEY,
    Question varchar(255) NOT NULL,
    ChoiceA varchar(255) NOT NULL,
    ChoiceB varchar(255) NOT NULL,
    ChoiceC varchar(255) NOT NULL,
    ChoiceD varchar(255) NOT NULL,
    answer varchar(255) NOT NULL
);

CREATE TABLE Students (
    StudentID int NOT NULL PRIMARY KEY,
    firstname varchar(255) NOT NULL,
    lastname varchar(255) NOT NULL,
    username varchar(255) NOT NULL,
    password varchar(255) NOT NULL
);

CREATE TABLE Teacher (
    TeacherID int NOT NULL PRIMARY KEY,
    fullname varchar(255) NOT NULL,
    username varchar(255) NOT NULL,
    password varchar(255) NOT NULL
);
    