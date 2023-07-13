package com.ali.homework10;

import java.util.Arrays;
import java.util.Scanner;

public class isPossibleTest {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("please enter number A :");
        int a = kb.nextInt();
        System.out.println("please enter number B :");
        int b = kb.nextInt();
        boolean writable = isPossible(a,b);
        System.out.println("A: " + a + ", B: " + b + " - " + (writable ? "writable" : "cannot be written"));
    }

    public static boolean isPossible(int a, int b)
    {
        String strA = String.valueOf(a);
        String strB = String.valueOf(b);

        char[] digitsA = strA.toCharArray();
        char[] digitsB = strB.toCharArray();
        Arrays.sort(digitsA);
        Arrays.sort(digitsB);

        int i = 0, j = 0;
        while (i < digitsB.length && j < digitsA.length) {
            if (digitsB[i] == digitsA[j]) {
                i++;
                j++;
            } else {
                j++;
            }
        }

        return i == digitsB.length;
    }
}
