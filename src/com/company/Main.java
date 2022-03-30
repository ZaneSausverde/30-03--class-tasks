package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    static void task1() {
        // Task 1 . Pseudo code. Read num 1, Num 2, Num 3.


        Scanner scanner = new Scanner(System.in);

        //Read number1
        System.out.println("Input the first number:");
        int number1 = scanner.nextInt();
        //Read number 2
        System.out.println("Input the second number:");
        int number2 = scanner.nextInt();
        //Read number 3
        System.out.println("Input the third number:");
        int number3 = scanner.nextInt();

        int smallest;

        //if  num 1<2 num 2
        //smallest = num 1
        //else
        //smalest number2
        if (number1 < number2) {
            smallest = number1;
        } else {
            smallest = number2;

            //if number 3 < smalest
            //
        }

        if (number3 < smallest) {
            smallest = number3;
        }
        System.out.println("The smallest number is:" + smallest);
    }

    static void task2() {
//Pseudo code for tas 2
        Scanner scanner = new Scanner(System.in);
        //read procentage
        System.out.println("Input students precentage:");
        int precentage = scanner.nextInt();

        String grade;

        //   if precentage >=90 ){
        // Grade = A;
        if (precentage > 90) {
            grade = "A";
            // Else if precentage > 75 && precantage <=90
            //                   Grade = B
        } else if (precentage > 75) {
            grade = "B";
            //Else if precentage > 65
            // Grade = C
        } else if (precentage > 65) {
            grade = "C";
            //Else
            //Grade = D

        } else {
            grade = "D";
        }
        //Print grade
        System.out.println("The students grade is:" + grade);
    }

    static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input temperature in F:");
        int temp = scanner.nextInt();

        if (temp > 20 || temp < 95) {
            System.out.println("Visit our shops!");
        }

        String activity;

        if (temp >= 80) {
            activity = "swimming:";
        } else if (60 <= temp) {
            activity = "tennis:";
        } else if (40 <= temp) {
            activity = "golf: ";
        } else if (temp <= 40) {
            activity = "skiing:";
        }
        System.out.println("Your activity for today is:" + activity);

    }
}



