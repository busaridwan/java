package com.busaridwan.amigoscode.learning.sololearn;

public class SearchLetter {

    public static void main(String[] args) {

//        char[] letters = {'A','A','B','Z','P','A'};
//        int count = countOccurrence(letters,'A');
//        System.out.println(count);
//
//        System.out.println(reverseString("drows"));
        System.out.println(recurse(18200));


    }
    static int countOccurrence(char[] letters, char searchLetter){

        int count = 0;
        for (char letter: letters) {
            if (letter == searchLetter){
                count++;
            }

        }
        return count;

    }

    /***
     * SUM of an array
     * @param array
     * @return int
     */
    static int sumArray(int[] array){
        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    /**
     * String reversal
     * @param word - string
     * @return a string
     */
    static String reverseString(String word){
        String reverseWord = "";
        char[] arr = word.toCharArray();
        for (int i = word.length()-1; i>=0; i-- ){
            reverseWord += arr[i];
        }
        return reverseWord;
    }

    static int recurse(int x){
        int sum;
        if (x == 0 || x < 10){
            return sum = x;
        }
        return x%10 + recurse(x/10);
    }
}
