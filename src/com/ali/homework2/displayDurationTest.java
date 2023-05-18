package com.ali.homework2;

import java.util.Scanner;

public class displayDurationTest {
    public static void main(String[] args){
        UtilDisplay.displayDuration();
    }
}
class UtilDisplay{
    public static void displayDuration()
    {
        Scanner kb = new Scanner(System.in);
        System.out.print("Saniyeyi giriniz : ");
        long saniye = Long.parseLong(kb.nextLine());
        Long S = saniye % 60;
        Long H = saniye / 60;
        Long M = H % 60;
        H = H / 60;
        System.out.printf("%s:%s:%s",H,M,S);
        System.out.print("\n");
    }
}
