package com.Latihan;

public class Main {

    public static void main(String[] args) {

       int [][] data = {
               {0},
               {60, 55, 85, 60, 50, 70},
               {90, 60, 75, 90, 60, 80},
               {85, 75, 75, 75, 70, 80},
               {75, 75, 95, 60, 65, 55}
       };

       int total;

       for ( int i = 1; i < 5; i++){
           for (int j = 0 ; j < data.length; j++){
               System.out.print(data[i][j]);


           }
           System.out.println("\n");
       }
    }
}
