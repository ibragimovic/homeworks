package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	// write your code here
//        Rectangle rect = new Rectangle();
//        Rectangle rect2 = new Rectangle();
//
//        rect.setHeight(10);
//        rect.setWidth(20);
//
//        rect2.setHeight(100);
//        rect2.setWidth(30);
//
//        System.out.println("Rect height = " + rect.getHeight() + ", rect width = " + rect.getWidth());
//        System.out.println("Rectangle area = " + rect.getArea());
//
//        System.out.println("Rect2 area = " + rect2.getArea());
//
////        Rectangle square = new Rectangle();
////        square.setHeight(15);
////        square.setWidth(15);
////        square.setColor("WHITE");
////        System.out.println("Square area = " + square.getArea() +
////                ", color is " + square.getColor() + ".");
//
//        Rectangle square = new Rectangle();
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//
//        square.setWidth(size);
//        square.setHeight(size);
//        square.setColor("WHITE");
//        System.out.println("Square area = " + square.getArea() +
//                ", color is " + square.getColor() + ".");
//
//        Rectangle rect3 = new Rectangle();
//        System.out.println("Rect 3 height = " + rect3.getHeight());
//
//        Rectangle rect4 = new Rectangle(45, 50);



//        HW18
//        Task A
        Parrot par1 = new Parrot();
        par1.setAge(2);
        par1.setBeak("short");
        par1.setColor("green");
        par1.setSex("girl");
        System.out.println("Par1's age is " +par1.getAge() + ", beak is " + par1.getBeak()
                            + ", color is " + par1.getColor() + ", sex is " + par1.getSex());

        Parrot par2 = new Parrot();
        par2.setAge(8);
        par2.setBeak("middle");
        par2.setColor("blue");
        par2.setSex("girl");
        System.out.println("Par2's age is " +par2.getAge() + ", beak is " + par2.getBeak()
                + ", color is " + par2.getColor() + ", sex is " + par2.getSex());

        Parrot par3 = new Parrot();
        par3.setAge(25);
        par3.setBeak("long");
        par3.setColor("yellow");
        par3.setSex("boy");
        System.out.println("Par3's age is " +par3.getAge() + ", beak is " + par3.getBeak()
                + ", color is " + par3.getColor() + ", sex is " + par3.getSex());

        System.out.println();

        Dog d1 = new Dog();
        d1.setAge(5);
        d1.setHeight(35);
        d1.setWeight(45);
        d1.setLifespan(25);
        d1.setBreed("Bulldog");
        d1.setSex("boy");
        System.out.println("D1's age is " + d1.getAge()+ ", height is " + d1.getHeight()
                            + ", weight is " + d1.getWeight() + ", lifespan is " + d1.getLifespan()
                            + ", breed is " + d1.getBreed() + ", sex is " + d1.getSex());

        Dog d2 = new Dog();
        d2.setAge(10);
        d2.setHeight(46);
        d2.setWeight(31);
        d2.setLifespan(28);
        d2.setBreed("shepherd");
        d2.setSex("girl");
        System.out.println("D2's age is " + d2.getAge()+ ", height is " + d2.getHeight()
                + ", weight is " + d2.getWeight() + ", lifespan is " + d2.getLifespan()
                + ", breed is " + d2.getBreed() + ", sex is " + d2.getSex());

        Dog d3 = new Dog();
        d3.setAge(3);
        d3.setHeight(18);
        d3.setWeight(13);
        d3.setLifespan(15);
        d3.setBreed("husky");
        d3.setSex("boy");
        System.out.println("D3's age is " + d3.getAge()+ ", height is " + d3.getHeight()
                + ", weight is " + d3.getWeight() + ", lifespan is " + d3.getLifespan()
                + ", breed is " + d3.getBreed() + ", sex is " + d3.getSex());

//        Task B


    }
}
