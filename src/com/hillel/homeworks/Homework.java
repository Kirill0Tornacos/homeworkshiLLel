package com.hillel.homeworks;

import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number:");

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int result = number1 + number2;

        System.out.println(result);

        System.out.println("Do you want to continue or stop? press 1 - continue, press 2 - stop");
        int num1 = scanner.nextInt();
        int num2 = 1;
        if (num1 == num2) {
            System.out.println("Input number:");
            int number3 = scanner.nextInt();
            int number4 = scanner.nextInt();
            int result1 = number3 + number4;

            System.out.println(result1);

        } else {
            System.out.println("Your program has stopped");
        }

    }
}