package com.Tugas;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        //percobaan Array
        String [] sandi = {
                "112233",
                "345345",
                "332211"
        };
        double [] det = {
                1_000_000,
                2_300_111,
                3_890_300
        };


        String pin = "112233";
        double saldo = 2_400_133;

        String ulangi = "y";
        //perulangan
        while (ulangi.equals("y")){
            System.out.print("Masukkan PIN Anda: ");
            String inPin = String.valueOf(bf.readLine());

            //cek pin

            if(Arrays.asList(sandi).contains(inPin)){
                System.out.println("\nDaftar Menu :");
                System.out.println("1. Setor Tunai");
                System.out.println("2. Tarik Tunai");
                System.out.println("3. Cek Saldo");

                System.out.print("\nPilih Menu:");
                int menu = Integer.parseInt(bf.readLine());

                switch (menu){
                    case 1:
                        System.out.println("\nMenu Setor Tunai");
                        System.out.print("Masukan Jumlah Uang\n-> ");
                        double setor = Double.parseDouble(bf.readLine());

                        saldo += setor;
                        System.out.println("Setor Tunai Berhasil");
                        break;
                    case 2:
                        System.out.println("Menu Tarik Tunai");
                        System.out.print("Masukan Jumlah Uang\n-> ");
                        double tarik = Double.parseDouble(bf.readLine());

                        if(tarik <= saldo){
                            saldo -= tarik;
                            System.out.println("Tarik tunai berhasil");
                        }
                        else System.out.println("\nMaaf Saldo Anda Tidak Cukup");
                        break;
                    case 3:
                        System.out.println("Menu Cek Saldo");
                        System.out.println("Saldo anda saat ini: " + saldo);
                        break;

                }
            }else {
                System.out.println("\nMaaf Pin Anda Salah");
            }
            System.out.print("\nTransaksi Lagi? [y/t]\n-> ");
            ulangi = String.valueOf(bf.readLine());

            System.out.println("====================================");
            System.out.println();
        }

    }
}
