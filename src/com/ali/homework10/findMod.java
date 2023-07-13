package com.ali.homework10;

import com.ali.util.ArrayUtil;
import java.util.Scanner;

public class findMod {
    public static void run()
    {
        System.out.println("enter the size of array : ");
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int [] a = new int[n];
        System.out.println("enter the elements of array : ");
        for(int i=0;i<n;i++){
            a[i]=kb.nextInt();
        }
        ArrayUtil.mod(a);
    }
}
