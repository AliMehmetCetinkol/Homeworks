package com.ali.homework4;

import java.util.Scanner;

public class SumMaxMinAvg {
    public static void main(String[] args) {
        UtilS.run();
    }
}
class UtilS{
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        int val;
        int sum = 0, count = 0;
        int MaxVal=0,MinVal=0;
        double Avg=0;
        int temp1,temp2;
        System.out.println("Enter an integer value : ");
        for(;;){
            val = Integer.parseInt(kb.nextLine());
            System.out.println("press 1 if you want to enter a new value, press 0 if no");

            if(val == 0){
                break;
            } else if (val == 1) {
                System.out.println("Enter an integer value :");
                continue;
            }
            sum += val;
            ++count;
            Avg = (double) sum / count;
            temp1 = val;
            MaxVal = Math.max(MaxVal,temp1);
            temp2 = val;
            MinVal = Math.min(MinVal,temp2);

            if(val < 100 && val > 0){

            }else{
                System.out.println("you entered an invalid value!.....");
                System.out.println("Enter an integer value :");
            }
        }
        System.out.printf("Total numbers entered: %d%n",count);
        System.out.printf("largest value entered : %d%n",MaxVal);
        System.out.printf("smallest value entered : %d%n",MinVal);
        System.out.printf("average of the numbers entered : %f%n",Avg);
    }
}
