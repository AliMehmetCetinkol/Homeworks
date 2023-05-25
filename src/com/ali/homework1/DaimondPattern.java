package com.ali.homework1;
import java.util.Scanner;
/*
The program that creates the following pattern
when an n number is entered from the keyboard.
 */

public class DaimondPattern {
    public static void run() {
        int row, i, j, space = 1;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        space = row - 1;
        for (j = 1; j<= row; j++) {
            for (i = 1; i<= space; i++) {
                System.out.print(" ");
            }
            space--;
            for (i = 1; i <= 2 * j - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        space = 1;
        for (j = 1; j<= row - 1; j++) {
            for (i = 1; i<= space; i++) {
                System.out.print(" ");
            }
            space++;
            for (i = 1; i<= 2 * (row - j) - 1; i++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
