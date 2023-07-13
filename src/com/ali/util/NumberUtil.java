/***
 *  FILE            : NumberUtil.java
 *  AUTHOR          : Ali Mehmet Çetinkol
 *  LAST UPDATE     : 21.05.2023
 *
 *  NumberUtil class has some math methods to help us.
 *
 *  Copyleft(c) 1997 by Ali Mehmet Çetinkol All Rights Free
 */
package com.ali.util;
import static java.lang.Math.log10;

public class NumberUtil {
    private NumberUtil()
    {
    }
    /**
     * Program that returns an array of up to three digit separated numbers of a long type number.
     * Examples:
     * 1234567 -> 1 234 567
     * 3456	   -> 3 456
     * 567	   -> 576
     * @param a
     * @return int array
     */
    public static int[] getDigitsInThrees(long a)
    {
        return getDigits(a,3);
    }

    /**
     * Program that returns an array of up to two digit separated numbers of a long type number.
     * Examples:
     * 1234567 -> 1 23 45 67
     * 3456	   -> 34 56
     * 567	   -> 5 76
     * @param a
     * @return int array
     */
    public static int[] getDigitsInTwos(long a)
    {
        return getDigits(a,2);
    }

    private static String[] birler = {"","bir","iki","üç","dört","beş","altı","yedi","sekiz","dokuz"};
    private static String[] onlar = {"","on","yirmi","otuz","kırk","elli","atmış","yetmiş","seksen","doksan"};
    private static String[] OnKatları = {"","bin"};

    /**
     * Program that returns the Turkish pronunciation of a maximum of three digits.
     * - The method will not check for numbers greater than 3 digits
     * - Examples:
     * 123 -> one hundred twenty three
     * -123 -> minus hundredtwentythree
     * 203 -> two hundred three
     * @param str
     * @param val
     * @return String
     */
    public static String numToText3DigitsTR(String str, int val)
    {
        int a = val / 100;
        int b = val / 10 % 10;
        int c = val % 10;

        if(a != 0){
            if(a != 1)
                str += birler[a];
            str +="yüz";
        }
        if(b != 0)
            str += onlar[b];

        if(c != 0)
            str += birler[c];

        return str;
    }
    public static String numToTextTR(long val, String str)
    {
        int a = (int) val / 1000000;
        int b = (int) val / 1000;
        int c = (int) val / 100;
        int d = (int) val / 10 % 10;
        int e = (int) val % 10;

        if(a != 0){
            if(a != 1)
                str += birler[a];
            str +=" milyon";
        }
        if(b != 0){
            if(b != 1)
                str += OnKatları[b];
        }
        if(c != 0){
            if(c != 1)
                str += onlar[c];
            str +=" yüz";
        }
        if(d != 0)
            str += onlar[b];

        if(e != 0)
            str += birler[c];

        return str;

    }



    /**
     * this is the overload method of numToText3DigitsTR and checks if the number is negative.
     * @param val
     * @return String
     */
    public static String numToText3DigitsTR( int val)
    {
        return val == 0 ? "sıfır" : numToText3DigitsTR(val < 0 ? "eksi" : "",Math.abs(val));
    }

    /**
     * Program that tests whether an int number is an Armstrong number.
     * - If the digit counter powers of each digit of a number are equal to the number itself, Armstrong
     * called number.
     * For example:
     * 153 -> 1 * 1 * 1 + 5 * 5 * 5 + 3 * 3 * 3 = 153
     * @param a
     * @return true or false
     */
    public static boolean isArmstrong(int a)
    {
        return a >= 0 && getDigitsPowSum(a) == a;
    }

    /**
     * Program that calculates the sum of the powers of the steps.
     * @param a
     * @return int value
     */
    public static int getDigitsPowSum(int a)
    {
        int n = countDigits(a);
        int total = 0;
        while (a != 0) {
            total += Math.pow(a % 10, n);
            a /= 10;
        }

        return total;
    }

    /**
     * Program that returns the number of digits of an int type number.
     * @param a
     * @return int value
     */
    public static int countDigits(int a)
    {
        return a == 0 ? 1 : (int) log10(Math.abs(a)) + 1;
    }

    /**
     * Program that returns the n-th Fibonacci number for n.
     * - Fibonacci numbers:
     *   0 1 1 2 3 5 8 13 21 34 ...
     * - The method will not check for non-positive n values.
     * @param n
     * @return int value
     */
    public static int fibonacciNumber(int n)
    {
        if(n <= 2)
            return n - 1;

        int prev1 = 1, prev2 = 0, val = 0;

        for(int i = 2; i < n; ++i) {
            val = prev1 + prev2;
            prev2 = prev1;
            prev1 = val;
        }

        return val;
    }

    /**
     * Program that tests whether a number of type long is prime.
     * @param a
     * @return
     */
    public static boolean isPrime(long a)
    {
        if (a <= 1)
            return false;

        if (a % 2 == 0)
            return a == 2;

        if (a % 3 == 0)
            return a == 3;

        if (a % 5 == 0)
            return a == 5;

        if (a % 7 == 0)
            return a == 7;

        for (long i = 11; i * i <= a; i += 2)
            if (a % i == 0)
                return false;

        return true;
    }

    /**
     * Program that returns the n-th prime number for an n-value of type int.
     * @param n
     * @return int value
     */
    public static int getPrime(int n)
    {
        int count = 0;
        int val = 2;

        for (;;) {
            if (isPrime(val))
                ++count;

            if (count == n)
                return val;

            ++val;
        }
    }

    /**
     * Program that returns the factorial value of an int number.
     * - The factorial process is as follows:
     * 0! = 1
     * 1!= 1
     * 2! = 1 * 2
     * 3! = 1 * 2 * 3
     * ...
     * n! = 1 * 2 * 3 * ... * (n - 1) * n
     * - For negative numbers, the factorial value will be returned as 1
     * @param n
     * @return int value
     */
    public static int factorial(int n)
    {
        int result = 1;

        for(int i = 2; i <= n; ++i)
            result *= i;

        return result;
    }

    /**
     * The program that does the exponentiation.
     * @param a
     * @param b
     * @return int value
     */
    public static int pow(int a, int b)
    {
        int result = 1;

        for(int i = 0; i < b; i++)
            result *= a;

        return result;

    }

    /**
     * Program that returns the inverse of an int number.
     * Example:
     * 123 -> 3 -> 3 * 10 + 2 = 32 -> 32 * 10 + 1 = 321
     * @param val
     * @return int value
     */
    public static int reversed(int val)
    {
        int result = 0;

        while (val != 0) {
            result = result * 10 + val % 10;
            val /= 10;
        }

        return result;
    }

    /**
     * Program that returns the sum of the digits of a number.
     * @param val
     * @return int value
     */
    public static int sumDigits(int val)
    {
        int sum = 0;

        while (val != 0) {
            sum += val % 10;
            val /= 10;
        }

        return sum;
    }

    /**
     * Program that returns whether an int number is even.
     * @param a
     * @return true or false
     */
    public static boolean isEven(int a)
    {
        return a % 2 == 0;
    }

    /**
     * Program that returns whether an int number is even.
     * @param a
     * @return true or false
     */
    public static boolean isOdd(int a)
    {
        return !isEven(a);
    }

    /**
     * Program that prints two int values to the screen.
     * @param a
     * @param b
     */
    public static void print(int a, int b)
    {
        System.out.printf("%d, %d%n", a, b);
    }

    /**
     * Program to add two values of type int.
     * @param a
     * @param b
     * @return int
     */
    public static int add(int a, int b)
    {
        return a + b;
    }

    /**
     * Program that adds the digits of an int number.
     * @param val
     * @return int value
     */
    public static int digitsSum(int val) {
        int a, b, c;

        a = val / 100;
        b = val / 10 % 10;
        c = val % 10;

        return Math.abs(a + b + c);
    }

    /**
     * Program to multiply two values of type int.
     * @param a
     * @param b
     * @return int value
     */
    public static int multiply(int a, int b)
    {
        return a * b;
    }

    /**
     * Program that takes the square of a number.
     * @param a
     * @return int value
     */
    public static int square(int a)
    {
        return a * a;
    }

    /**
     * Program that returns only the ones digit of a number.
     * @param a
     * @return int value
     */
    public static int [] getDigits(long a)
    {
        return getDigits(a,1);
    }

    /**
     * Program that returns an array of digits of a long number.
     * @param a
     * @param n
     * @return int array
     */
    private static int [] getDigits(long a, int n)
    {
        a = Math.abs(a);
        int [] result = new int[a == 0 ? 1 : (int)(log10(a) / n) + 1];

        int powofTen = (int)pow(10,n);

        for(int i=result.length -1; i >=0; result[i--] = (int)(a % powofTen),a/=powofTen)
            ;

        return result;
    }

    /**
     * Program to find the smallest of 3 int value.
     * @param a
     * @param b
     * @param c
     * @return int
     */
    public static int min(int a,int b,int c)
    {
        return Math.min(Math.min(a,b),c);
    }
}


