package com.Latihan;
public class Main {

    public static void main(String[] args) {
        int[] nilai = {55,1,13,12,41,3,6,9};
        selectionInt(nilai);
    }
    public static void selectionInt( int[] bil){
        // TODO : Sebelum
        System.out.println("===Sebelum===");
        for( int b : bil){
            System.out.print(b+ " ");
        }
        //Proses
        for (int i = 0; i < bil.length; i++){

            int indexKe = i;
            for (int j = i; j < bil.length; j++){
                if (bil[indexKe] < bil[j] ){
                    indexKe = j;
                }
            }
            int tamp = bil[i];
            bil[i] = bil[indexKe];
            bil[indexKe] = tamp;
        }
        // TODO : Sesudah
        System.out.println("\n===Sesudah===");
        for( int b : bil){
            System.out.print(b+ " ");
        }
    }
}
