package com.ali.homework12;

import com.ali.util.NumberUtil;

import java.util.Scanner;

public class NumToText {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("enter a number :");
        int num = Integer.parseInt(kb.nextLine());
        String fmt = (num < 0 ? "-%03d " : "%03d ") + " -> %s%n";
        //System.out.printf(fmt,Math.abs(num),NumberUtil.numToTextTR(num));
    }

}



