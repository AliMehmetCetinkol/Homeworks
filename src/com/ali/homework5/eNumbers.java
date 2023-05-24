package com.ali.homework5;

import java.util.Scanner;

public class eNumbers {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("please enter value of e :");
        int e = Integer.parseInt(kb.nextLine());

        double n=0,sonuc=0;
        while(n <= e){
            sonuc =sonuc + (1/UtilE.factorial(n));
            ++n;

        }

        System.out.printf("e = %f%n",sonuc);
    }
}
class UtilE{
    public static double factorial(double n)
    {
        double result = 1;

        for(int i = 2; i <= n; ++i)
            result *= i;

        return result;
    }
}
