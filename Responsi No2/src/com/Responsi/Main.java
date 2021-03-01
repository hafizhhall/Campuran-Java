package com.Responsi;

public class Main {
    public static void main(String[] args) {
        int [] data = {73, 32, 70, 44, 72, 61, 44, 40, 21, 26, 65, 76, 57, 3, 50, 77, 64,
                       51, 22, 25, 61, 74, 26, 41, 75, 66, 57, 57, 21, 45, 62, 77, 60,77};
        int temp = 0;
        System.out.print("Bilangan Genap: ");
         for(int d : data){
             if(d % 2 == 1){
                System.out.print(d+ " ");
                 temp++;
             }
         }
        System.out.println("\nBanyaknya jumlah bilangan genap yang muncul: " + temp);
    }
}
