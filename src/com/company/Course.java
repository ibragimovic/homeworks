package com.company;

import java.util.Date;

public class Course {
    String nameCourse;
    Date date;
    String ID;
    String nameTeacher;

    public void setNameCourse(String nameCourse) {
        this.nameCourse = nameCourse;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public String getNameCourse() {
        return nameCourse;
    }

    public Date getDate() {
        return date;
    }
    public String getID(){
        return ID;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }
}
