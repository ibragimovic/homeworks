package com.company;

import java.util.Date;

public class Group {
Student[] array;
String course;
Date begin;
int lengthCourse;



public void setArray(Student[] array) {
        this.array = array;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    public void setBegin(Date begin) {
        this.begin = begin;
    }
    public void setLengthCourse(int lengthCourse) {
        this.lengthCourse = lengthCourse;
    }

    public Student[] getArray() {
        return array;
    }

    public String getCourse() {
        return course;
    }

    public Date getBegin() {
        return begin;
    }

    public int getLengthCourse() {
        return lengthCourse;
    }
}
