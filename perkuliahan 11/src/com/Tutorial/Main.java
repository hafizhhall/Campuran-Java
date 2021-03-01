package com.Tutorial;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        int[][] nilai = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.deepToString(nilai));
        System.out.println();

        for (int i = 0; i < 3; i++){
            for (int j = 0; j <3; j++){
                System.out.print(nilai[i][j] + " ");
            }
            System.out.println();
        }

    }
}
