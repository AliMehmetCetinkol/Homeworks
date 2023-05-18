package com.ali.homework1;

public class ReturnMidValue {
    public static void main(String[] args) {
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
        System.out.print("Bir sayı giriniz:");

        while ((val = Integer.parseInt(kb.nextLine())) != 0) {
            System.out.printf("%d sayısının basamak sayısı:%d%n", val, NumberUtil.reversed(val));
            System.out.println("Bir sayı giriniz:");
        }

        System.out.printf("0 sayısının basamak sayısı:%d%n", NumberUtil.reversed(0));
        System.out.println("Tekrar yapıyor musunuz?");
    }
}
