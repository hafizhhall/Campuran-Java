package com.Tutorial;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
       BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
       //Variabel
        String nama, alat,ya;
        int total, diskon;

        //Daftar alat
        System.out.println("=========================================");
        System.out.println("Kode Alat |   Nama Alat    | Tarif perjam");
        System.out.println("   01     | Excavator Mini |    170000");
        System.out.println("   02     | Excavator PC10 |    165000");
        System.out.println("   03     | Excavator PC20 |    180000");
        System.out.println("=========================================");

        System.out.print("\nNama Nasabah: ");
        nama = String.valueOf(bf.readLine());

        //masukkan
        do {
            System.out.print("Kode Alat: ");
            int kode = Integer.parseInt(bf.readLine());

            if (kode == 1) {
                System.out.println("Nama alat    :Excavator Mini");
                System.out.println("Tarif perjam :170000 ");
            } else if (kode == 2) {
                System.out.println("Nama alat    :Excavator PC10");
                System.out.println("Tarif perjam :165000");
            } else if (kode == 3) {
                System.out.println("Nama alat    :Excavator PC20");
                System.out.println("Tarif perjam :180000");
            } else {
                System.out.println("Kode Invalid");
            }

            System.out.print("\nLama Sewa: ");
            int lama = Integer.parseInt(bf.readLine());
            if (kode == 1) {
                if (lama <= 10) {
                    total = lama * 170000;
                    System.out.println("Total Tarif: " + total);
                } else {
                    total = lama * 170000;
                    System.out.println("Total Tarif: " + total);
                    diskon = (int) (total * 0.05);
                    System.out.println("Potongan: " + diskon);
                }
            } else if (kode == 2) {
                if (lama <= 10) {
                    total = lama * 165000;
                    System.out.println("Total Tarif: " + total);
                } else {
                    total = lama * 165000;
                    System.out.println("Total Tarif: " + total);
                    diskon = (int) (total * 0.05);
                    System.out.println("Potongan: " + diskon);
                }
            } else if (kode == 3) {
                total = lama * 180000;
                System.out.println("Total Tarif: " + total);
            }


            System.out.print("Menyewa alat lain? [ya/tidak]: ");
            ya = bf.readLine();
        }while (ya.equals("ya"));
    }
}
