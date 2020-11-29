package com.company;

import java.util.Date;

public class Student {
    Date dateOfBirth;
    String secondName;
    String name;
    String sex;
    int age;

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        if (age <= 0){
            System.out.println("Age can't be negative or 0!");
        }
        this.age = age;
    }
}
