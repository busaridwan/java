package com.busaridwan.amigoscode.dsa;

public class Recursion {
/*
    Data structures - different ways of organising data on your computer for efficient use.
    Algorithm - set of instructions to perform a task = correctness and efficiency

    Type of Data structures - Primitive (built in) and reference (non-primitive - defined by developers)
        Primitive - Integer, Float, Character, Boolean
        Non-primitive - Linear and non-linear
            Linear - Static and Dynamic
                Static - Array
                Dynamic - Linked list, Stack, Queue
            Non-linear - Tree and Graph
    Types of Algorithms - Simple recursive
                          Divide and conquer - Quick sort and merge sort
                          Dynamic programming - base memoization
                          Greedy - local optimum solution
                          Brute force - tries all possibilities until solution is found
                          Randomized
 */
    //Recursive function is a function calling itself e.g. Russian doll, base condition is needed to stop, nth, similar sub problems.
    // Uses stack
    static int factorial(int x){
        if (x < 0){
            return -1;
        }
        if(x <= 1){
            return 1;
        }
        return x * factorial(x - 1);
    }

    static int powerOfTwo(int n){
        if (n==0){
            return 1;
        }
        int power = 2*powerOfTwo(n-1);
        return power;
    }
//Iteration performs better than recursion in terms of time and space complexity but recursion is easier to implement
    static int powerOfThree(int n){
        int i = 0;
        int power = 1;
        while(i < n){
            power = power * 3;
            i = i + 1;
        }
        return power;
    }

    static int fibonacci(int n){
        if (n < 0){
            return -1;
        }
        if (n == 0 || n == 1){
            return n;
        }
        int fibo = fibonacci(n-1) + fibonacci(n-2);
        return fibo;
    }

    public static void main(String[] args) {
       int fact = factorial(-5);
       int powTwo = powerOfTwo(5);
       int powThree = powerOfThree(5);
       int fibo = fibonacci(10);

        System.out.println("fact "+ fact + " powTwo "+ powTwo + " powThree " + powThree + " Fibonacci " + fibo);

        System.out.println(sumOfPositiveDigits(15_626));

        int arr[] = { 1, 2, 3, 4, 5 };
        System.out.println("Array " + productOfArray(arr, arr.length));
    }

    static int sumOfPositiveDigits(int n){
        if (n <= 0){
            return 0;
        }
        return n%10 + sumOfPositiveDigits(n/10);
    }

    static int power(int base, int exp){
        if (base <= 1 || exp <= 0){
            return 1;
        }
        return base * power(base, exp -1);
    }

    //Euclidean Algorithm to calculate Greatest common Divisor
    static int gcd(int a, int b){
        if (b <= 0 || a <=0) {
            return a;
        }
        return gcd(b, a%b);
    }

    //Decimal to Binary
    static int toBinary(int n){
        if (n<=0){
            return 0;
        }
       return n%2 + toBinary(n/2);
    }

    static int productOfArray(int A[], int N)
    {
        //   TODO
        if (N <= 0){
            return A[N];
        }
        return A[N-1] * productOfArray(A,N-1);
    }

    static String reverse(String str)
    {
        if ((str==null)||(str.length() <= 1))
            return str;
        else
        {
            return str.charAt(str.length()-1) + reverse(str.substring(0,str.length()-1));
        }
    }


}
