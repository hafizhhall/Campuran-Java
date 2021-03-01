package com.Latihan;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        String pes, pesawat;
        int tiket;
        double dis, total, harga;

        Scanner input= new Scanner(System.in);
        System.out.println("Masukkan nama pesawat(garuda/lion/batik) ");
        pes= input.nextLine();
        System.out.println("Masukkan banyak tiket yang dibeli");
        tiket= input.nextInt();

        if (pes.equals("garuda") ) {
            pesawat= "Garuda";
            harga= 400000;
            if (tiket<100){
                total= harga;
                dis= 0;
            } else {
                dis= 0.5*harga;
                total= harga-dis;
            }

            System.out.println("Nama Pesawat : "+pesawat);
            System.out.println("Harga Tiket : "+harga);
            System.out.println("Diskon : "+dis);
            System.out.println("Total : "+total);
        }

    }
}
