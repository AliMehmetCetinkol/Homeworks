package com.ali.homework9;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class masterMind {
    public static void run() {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        int[] combo = new int[4];

        for (int i = 0; i <4; i++)
        {
            combo[i] = r.nextInt(6)+1 ;
        }
        int count = 0;
        int[] guess = new int[4];

        ArrayList<String> result = new ArrayList<String>();
        boolean winner = false;

        System.out.println("Welcome to Mastermind! You have ten guesses to win- Each turn you will guess 4 numbers between 1 and 6");
        System.out.println("If you guess a correct numbber but in the wrong place, a '-' will appear. If you guess a number in its right place, a '+' will appear");
        System.out.println("Good luck!");

        while (count<10)
        {
            count++;
            int pos = 1;

            System.out.println("Enter guess #" + count);

            for(int i =0; i<4; i++)
            {
                System.out.println("Postition " + pos++ + "");
                guess[i] = sc.nextInt();

                if (guess[i] > 9 || guess [i] < 1)
                {
                    throw new IllegalArgumentException("Guesses must be inbetween 1 and 9!");
                }
            }
            for (int i=0; i<4; i++)
            {
                if (guess[i] == combo[i])
                {
                    result.add("+");
                }
            }
            if (guess[0]==combo[1] || guess[0]==combo[2] || guess[0]==combo[3])
            {
                result.add("-");
            }
            if (guess[1]==combo[2] || guess[1]==combo[3] || guess[1] == combo[0])
            {
                result.add("-");
            }
            if (guess[2]==combo[0] || guess[2]==combo[1] || guess[2] == combo[3])
            {
                result.add("-");
            }
            if (guess[3]==combo[0] || guess[3]==combo[1] || guess[3] == combo[2])
            {
                result.add("-");
            }
            if (guess[0] == combo[0] && guess[1] == combo[1] && guess[2] == combo[2] && guess[3] == combo[3])
            {
                winner = true;
                break;
            }
            for(int i=0; i<4; i++)
            {
                System.out.print(combo[i] + " ");
            }
            System.out.print("Your result for this guess is " + result);
            result.clear();

            if (count == 10)
            {
                System.out.println("Sorry, you lost! Try again.");
                break;
            }
        }
        if (winner == true)
        {
            System.out.println("Congratulations, you won!");
        }
    }
}
