package com.busaridwan.amigoscode.dsa;

public class PrimeNumber {

    public static void main(String[] args) {
        int x = 173;
        System.out.println(isPrime(x));
        printPrime(x);
    }

    static boolean isPrime(int num){
        boolean check = true;
        for (int div = 2; div <= num/2; div++){
            if (num % div == 0){
                check = false;
                return check;
            }
        }
        return check;
    }
    static int printPrime(int num){
        for (int i=0; i<=num; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
        return num;
    }
//    static int printPrime(int num){
//        for (int i = 2; i <= num; i++){
//            boolean isPrime = true;
//            for(int div = 2; div <= i/2; div++){
//                if (i % div == 0){
//                    isPrime = false;
//                    break;
//                }
//            }
//            if (isPrime){
//                System.out.println(i);
//            }
//
//        }
//        return num;
//    }
}
