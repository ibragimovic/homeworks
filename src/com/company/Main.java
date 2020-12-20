package com.company;

public class Main {

    public static void main(String[] args) {
        Farm farm1 = new Farm("Bishkek city, Manas st., 85", 5, 3, 2, "Musaev Ibragim");

        farm1.addSheep(new Sheep(25.0, 3, "Female", "Bibi"));
        farm1.addSheep(new Sheep(26.5, 4, "Male", "Bob"));
        farm1.addSheep(new Sheep(27.5, 5, "Male", "Greg"));


        Cow farm1Cow1 = new Cow(51.7, 6, "Female", "Marusya");
        Cow farm1Cow2 = new Cow(35.4, 3, "Male", "Bully");
        Cow farm1Cow3 = new Cow(70.9, 10, "Male", "Gonzo");
        Cow farm1Cow4 = new Cow(68.0, 6, "Male", "Hatabych");
        Cow farm1Cow5 = new Cow(65.5, 7, "Female", "Ulyana");

        Horse farm1Horse1 = new Horse(95.0, 7, "Brown", "Male", "Tyson");
        Horse farm1Horse2 = new Horse(79.5, 5, "Grey", "Female", "Alba");

        farm1.addCow(farm1Cow1);
        farm1.addCow(farm1Cow2);
        farm1.addCow(farm1Cow3);
        farm1.addCow(farm1Cow4);
        farm1.addCow(farm1Cow5);

        farm1.addHorse(farm1Horse1);
        farm1.addHorse(farm1Horse2);
        farm1.printInfo();


    }
}
