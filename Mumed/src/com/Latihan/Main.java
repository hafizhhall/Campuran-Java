package com.Latihan;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// If bersarang
        //Nama :Hafizh Athallah Widianto
        //NPM  :5200311097
        Scanner input = new Scanner(System.in);
        // deklarasi
        String jawaban, kendaraan, cuaca;
        //memulai program
        System.out.print("Apakah anda akan pergi ke kampus? (ya/tidak)");
        jawaban = input.nextLine();

         if(jawaban.equals("ya")){
            System.out.print("Anda Naik motor atau mobil (mobil/motor)");
            kendaraan = input.nextLine();
            if(kendaraan.equals("motor")) {
                System.out.print("apakah sekarang hujan?(Ya/Tidak)");
                cuaca = input.nextLine();
                if(cuaca.equals("ya")) {
                    System.out.print("Hati - hati Kekampus Naik Motor Pas Hujan, Jangan Lupa Pakai Jas Hujan");
                } else {
                    System.out.print("Hati - hati Jangan Ngebut Dan Tetap Waspada");
                }
            }else {
                System.out.println("Pastikan mobil sudah ada, jangan - jangan masih di showroom");
            }
        }else {
             System.out.print("Belajar di rumah"); }
        }

    }

