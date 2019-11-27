/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  GunPc
 * Created: Nov 27, 2019
 */

CREATE TABLE Quiz (
    QuizID int NOT NULL PRIMARY KEY  GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
    Question varchar(255) NOT NULL,
    ChoiceA varchar(255) NOT NULL,
    ChoiceB varchar(255) NOT NULL,
    ChoiceC varchar(255) NOT NULL,
    ChoiceD varchar(255) NOT NULL,
    answer varchar(255) NOT NULL,
    subjectid int not null
);
