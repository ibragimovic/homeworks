package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Rectangle rect = new Rectangle();
        Rectangle rect2 = new Rectangle();

        rect.setHeight(10);
        rect.setWidth(20);

        rect2.setHeight(100);
        rect2.setWidth(30);

        System.out.println("Rect height = " + rect.getHeight() + ", rect width = " + rect.getWidth());
        System.out.println("Rectangle area = " + rect.getArea());

        System.out.println("Rect2 area = " + rect2.getArea());

//        Rectangle square = new Rectangle();
//        square.setHeight(15);
//        square.setWidth(15);
//        square.setColor("WHITE");
//        System.out.println("Square area = " + square.getArea() +
//                ", color is " + square.getColor() + ".");

          Rectangle square = new Rectangle();
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        square.setWidth(size);
        square.setHeight(size);
        square.setColor("WHITE");
        System.out.println("Square area = " + square.getArea() +
                ", color is " + square.getColor() + ".");

        Rectangle rect3 = new Rectangle();
        System.out.println("Rect 3 height = " + rect3.getHeight());
    }
}
