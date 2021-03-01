package com.tutorial;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	//Lopping sederhana

        //for
        for(int i = 5; i >=0; i--){
            System.out.println("No " + i);
        }
        System.out.print("\n");
        //While
        int i = 0;
        while (i <= 10){
            i++;
            System.out.println(i);
        }
        System.out.println();
        //Do-While
        int a = 0;
        do {
            System.out.println("Angka ke-" +a);
            a++;
        }while (a <=10);

        System.out.println();

        //For each
        String [] wadah = {"pir", "tomat", "pepaya"};
        for(String buah : wadah){
            System.out.println(buah);
        }
        System.out.println();
        //for nested
        for(int b = 1; b <= 5;b++){
           for (int c=1; c<=5;c++){
               System.out.print(" *");
           }
            System.out.println();
        }
        System.out.println();

        //segitiga siku
        for (int d = 1; d<= 5; d++){
            for (int e = 1; e <= d; e++){
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();

        for (int f = 1; f <=4; f++ ){
            for (int g = 1; g <=4; g++){
                if(f == 1 || f == 4 || g == 1 || g == 4){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
        System.out.println(" ");
        //Program segitiga sama sisi
        System.out.print("Masukan Tinggi = ");
        int tinggi = input.nextInt();
        input.close();
        //tinggi
        for(int j = 1; j <= tinggi; j++){
            //sepasi
            for (int s=tinggi-j; s>0;s--){
                System.out.print(" ");
            }
            //bintang
            for(int k = 1; k<=j; k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
