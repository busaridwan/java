package com.busaridwan.amigoscode.learning.w3schools;

public class Recursion {
    final int z = 10;
    //The attribute z of the Recursion class can not be overriden:
    // final keyword is a modifier

    //
    static boolean isPrime(int x){
        boolean prime = true;
        for(int div = 2; div < x; div++){
            if (x % div == 0){
               prime = false;
            }
        }
        return prime;
    }

    static int sumBetween(int x, int y){
        if (y > x){
            return y + sumBetween(x, y-1);
        }else {
            return y;
        }
    }
    static int sum(int x){
        if(x > 0){
            return x + sum(x-1);
        }else {
            return 0;
        }
    }

    public static void main(String[] args) {

        System.out.println(sum(6));
        System.out.println( isPrime(11));
        System.out.println(sumBetween(3,5));


    }
}
