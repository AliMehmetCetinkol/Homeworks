package com.ali.homework5;
import java.util.Scanner;

public class SumFactor {
    public static void run() {
        SumUtil.sumFactors();
    }
}
class SumUtil{
    public static void sumFactors()
    {
        int sum = 0;
        int i;
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter a value : ");
        int val = Integer.parseInt(kb.nextLine());
        for( i =1;i<val;i++){
            if(val % i == 0){
                sum += i;

            }
        }
        System.out.println(sum);
    }
}
