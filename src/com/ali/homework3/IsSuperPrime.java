package com.ali.homework3;
/*
This program finds super prime numbers.
Super prime numbers are both prime numbers and index numbers are prime numbers.
 */
public class IsSuperPrime {
    public static void main(String [] args)
    {
        IsSuperPrimeTest.run();
    }
}
class IsSuperPrimeTest{
    public static void run() {
        int count = 0;
        for (int a = 0; a <= 100; ++a){
            if (NumberUtilP.isSuperPrime(a)){
                if(NumberUtilP.isSuperPrime(count)){
                    System.out.printf("%d : %d **%n  ",count, a);
                    count++;
                }else{
                    System.out.printf("%d : %d%n ",count, a);
                    count++;
                }
            }
        }
    }
}
class NumberUtilP{
    public static boolean isSuperPrime(long a)
    {
        if(a <= 1)
            return false;

        if(a % 2 == 0)
            return a == 2;

        if(a % 3 == 0)
            return a == 3;

        if(a % 5 == 0)
            return a == 5;

        if(a % 7 == 0)
            return a == 7;

        for(long i = 11; i * i <= a; i += 2)
            if(a % i == 0)
                return false;

        return true;
    }
}
