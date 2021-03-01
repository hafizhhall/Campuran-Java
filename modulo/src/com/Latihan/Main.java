package com.Latihan;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a,b,c,d,e,f;

        a = 18;
        b = 10;
        c = 5;

        //proses
        d = 2 * a++ * b + c-- + a++;
        e = 12 + ++c - 2 * b++ + d ;
        f = 19%3 * c-- + d/2 - ++a ;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
    }
}
