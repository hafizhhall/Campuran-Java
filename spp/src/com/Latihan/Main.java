package com.Latihan;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukkan Kategori SPP (1/2/3) = ");
        int inp1 = keyboard.nextInt();

        if (inp1 == 1) {
            //spp kategori 1
            int spp1 = 500000;
            System.out.print("Masukkan IP : ");
            double inp2 = keyboard.nextDouble();
            if (inp2 >= 3.5) {
                int kerSpp1 = spp1-400000;
                System.out.println("Kategori SPP anda : Kategori 1");
                System.out.println("IP anda : " + inp2);
                System.out.println("Keringanan biaya : Rp. 400.000");
                System.out.println("Besar SPP yang harus dibayar : Rp. " + kerSpp1);
            } else {
                if (inp2>3.0) {
                    int kerSpp2 = spp1-150000;
                    System.out.println("Kategori SPP anda : Kategori 1");
                    System.out.println("IP anda : " + inp2);
                    System.out.println("Keringanan biaya : Rp. 150.000");
                    System.out.println("Besar SPP yang harus dibayar : Rp. " + kerSpp2);
                } else {
                    System.out.println("Kategori SPP anda : Kategori 1");
                    System.out.println("IP anda : " + inp2);
                    System.out.println("Keringanan biaya : -");
                    System.out.println("Besar SPP yang harus dibayar : Rp. " + spp1);
                }
            }
        } else {
            //spp kategori 2
            if (inp1 == 2) {
                int spp2 = 1650000;
                System.out.print("Masukkan IP : ");
                double inp3 = keyboard.nextDouble();
                if (inp3 >=3.25) {
                    int kerSpp21 = spp2-1000000;
                    System.out.println("Kategori SPP anda : Kategori 2");
                    System.out.println("IP anda : " + inp3);
                    System.out.println("Keringanan biaya : Rp. 1.000.000");
                    System.out.println("Besar SPP yang harus dibayar : Rp. " + kerSpp21);
                } else {
                    if (inp3 > 2.75) {
                        int kerSpp21 = spp2-350000;
                        System.out.println("Kategori SPP anda : Kategori 2");
                        System.out.println("IP anda : " + inp3);
                        System.out.println("Keringanan biaya : Rp. 350.000");
                        System.out.println("Besar SPP yang harus dibayar : Rp. " + kerSpp21);
                    } else {
                        System.out.println("Kategori SPP anda : Kategori 2");
                        System.out.println("IP anda : " + inp3);
                        System.out.println("Keringanan biaya : -");
                        System.out.println("Besar SPP yang harus dibayar : Rp. " + spp2);
                    }
                }
            } else {
                //spp kategori 3
                int spp3 = 3000000;
                System.out.print("Masukkan IP : ");
                double inp4 = keyboard.nextDouble();
                if (inp4 >= 3.0) {
                    int kerSpp31 = spp3-1500000;
                    System.out.println("Kategori SPP anda : Kategori 3");
                    System.out.println("IP anda : " + inp4);
                    System.out.println("Keringanan biaya : Rp. 1.500.000");
                    System.out.println("Besar SPP yang harus dibayar : Rp. " + kerSpp31);
                } else {
                    System.out.println("Kategori SPP anda : Kategori 3");
                    System.out.println("IP anda : " + inp4);
                    System.out.println("Keringanan biaya : -");
                    System.out.println("Besar SPP yang harus dibayar : Rp. " + spp3);
                }
            }
        }
    }
}
