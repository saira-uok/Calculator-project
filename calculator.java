package com.foundation;
import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        int num1;
        int num2;
        int average;



        // adding a scanner class and allowing the user to give input.
        Scanner keyboard = new Scanner(System.in);


        System.out.println("Choose a number to divide:");
        num1 = keyboard.nextInt();

        System.out.println("Choose another number to divide: ");
        num2 = keyboard.nextInt();

        average = num1 / num2;
        System.out.println("Your answer is: " + average);


    }
}
