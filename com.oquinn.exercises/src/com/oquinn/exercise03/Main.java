package com.oquinn.exercise03;
import java.util.Scanner;

/**
 * Created by 008366 on 1/31/2018.*/
public class Main {
    public static void main(String[] args) {
        float fahrenheit = 0;
        Scanner in = new Scanner(System.in);

        while (fahrenheit > -460) {
            // Collect User Input
            System.out.println("Enter Fahrenheit: ");
            fahrenheit = in.nextInt();

            // Convert Temperature
            float celsius = ((fahrenheit - 32) * 5) / 9;

            //Output conversion
            System.out.println("Fahrenheit in Celsius = " + celsius);
        }
    }
}