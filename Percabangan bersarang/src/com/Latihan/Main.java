package com.Latihan;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    //Nama: Hafizh Athallah Widianto
        //NPM : 5200311097

        Scanner input = new Scanner(System.in);
        System.out.print("Apakah anda akan ke kampus? <y/t>: ");
        String pil = input.nextLine();
        if (pil.equals("y")) {
            System.out.println("Anda naik motor atau naik mobil? ");
            System.out.println("1. Naik motor");
            System.out.println("2. Naik mobil");
            System.out.print("Pilih 1..2: ");
            pil = input.nextLine();
            if (pil.equals("1")) {
                System.out.print("Apakah sekarang hujan? <y/t>: ");
                pil = input.nextLine();
                if (pil.equals("y")) {
                    System.out.println("Hati-hati ke kampus naik motor pas hujan, jangan lupa pakai jas hujan");
                } else {
                    System.out.println("Hati-hati jangan ngebut dan tetap waspada");
                }
            } else if(pil.equals("2")) {
                System.out.println("Pastikan mobil sudah ada");
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        } else {
            System.out.println("Belajar dirumah");
        }
    }
}


