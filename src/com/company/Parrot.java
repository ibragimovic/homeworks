package com.company;

public class Parrot {
    int age;
    String color;
    String beak;
    String sex;

    public void setAge(int age) {
        if(age <= 0){
            System.out.println("Age can't be 0 or less than 0!");
            return;
        }
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBeak(String beak) {
        this.beak = beak;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getBeak() {
        return beak;
    }

    public String getSex() {
        return sex;
    }
}
