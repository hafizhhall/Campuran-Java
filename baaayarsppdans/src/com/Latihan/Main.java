package com.Latihan;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int spp,spp1,spp2,spp3,spp4,spp5;
        double ip;
        Scanner input = new Scanner(System.in);

        System.out.println("Program Menentukan Pembayaran SPP");
        System.out.println("-----------------------------------");
        System.out.println("Kategori SPP : ");
        System.out.println("1. Rp 500.000");
        System.out.println("2. Rp 1.650.000");
        System.out.println("3. Rp 3.000.000");
        System.out.println("-----------------------------------");
        System.out.println("Masukkan Kategori SPP : ");
        spp = input.nextInt();

        System.out.println("Masukkan IPK : ");
        ip = input.nextDouble();

        if (spp == 1) {
            if (ip >= 3.0) {
                spp1 = 500000-400000;
                System.out.println("Jumlah yang harus dibayar : " + spp1);
            }
            else if (ip > 3.0 && ip < 3.5) {
                spp2 = 500000-150000;
                System.out.println("Jumlah yang harus dibayar : " + spp2);
            }
            else {
                System.out.println("Jumlah spp yang dibayar = Rp 500.000 ");
            }
        }else if (spp == 2) {
            if (ip >= 2.75) {
                spp3 = 1650000-350000;
                System.out.println("Jumlah yang harus dibayar : " + spp3);
            }
            else if (ip > 2.75 && ip < 3.25 ) {
                spp4 =  1650000-1000000;
                System.out.println("Jumlah yang harus dibayar : " + spp4);
            }
            else {
                System.out.println("Jumlah spp yang dibayar = Rp 1650000");
            }

        }else if (spp == 3.0) {
            if (ip >= 3.00) {
                spp5 = 3000000-1500000;
                System.out.println("Jumlah yang harus dibayar : " + spp5);
            }
            else {
                System.out.println("Jumlah spp yang dibayar = Rp 3000000");
            }
        }
    }
}
