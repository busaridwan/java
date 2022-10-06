package com.busaridwan.amigoscode.learning.sololearn;
import java.util.Date;
import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter USD amount: ");
        double amount = input.nextDouble();
        convertToNaira(amount);
    }
    static void convertToNaira(double amount){
        double Monday = 433.40, Tuesday = 433.04, Wednesday = 432.37, Thursday = 432.04, Friday = 431.69, Saturday = 431.33, Sunday = 430.99 ;
        double rate = 0.0;
        Date today = new Date();
        switch (today.getDay()){
            case 0:
                rate = Sunday;
                break;
            case 1:
                rate = Monday;
                break;
            case 2:
                rate = Tuesday;
                break;
            case 3:
                rate = Wednesday;
                break;
            case 4:
                rate = Thursday;
                break;
            case 5:
                rate = Friday;
                break;
            case 6:
                rate = Saturday;
                break;
        }
        double result = amount * rate;
        System.out.printf("NGN%.2f Naija For Ever", result);
    }
}
