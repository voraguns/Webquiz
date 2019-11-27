/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  GunPc
 * Created: Nov 27, 2019
 */

CREATE TABLE Subject (
    SubjectID int NOT NULL PRIMARY KEY,
    Subjectname varchar(255) NOT NULL,
    TeacherId int NOT NULL
);

CREATE TABLE Quiz (
    QuizID int NOT NULL PRIMARY KEY,
    Question varchar(255) NOT NULL,
    ChoiceA varchar(255) NOT NULL,
    ChoiceB varchar(255) NOT NULL,
    ChoiceC varchar(255) NOT NULL,
    ChoiceD varchar(255) NOT NULL,
    answer varchar(255) NOT NULL,
    subjectid int not null
);

CREATE TABLE Teachers (
    TeacherID int NOT NULL PRIMARY KEY,
    fullname varchar(255) NOT NULL,
    username varchar(255) NOT NULL,
    password varchar(255) NOT NULL
);
CREATE TABLE Students (
    StudentID int NOT NULL PRIMARY KEY,
    firstname varchar(255) NOT NULL,
    lastname varchar(255) NOT NULL,
    username varchar(255) NOT NULL,
    password varchar(255) NOT NULL
);
insert into subject (subjectid,subjectname,teacherid)VALUES(101,'Thai',1101);
insert into subject (subjectid,subjectname,teacherid)VALUES(201,'English',1201);
insert into subject (subjectid,subjectname,teacherid)VALUES(301,'Science',1301);
insert into subject (subjectid,subjectname,teacherid)VALUES(401,'Mathematics',1401);
insert into subject (subjectid,subjectname,teacherid)VALUES(501,'SocialStudies',1501);

insert into teachers (teacherid,fullname,username,password)VALUES(1101,'Lilly Sriracha','Lilly','1101');
insert into teachers (teacherid,fullname,username,password)VALUES(1201,'Somsri A-riyagun','Somsri','1201');
insert into teachers (teacherid,fullname,username,password)VALUES(1301,'Namthip Natawan','Namthip','1301');
insert into teachers (teacherid,fullname,username,password)VALUES(1401,'Suthinee Saejan','Suthinee','1401');
insert into teachers (teacherid,fullname,username,password)VALUES(1501,'Phornpai Manee','Phornpai','1501');


