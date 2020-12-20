package com.company;

public class Sheep {
    double weight;
    int age;
    String sex;
    String nickname;


    public Sheep() {}

    public Sheep(double weight, int age, String sex, String nickname) {
        this.weight = weight;
        this.age = age;
        this.sex = sex;
        this.nickname = nickname;
    }

    public void printInfo(){
        System.out.println("Sheep: weight - " + weight + ", age - " + age + ", sex - " + sex + ", nickname - " + nickname);
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
