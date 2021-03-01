package com.Latihan;

public class Main {

    public static void main(String[] args) {

        int k = 4;

        for(int i = 1; i<=k; i++){
            for (int j = 1; j <= k; j++){
                if (i == j || j == k){
                    System.out.print(j);
                }else System.out.print(" ");
            }
            System.out.println();

        } k--;
        int i = 1;
        do{
            if(i % 4 == 0){
                System.out.println(i);
            }
            i++;
        }while(i <= 15);
    }
}
