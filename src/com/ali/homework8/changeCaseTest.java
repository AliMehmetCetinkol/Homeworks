package com.ali.homework8;

import java.util.Scanner;

public class changeCaseTest {
    public static String changeCase()
    {
        String result = "" ;
        Scanner kb = new Scanner(System.in);
        System.out.print("Write a sentence : ");
        String str = kb.nextLine();
        for (int i = 0; i < str.length(); i++)
        {
            char c = str.charAt(i);
            boolean check = Character.isUpperCase(c);
            if (check == true)
                result += Character.toLowerCase(c);
            else
                result += Character.toUpperCase(c);
        }
        System.out.println(result);

        return result;
    }
}


