package com.Latihan;

public class Main {

    public static void main(String[] args) {
	// Array itu mudah

        String[] buah = {"apel", "pear"};
        System.out.println(buah[0]);
        System.out.println(buah);

        /*array*/System.out.println();

        int[] nilai = {1,2,3,4,5,6,7,8,9};

        System.out.println(nilai);

        nilai [3] = 12;
        System.out.println(nilai[0]);
        System.out.println(nilai[1]);
        System.out.println(nilai[2]);
        System.out.println(nilai[3]);
        System.out.println(nilai[4]);
        System.out.println(nilai[5]);

        System.out.println();
        //cara satu
        int[] x;
        x = new int[3];
        x[0] = 20;
        x[1] = 10;
        x[2] = 30;
        System.out.println("nilai x[0] : " + x[0]);
        System.out.println("nilai x[1] : " + x[1]);
        System.out.println("nilai x[2] : " + x[2]);

        System.out.println();

        //cara dua
        int[] y = new int[3];
        y[0] = 20;
        y[1] = 10;
        y[2] = 30;
        System.out.println("nilai x[0] : " + y[0]);
        System.out.println("nilai x[1] : " + y[1]);
        System.out.println("nilai x[2] : " + y[2]);


    }
}
