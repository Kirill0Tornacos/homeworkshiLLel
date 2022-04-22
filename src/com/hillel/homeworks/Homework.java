package com.hillel.homeworks;

import java.io.IOException;

public class Homework {

    public static void main(String[] args) throws IOException {

        for (int i = 0; (char) System.in.read() != 'S'; i++) {
            System.out.println(i);
        }
    }
}
