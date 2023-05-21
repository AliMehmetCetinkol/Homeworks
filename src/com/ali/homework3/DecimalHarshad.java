package com.ali.homework3;
import java.util.Scanner;
/*
The program that finds whether an int type number that it takes with
its parameter is a Harshad number in the 10 system.
 */

public class DecimalHarshad {
    public static void main(String[] args) {
        CallUtil.isDecimalHarshad();
    }
}
class CallUtil{
    public static void isDecimalHarshad()
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num = Integer.parseInt(kb.nextLine());

        int rem = 0, sum = 0, n;
        n = num;

        while(num > 0){
            rem = num%10;
            sum = sum + rem;
            num = num/10;
        }
        if(n%sum == 0)
            System.out.println(n + " is harshad number.");
        else
            System.out.println(n + " is not harshad number.");
    }
}
