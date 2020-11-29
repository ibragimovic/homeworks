package com.company;

public class Rectangle {
    int height;
    int width;
    String color;

    public  Rectangle(){}
    public  Rectangle(int h, int width){
        this.height = h;
        this.width = width;
    }

    public void setHeight(int h){
        if (h <= 0){
            System.out.println("Height can't be less than 0 or 0.");
            return;
        }
        height = h;
    }

    public void setWidth(int width) {
        if (width <= 0){
            System.out.println("Width can't be less than 0 or 0.");
            return;}
        this.width = width;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getArea(){
        return height * width;
    }

    public int getWidth(){
        return width;
    }
    public int getHeight(){
        return height;
    }
    public String getColor(){
        return color;
        }
        }

