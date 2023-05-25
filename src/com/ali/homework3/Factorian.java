package com.ali.homework3;
/*
This program task is to find the factorian numbers.
A number whose sum of the factorials of its digits is equal to itself.
 */
public class Factorian {
    public static void run()
    {
        FactorialTest.run();
    }
}
class FactorialTest {
    public static void run()
    {
        for (int n = 0; n <= 1000; ++n){
            if(UtilF.digitsSum(n)== UtilF.factorial(n)){
                System.out.printf("%d! = %30d%n", n, UtilF.factorial(n));
            }
        }

    }
}
class UtilF{
    public static int factorial(int n)
    {
        int result = 1;

        for(int i = 2; i <= n; ++i)
            result *= i;

        return result;
    }
    public static int digitsSum(int n)
    {
        int a, b, c;

        a = n / 100;
        b = n / 10 % 10;
        c = n % 10;

        return factorial(a) + factorial(b) + factorial(c) ;
    }
}
