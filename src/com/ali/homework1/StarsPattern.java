package com.ali.homework1;
/*
This program is simple ball fall game.
You can direct the game by entering the height and width variables.
 */
public class StarsPattern {
    public static void run() {
        java.util.Scanner kb = new java.util.Scanner(System.in);
        System.out.println("Enter a height :");
        int height = Integer.parseInt(kb.nextLine());
        System.out.println("Enter awidth :");
        int width = Integer.parseInt(kb.nextLine());
        print(height,width);
    }
    public static void print(int height, int width)
    {
        boolean directionFlag = true;
        int val = 0;
        for (int i = 0; i < height; i++) {
            if (directionFlag) {
                val++;
            } else {
                val--;
            }
            for (int k = 0; k < width; k++) {
                if (k == 0 || k == width - 1) {
                    System.out.print("|");
                    continue;
                }
                if ((k > 0 && k < width - 1) && k != val) {
                    System.out.print(" ");
                    continue;
                }
                if (val == k) {
                    if (val == width - 2)
                        directionFlag = false;
                    if (val == 1)
                        directionFlag = true;
                    System.out.print("*");
                    boolean printFlag = false;
                }
            }
            System.out.println();
        }
    }
}
