package com.ali.homework3;
import java.util.Scanner;
/*
This program finds the digit root of a number.
The digit root of a number is the number obtained by adding all its digits.
Adding digits continues until a single digit number is obtained.
 */
public class DigitalRoot {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num = Integer.parseInt(kb.nextLine());
        System.out.println(digitsRoot(num));
    }
    public static int digitsRoot(int num)
    {
        int root = 0;
        while (num > 0 || root > 9)
        {
            if (num == 0) {
                num = root;
                root = 0;
            }
            root += num % 10;
            num /= 10;
        }
        return root;
    }
}
