package com.busaridwan.amigoscode.learning;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;

public class Learn {
    public static void main(String[] args) {

        //primitive data types
        byte theByte = -128;
        short theShort = 32_767;
        int theInt = 214_736_658;
        long theLong = 746_749_938L ;
        float theFloat = 374.98F;
        double theDouble = 374.294854;
        boolean isBoolean = true;
        char Character = 'A';

        System.out.println(theByte);

        // reference types
        String name = new String("Ridwan");
        LocalDate now = LocalDate.now();
        System.out.println(now.getMonth());


        int a = 10;
        int b = a;
        a = 100;
        System.out.println("a" + a + "b: " + b);

        Person alex = new Person("Alex");
        Person mariam = alex;

        alex.name = "Alexander";
        System.out.println("Alex name: "+alex.name+" Mariam name: "+mariam.name);

        System.out.println(name.charAt(1));
        name.contains("code");
        String code = "Code";
        code.charAt(1);

        LocalDateTime localTime = LocalDateTime.now();

        java.sql.Date sqlDate = new java.sql.Date(1);


        //Working with Math module
        System.out.println(Math.abs(-10));
        System.out.println((int) Math.pow(5,2));
        System.out.println(Math.sqrt(25 ));


        //Comparison Operator == > >= != || &&
        //Ternary operator
        int age = 15;
        String message = age >= 10 ? "Hoooray...I am an adult" : "Opps! sorry";

    }

    static class Person {
        String name;
        Person(String name){
            this.name = name;
        }
    }
}
