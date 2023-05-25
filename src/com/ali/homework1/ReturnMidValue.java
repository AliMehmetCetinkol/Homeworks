package com.ali.homework1;
/*
The program that returns the median of 3 numbers of int type
that it takes with its parameter.
 */
public class ReturnMidValue {
    public static void run() {
        CountDigitsTest.run();
    }
}
class NumberUtil{
    public static int reversed(int val){
        int reverse=0;

        while(val != 0){

        }
        return reverse;
    }
}
class CountDigitsTest {
    public static void run()
    {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        int val;
        System.out.print("Enter a number:");

        while ((val = Integer.parseInt(kb.nextLine())) != 0) {
            System.out.printf("%d number of digit :%d%n", val, NumberUtil.reversed(val));
            System.out.println("enter a number:");
        }

        System.out.printf("0 number of digit :%d%n", NumberUtil.reversed(0));

    }
}
