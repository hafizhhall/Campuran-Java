package com.Tugas;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Program perkalian 4 bilangan");
        System.out.println();

        int jum = 1;

        for(int i = 1; i <= 4; i++){
            System.out.print("masukan bilangan ke "+i+" = ");
            int angka = input.nextInt();

            jum = jum * angka;

            System.out.println();
        }
        System.out.println("======================");
        System.out.println("jumlah perkalian 4 bilngan = " +jum);
    }
}
