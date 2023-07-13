package com.ali.homework12;

import java.util.Scanner;

public class standardDeviation {
    public static void run(){
        System.out.println("please enter size of array : ");
        Scanner kb = new Scanner(System.in);
        int SizeOfArray = Integer.parseInt(kb.nextLine());
        double[] arr = new double[SizeOfArray];
        System.out.println("please enter element of array");
        for(int i=0;i<SizeOfArray;i++){
            arr[i]= kb.nextInt();
        }
        double standardDeviation = StandardDeviationCalculate(arr);
        System.out.format("\n Standard Deviation of numbers : %.6f ",standardDeviation);
    }
    public static double StandardDeviationCalculate(double arr[])
    {
        double sum = 0, standardDeviation=0;
        int len = arr.length;
        for(double num : arr){
            sum += num;
        }
        double avg = sum/len;
        for (double num : arr){
            standardDeviation += Math.pow(num - avg, 2);
        }
        return Math.sqrt(standardDeviation/len);
    }

}
