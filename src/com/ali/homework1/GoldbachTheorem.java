package com.ali.homework1;

import java.util.Scanner;

public class GoldbachTheorem {
    public static boolean isPrime(int num){
        int count = 0;
        for (int i = 1; i <= num; i++){
            if (num % i == 0) {
                count++;
            }
        }
        return count == 2;
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("bir sayı giriniz : ");
        int n = in.nextInt();

        if (n <= 2){
            System.out.println("geçerli sayı giriniz.");
            return;
        }
        if (n % 2 != 0){
            System.out.println("girdiğiniz sayı tek sayıdır. Lütfen çift sayı giriniz.");
            return;
        }
        System.out.println("asal toplamları :");

        int a = 3;
        int b = 0;
        while (a <= n / 2){
            b = n - a;

            if (isPrime(a) && isPrime(b)){
                System.out.println(a + ", " + b);
            }
            a += 2;
        }
    }
}
