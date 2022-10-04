package com.busaridwan.amigoscode.learning;

import java.util.Random;
import java.util.Scanner;

public class GrossPayCalculator {
    static Scanner scan = new Scanner(System.in);
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;
    public static void main(String[] args) {

        /*
        System.out.println("Enter the number of hours the employee worked: ");

        int hours = scan.nextInt();

        System.out.println("Enter employee's pay rate: ");
        double rate = scan.nextDouble();
        scan.close();

        double grossPay = hours * rate;

        System.out.println("The employee's gross pay is " + grossPay);

        int rateX = 15;
        int maxHours = 40;

        //Getting input for unknown variable
        System.out.println("How many hours did you work: ");
        double hoursWorked = scan.nextDouble();

        //Validate input
        while(hoursWorked > maxHours || hoursWorked < 1){
            System.out.println("Invalid entry. Your hours must be between 1 and 40. Try again: ");
            hoursWorked = scan.nextDouble();
        }
        scan.close();
        //Calculate gross
        double gross = rateX * hoursWorked;
        System.out.println("Gross pay: $" + gross);

        // DO WHILE LOOP
        boolean again = false;
        do{
            System.out.println("Enter the first number: ");
            double a = scan.nextDouble();
            System.out.println("Enter the second number: ");
            double b = scan.nextDouble();

            double sum = a + b;
            System.out.println("the sum of the "+a+" and "+b+" number is " + sum);
            System.out.println("Would you like to start over? true/false ");
            again = scan.nextBoolean();

        }while(again);
        scan.close();

        //Get the number of items to scan
        System.out.println("Enter the number of time you will like to scan: ");
        int quantity = scan.nextInt();

        double total = 0;

        //Create loop to iterate through all of the items and accumulate the cost.
        for (int i=0; i<quantity;i++){
            System.out.println("Enter the cost of the item: ");
            double price = scan.nextDouble();
            total = total + price;

        }
        scan.close();
        System.out.println("Your total is $"+total );

        //Get text
        System.out.println("Enter some text: ");
        String text = scan.nextLine();
        scan.close();

        boolean letterFound = false;
        //Searching text for letter A
        for (int i=0; i<text.length();i++){
            char currentLetter = text.charAt(i);
            if (currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                break;
            }
        }
        if (letterFound){
            System.out.println("Your text contains the letter A");
        }else {
            System.out.println("This does not contain letter A");
        }


        //Initialize what we know
        int numberOfStudents = 24;
        int numberOfTests = 4;

        //Process all students
        for (int i=0;i<numberOfStudents;i++){
            double total = 0;
            for (int j=0;j<numberOfTests;j++){
                System.out.println("Enter score for Test #"+(j+1));
                double score = scan.nextDouble();
                total = total + score;
            }

            double average = total/numberOfStudents;
            System.out.println("the test average for student #"+(i+1)+ " is "+average);
        }
        scan.close();

         */

        int lastSpace = 20;
        int currentSpace = 0;
        int maxRolls = 5;
        Random random = new Random();

        System.out.println("Welcome to Roll the Die! Let's begin...");

        for(int i=1; i<=maxRolls; i++){

            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;

            System.out.print(String.format("Roll #%d: You've rolled a %d. ", i, die));

            if(currentSpace == lastSpace){
                System.out.print("You're on space " + currentSpace + ". Congrats, you win!");
                break;
            }
            else if(currentSpace > lastSpace){
                System.out.print("Unfortunately, that takes you past " + lastSpace + " spaces. You lose!");
                break;
            }
            else if(i==maxRolls && currentSpace < lastSpace){
                System.out.println("You're on space " + currentSpace + ".");
                System.out.println("Unfortunately, you didn't make it to all " +
                        lastSpace + " spaces. You lose!");
            }
            else{
                int spacesToGo = lastSpace - currentSpace;
                System.out.print("You are now on space " + currentSpace +
                        " and have " + spacesToGo + " more to go.");
            }

            System.out.println();
        }

        double salary = getSalary();
        int creditScore = getCreditScore();
        scan.close();

        //Check if the user is qualified
        boolean qualified = isUserQualified(creditScore, salary);

        //Notify the user
        notifyUser(qualified);
    }

    public static double getSalary(){
        System.out.println("Enter your salary:");

        double salary = scan.nextDouble();
        return salary;
    }

    public static int getCreditScore(){
        System.out.println("Enter your credit score:");
        int creditScore = scan.nextInt();
        return creditScore;
    }

    public static boolean isUserQualified(int creditScore, double salary){
        if(creditScore >= requiredCreditScore && salary >= requiredSalary){
            return true;
        }
        else{
            return false;
        }
    }

    public static void notifyUser(boolean isQualified){
        if(isQualified){
            System.out.println("Congrats! You've been approved.");
        }
        else{
            System.out.println("Sorry. You've been declined");
        }
    }
    public static boolean isPalindrome(String s)
    {
        // TODO
        String x = "";
        for(int i= s.length(); i > 0; i--  ){
            x += s.charAt(i-1);
        }
        if (x.equals(s)){
        return true;
    }else{
        return false;
    }
    }
}
