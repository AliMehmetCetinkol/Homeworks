package com.ali.homework2;
import java.util.Scanner;
/*
All even prime numbers greater than 2 can be written as the sum of two prime numbers.
The program that takes an even number from the keyboard and prints it as the sum of two prime numbers.
Example;
Number : 16
Solution : 11 + 5
 */

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
    public static void run(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = in.nextInt();

        if (n <= 2){
            System.out.println("Enter a ınvalid number.");
            return;
        }
        if (n % 2 != 0){
            System.out.println("This number is odd. Please enter.");
            return;
        }
        System.out.println("Sum of prime number  :");

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
