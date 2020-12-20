package com.company;

public class Main {

    public static void main(String[] args) {
     //Task A
     Student student1 = new Student();
     student1.name = "Gabriel";
     student1.age = 19;
     student1.gender = "Female";
     student1.averageRate = 4.3;

     Student student2 = new Student();
     student2.name = "Lionel";
     student2.age = 32;
     student2.gender = "Male";
     student2.averageRate = 4.95;

     Student student3 = new Student();
     student3.name = "Ronaldo";
     student3.age = 35;
     student3.gender = "Male";
     student3.averageRate = 4.87;

        System.out.println("Student #1: name - " + student1.name + ",\nage -  " + student1.age +
                ",\ngender - " + student1.gender + ",\naverage rate is " + student1.averageRate);
        System.out.println();

        System.out.printf("Student #2:\nname - %s,\nage - %d,\ngender - %s,\naverage rate is %.2f",
                            student2.name, student2.age, student2.gender, student2.averageRate);
        System.out.println();

        System.out.printf("Student #3: \nname - %s,\nage - %d, \ngender - %s,\naverage rate is %.2f",
                            student3.name, student3.age, student3.gender, student3.averageRate);

            //Task B
        FootballPlayers player1 = new FootballPlayers();
        player1.name = "Robert Lewandowski";
        player1.position = "striker";
        player1.goal = 40;
        player1.assist = 20;
        player1.goalPerGame = 1.38;
        player1.assistPerGame = 0.87;

        FootballPlayers player2 = new FootballPlayers();
        player2.name = "Erling Holland";
        player2.position = "striker";
        player2.goal = 34;
        player2.assist = 25;
        player2.goalPerGame = 1.27;
        player2.assistPerGame = 0.98;

        System.out.println();

        System.out.printf("Player # 1\nname: %s,\nposition: %S, \ngoals: %d, \nassists: %d, \ngoal per game: %.2f,\nassist per game: %.2f",
                            player1.name, player1.position, player1.goal, player1.assist, player1.goalPerGame,
                            player1.assistPerGame);
        System.out.println();

        System.out.printf("Player # 2\nname: %s,\nposition: %s,\ngoals: %d,\nassists: %d,\ngoals per game: %.2f,\nassist per game: %.2f",
                            player2.name, player2.position, player2.goal, player2.assist, player2.goalPerGame, player2.assistPerGame);



    }
}
