package com.busaridwan.amigoscode.learning.dataFlair;
 class Abc{
     public Abc(){
        System.out.println("This is a constructor");
    }
  public void show(){
        System.out.println("This shows up");
    }
        }
public class ForLoop {



    public static void main(String[] args) {
        //Annonymous object can be called only once
        new Abc().show();
        // this is referenced Object
        Abc n = new Abc();
        n.show();

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                int k = i + j - 1;
                if(k>4){
                    k-=4;
                }
                System.out.print(k + " ");
            }
            System.out.println();
        }
        /*
            OUT PUT
            1 2 3 4
            2 3 4 5
            3 4 5 6
            4 5 6 7

        OUT PUT WITH IF
        1 2 3 4
        2 3 4 1
        3 4 1 2
        4 1 2 3

         */

        for (int l = 1; l <= 4; l++) {
            for (int m = 1; m <= 4; m++) {
                if(l == 1 || l == 4 || m == 1 || m == 4){
                    System.out.print("* ");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
