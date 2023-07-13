package com.ali.homework9;

import java.util.Scanner;

import static com.ali.util.ArrayUtil.bubbleSort;

public class secondMax {
    public static void run()
    {
        int [] arr = new int[10];
        int result;
        Scanner kb = new Scanner(System.in);
        System.out.println("dizinin boyunu girin : ");
        int size = Integer.parseInt(kb.nextLine());
        for(int i=0;i<size;i++){
            System.out.println("dizinin elemanları : ");
            arr[i] = Integer.parseInt(kb.nextLine());
        }
        bubbleSort(arr);
        result = arr[arr.length-2];
        System.out.printf("arr[result] %d",result);
    }
}
