package com.company;

public class Dog {
    int age;
    int height;
    int weight;
    int lifespan;
    String breed;
    String sex;

    public void setAge(int age) {
        if(age <= 0){
            System.out.println("Age can't be 0 or less than 0!");
            return;
        }
        this.age = age;
    }

    public void setHeight(int height) {
        if (height <= 0){
            System.out.println("Height can't be 0 or less than 0!");
            return;
        }
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setLifespan(int lifespan) {
        this.lifespan = lifespan;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public int getLifespan() {
        return lifespan;
    }

    public String getBreed() {
        return breed;
    }

    public String getSex() {
        return sex;
    }
}
