package com.Bantu;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        //variabel
        int kwh, gol,tot,tamb;

        //listrik
        System.out.println("Pembayaran Listrik Perumahan");
        System.out.print("Golongan Listrik Anda: ");
        gol = Integer.parseInt(bf.readLine());
        System.out.print("Jumlah Pemakaian Kwh: ");
        kwh = Integer.parseInt(bf.readLine());

        if(gol == 1){
            if(kwh >= 50){
                tot = kwh * 1000;
                System.out.print("Total Tagihan Anda: " + tot);
            }else {
                System.out.print("Tagihan anda belum ada!!!");
            }
        }else if(gol == 2){
            if(kwh >= 50){
                tot = kwh * 2000;
                System.out.print("Total Tagihan Anda: " + tot);
            }else {
                System.out.print("Tagihan anda belum ada!!!");
            }
        }else if(gol == 3){
            if(kwh >= 1000){
                tot = kwh * 3000;
                tamb = (int) (tot * 0.1);
                tot = tamb + tot;
                System.out.print("Total Tagihan Anda + 10%: " + tot);
            }else if(kwh >=100){
                tot = kwh * 3000;
                System.out.print("Total Tagihan Anda: " + tot);
            }else {
                System.out.print("Tagihan anda belum ada!!!");
            }
        }
        else if(gol == 4){
            if(kwh >= 1000){
                tot = kwh * 4000;
                tamb = (int) (tot * 0.1);
                tot = tamb + tot;
                System.out.print("Total Tagihan Anda + 10%: " + tot);
            }else if(kwh >=100){
                tot = kwh * 5000;
                System.out.print("Total Tagihan Anda: " + tot);
            }else {
                System.out.print("Tagihan anda belum ada!!!");
            }
        }
        else if(gol == 5){
            if(kwh >= 1000){
                tot = kwh * 5000;
                tamb = (int) (tot * 0.15);
                tot = tamb + tot;
                System.out.print("Total Tagihan Anda + 15%: " + tot);
            }else if(kwh >=100){
                tot = kwh * 5000;
                System.out.print("Total Tagihan Anda: " + tot);
            }else {
                System.out.print("Tagihan anda belum ada!!!");
            }
        }

    }
}
