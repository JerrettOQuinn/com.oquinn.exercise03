package com.oquinn.exercise02;
// Exercise2

/**
 * Created by 008366 on 1/23/2018.
 */
public class Main {
    public static void main(String[] args) {
        int[] temperatures = {45, 29, 10, 22, 41, 28, 3};
        int[] precipitation = {95, 60, 25, 5, 0, 75, 90};
        int i = 0;

        while (6 >= i)
            if (temperatures[i] >= 32 && precipitation[i] > 50) {
                System.out.println(temperatures[i]);
                System.out.println(precipitation[i]);
                i++;

            }

    }
}