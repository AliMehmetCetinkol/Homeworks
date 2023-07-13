package com.ali.homework5;

import java.util.Scanner;

import static com.ali.util.NumberUtil.factorial;

public class eNumbers {
    public static void run() {
        Scanner kb = new Scanner(System.in);
        System.out.print("please enter value of e :");
        int e = Integer.parseInt(kb.nextLine());

        int n=0,sonuc=0;
        while(n <= e){
            sonuc =sonuc + (1/factorial(n));
            ++n;

        }

        System.out.printf("e = %f%n",sonuc);
    }
}

