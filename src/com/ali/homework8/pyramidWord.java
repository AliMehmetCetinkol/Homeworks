package com.ali.homework8;

import java.util.Scanner;

public class pyramidWord {
    public static void run()
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("write word  : ");
        String str = kb.nextLine();
        for(int i=0; i< str.length();++i){
            for(int j=0;j<=i;j++){
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }
    }
}
