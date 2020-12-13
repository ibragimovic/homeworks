package com.company;

public class Main {

    public static void main(String[] args) {
	    Circle crl = new Circle(10, "Pink", true);
        crl.printCircleInfo();
        System.out.println("Circle length " + crl.getCircleLength());
        System.out.println("Circle area " + crl.getCircleArea());
        System.out.println();


        int n = 7;
        crl.setRadius(crl.getRadius() * n);

        System.out.println("Circle length " + crl.getCircleLength());
        System.out.println("Circle area " + crl.getCircleArea());


        int size = 100, count = 0;
        Circle[] array = new Circle[size];
        for (int i = 0; i < array.length; i++){
            array[i] = new Circle(i+1);
            if (array[i].getRadius() % 3 == 0){
                count ++;
            }
            System.out.print(array[i].getRadius() + " ");
        }
        Circle[] arrayNew = new Circle[count];
        int k = 0;

        System.out.println("\n_______________________________________________\n");

        for(int i = 0; i < array.length; i++){
            if (array[i].getRadius() % 3 == 0){
                arrayNew[k] = array[i];
                k++;
            }
        }

        for(int i = 0; i < arrayNew.length; i++){
            System.out.print(arrayNew[i].getRadius() +" ");
        }




    }


}
