package com.hillel.homeworks;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Input number:");
        for (int i = 0; i < 10; i++) {
            Scanner scanner = new Scanner(System.in);

            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int result = num1 + num2;

            System.out.println(result);

        }
    }
}
