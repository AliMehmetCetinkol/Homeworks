package com.ali.homework3;
import java.util.Scanner;
/*
In this method, it tests whether the argument sent is prime, and if the number is prime,
this time it checks whether the number obtained by adding the digits of the number is prime.
 */
public class PrimeX {
    public static void run() {
        run();
    }

    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("enter a number : ");
        int val = Integer.parseInt(kb.nextLine());

        boolean flag = true;

        while(val != 0){
            flag = isPrime(val);
            if(flag && val >= 10){
                val = isPrimeX(val);
            }else{
                break;
            }
        }
        System.out.println(flag);
    }
    public static int isPrimeX(int prime)
    {
        int count = 0, sum = 0;
        int temp = prime;

        while(temp != 0){
            temp = temp / 10;
            count++;
        }
        for(int i=0;i< count;i++){
            sum = sum + prime %10;
            prime = prime / 10;
        }
        return sum;
    }
    public static boolean isPrime(int val)
    {
        if(val <= 1)
            return false;

        if(val % 2 == 0)
            return val == 2;

        if(val % 3 == 0)
            return val == 3;

        if(val % 5 == 0)
            return val == 5;

        if(val % 7 == 0)
            return val == 7;

        for(long i = 11; i * i <= val; i += 2)
            if(val % i == 0)
                return false;

        return true;
    }
}
