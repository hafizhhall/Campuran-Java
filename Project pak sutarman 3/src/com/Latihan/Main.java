package com.Latihan;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// Soal no 3
        Scanner input = new Scanner(System.in);

        //variabel
        String  jenis;
        double kode, harga, diskon, total;

        //memulai

        System.out.print("Masukan jenis (A-C) = ");
        jenis = input.nextLine();
        System.out.print("Masukkan kode = ");
        kode = input.nextDouble();
        System.out.print("Masukkan harga = ");
        harga = input.nextDouble();
        //kondisi
        if (jenis.equals("A") || jenis.equals("a")){
            System.out.println("Mendapat diskon 10%");
            diskon = harga * 0.1;
            total = harga - diskon;
            System.out.println("Harga Setelah Diskon = " +total);
        }else if (jenis.equals("B") || jenis.equals("b")){
            System.out.println("Mendapat diskon 15%");
            diskon = harga * 0.15;
            total = harga - diskon;
            System.out.println("Harga Setelah Diskon = " +total);
        }else if (jenis.equals("C") || jenis.equals("c")){
            System.out.println("Mendapat diskon 20%");
            diskon = harga * 0.2;
            total = harga - diskon;
            System.out.println("Harga Setelah Diskon = " +total);
        }else {
            System.out.println("Jenis tidak tersedia");
        }
    }
}
