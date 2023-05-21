package com.ali.homework3;
import java.util.Scanner;
/*
The program that finds whether an int number that
it takes with its parameter is a collatz series.
 */
public class CollatzNumber {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        System.out.println("Collatz numbers : ");
        int val = Integer.parseInt(kb.nextLine());
        while(val != 1){
            if(val % 2 == 0){
                val = val / 2;
            }else{
                val = 3 * val + 1;
            }
            System.out.println(val);
        }
    }
}
