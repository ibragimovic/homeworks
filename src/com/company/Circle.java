package com.company;

public class Circle {
    double radius; //0
    String color; //null
    boolean isTransparent; //false



    public Circle(double radius){
        this.radius = radius;
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius, String color, boolean isTransparent){
        this.radius = radius;
        this.color = color;
        this.isTransparent = isTransparent;
    }
    public double getCircleLength(){
        return 2 * Math.PI * radius;
    }

    public void printCircleInfo(){
        System.out.println("Circle: \n\n" + "radius = " + radius
                + "\ncolor is " + color
                + "\nisTransparent " + isTransparent);
    }

    public double getCircleArea(){
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public boolean getIsTransparent() {
        return isTransparent;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
