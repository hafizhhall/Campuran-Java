package com.Tutorial;

public class Main {

    public static void main(String[] args) {

        int [] angka = {21,56,34,80,12,11,2};
        bubbleShortASCInt(angka);

        int [] angka1 = {12,43,11,76,32,11,12};
        bubbleShortASCInt(angka1);

    }
    public static void bubbleShortASCInt ( int[] Bilangan ){
        System.out.println("\n==Sebelum==");
        for(int bil : Bilangan){
            System.out.print(bil);
            if (Bilangan.length < bil) System.out.print(", ");
        }

        //proses penukaran angka
        for(int i = 0; i < Bilangan.length; i++){
            for(int j = 0; j < Bilangan.length-1; j++){
                if(Bilangan[j] > Bilangan[j+1]){
                    int tamp = Bilangan[j];
                    Bilangan[j] = Bilangan[j+1];
                    Bilangan[j+1] = tamp;
                }
            }
        }
        System.out.println("\n==Sesudah==");
        for(int i = 0; i < 7 ; i++){
            System.out.print(Bilangan[i]);
            if( i != 6) System.out.print(", ");
        }
        System.out.print("\n");
    }
}//ini akhir program
