package com.ali.homework9;

import java.util.Scanner;

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
        sort(arr);
        result = arr[arr.length-2];
        System.out.printf("arr[result] %d",result);
    }
    public static void sort(int [] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int tmp = 0;
                if (a[i] > a[j]) {
                    tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }

    }
}
