package com.company;

import java.io.StringReader;

public class Horse {
    double weight;
    int age;
    String color;
    String sex;
    String nickname;


    public Horse(){}

    public Horse(double weight, int age, String color, String sex, String nickname){
        this.weight = weight;
        this.age = age;
        this.color = color;
        this.sex = sex;
        this.nickname = nickname;
    }

    public void printInfo(){
        System.out.println("Horse: weight - " + weight + ", age - " + age + ", color - " + color + ", sex - " + sex + ", nickname - " + nickname);
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
