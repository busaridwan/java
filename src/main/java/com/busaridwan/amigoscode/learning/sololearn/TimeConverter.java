package com.busaridwan.amigoscode.learning.sololearn;

import java.util.Scanner;

/**
 * You need a program to convert days to seconds.
 * The given code takes the amount of days as input.
 */
public class TimeConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your days: ");
        int days = input.nextInt();
        System.out.println(days + " days gives "+ (days * 24 * 60 * 60) + " seconds");
    }
}
