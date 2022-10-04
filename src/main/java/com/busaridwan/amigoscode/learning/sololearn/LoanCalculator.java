package com.busaridwan.amigoscode.learning.sololearn;

import java.util.Scanner;

/**
 * You take a loan from a friend and need to calculate how much you wil
 * owe him after 3 months.
 * You're going to pay him back 10% of the remaining loan amount each month.
 * Create a program that takes the loan amount as inout, calculates and outputs
 * the remaining amount after 3 months.
 */

public class LoanCalculator {

    public static void main(String[] args) {
        System.out.println("Enter amount loan: ");
        Scanner input = new Scanner(System.in);
        double amount = input.nextDouble();

        for (int i = 1; i <= 3; i++){
            amount -= amount*0.1;
        }
        System.out.println(amount);
    }


}
