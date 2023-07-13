package com.ali.homework1;

import com.ali.util.NumberUtil;

/*
The program that returns the median of 3 numbers of int type
that it takes with its parameter.
 */
public class ReturnMidValue {
    public static void run() {
        CountDigitsTest.run();
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
