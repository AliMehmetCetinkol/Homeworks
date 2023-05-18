package com.ali.homework3;

import java.util.Scanner;

public class DigitalRoot {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("bir sayı giriniz : ");
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
