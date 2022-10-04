package com.busaridwan.amigoscode.dsa;

import java.util.Arrays;

public class ReverseArray {

   static void reverse(int[] array){
//        for (int i = 0; i < array.length/2; i++ ){
//            int other = array.length-i-1;
//            int temp = array[i];
//            array[i] = array[other];
//            array[other] = temp;
//        }
       int[] another = new int[array.length];
       int z = 0;
       for (int i = array.length-1; i >= 0; i--){
           another[z] = array[i];
           z++;
       }
        System.out.println(Arrays.toString(another));
    }

    public static void main(String[] args) {
        int[] customerArray = {1,3,5,7,9};
        reverse(customerArray);
    }
}
