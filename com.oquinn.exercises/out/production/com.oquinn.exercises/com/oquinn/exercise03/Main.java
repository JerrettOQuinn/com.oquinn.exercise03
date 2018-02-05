package com.oquinn.exercise03;
import java.util.Scanner;

/**
 * Created by 008366 on 1/31/2018.*/
public class Main {
    public static float collectInput() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Fahrenheit: ");
        float fahrenheit = in.nextInt();
        return fahrenheit;
    }

    public static float convertTemperature(float fahrenheit) {
        float celsius = ((fahrenheit - 32) * 5) / 9;
        return celsius;
    }

    public static void outputInfo(float celsius) {
        System.out.println("Fahrenheit in Celsius = " + celsius);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float fahrenheit = 0;

        while (fahrenheit > -460) {
            // Collect User Input
            Main.collectInput();

            // Convert Temperature
            float celsius = Main.convertTemperature(fahrenheit);
            //Output conversion
            Main.outputInfo(celsius);
        }
    }
}