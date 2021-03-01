package com.Latihan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// if bersarang

        Scanner input = new Scanner(System.in);
        boolean Ya ,Tidak;
        Ya = true;
        Tidak = false;
        boolean mobil, motor;
        mobil = false;
        motor = true;

        System.out.println("Apakah adna hari ini ke kampus?(Ya/Tidak)");
        String Pilihan1 = input.next();

        if(Ya == true) {
            System.out.print("Anda naik motor atau mobil?");
            String pilihan = input.next();
            if(motor){
                System.out.println("Apakah sekarang hujan? (Ya/Tidak)");
                String Pilihan = input.next();
                if (motor){
                    System.out.println("Hati - hati Kekampus Naik Motor Pas Hujan, Jangan Lupa Pakai Jas Hujan");
                }else {
                    System.out.println("Hati - hati Jangan Ngebut Dan Tetap Waspada");
                }
            }else {
                System.out.println("Pastikan mobil sudah ada, jangan - jangan masih di showroom");
            }
        }

        else {
            System.out.println("jika tidak belajar di rumah");
        }
    }
}
