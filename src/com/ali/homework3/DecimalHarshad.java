package com.ali.homework3;

import java.util.Scanner;

public class DecimalHarshad {
    public static void main(String[] args) {
        CallUtil.isDecimalHarshad();
    }
}
class CallUtil{
    public static void isDecimalHarshad()
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("bir sayı giriniz : ");
        int num = Integer.parseInt(kb.nextLine());

        int rem = 0, sum = 0, n;
        n = num;

        while(num > 0){
            rem = num%10;
            sum = sum + rem;
            num = num/10;
        }
        if(n%sum == 0)
            System.out.println(n + " harshad sayısıdır.");
        else
            System.out.println(n + " harshad sayısı değildir.");
    }
}
