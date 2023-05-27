package com.ali.homework7;

public class BingoBag {
    public static void run() {
        java.util.Random r = new java.util.Random();
        int sum=0 ;
        int pul1,pul2,pul3;
        int Max=0,Min=0,mid=0;
        for(int i=0;i<3;i++){
            pul1 = r.nextInt(100);
            pul2 = r.nextInt(100);
            pul3 = r.nextInt(100);
            sum = pul1 + pul2 + pul3;
            Max = Math.max(pul1,Math.max(pul2,pul3));
            Min = Math.min(pul1,Math.min(pul2,pul3));
            mid = sum - Max - Min;
        }
        if(sum < 150){
            System.out.printf("%d 150 den küçük oyuncu kazandı%n",sum);
        }else{
            System.out.printf("%d 150 den büyük kaybetti.%n",sum);
        }
        if(UtilBingo.isPrime(sum)){
            System.out.printf("%d sayı asal oyuncu kazandı%n",sum);
        }else {
            System.out.printf("%d sayı asal değil kaybetti.%n", sum);
        }
        if(Max - Min == mid) {
            System.out.printf("%d sayısı büyük ve küçük sayının farkına eşittir oyuncu kazandı%n", mid);
        }else{
            System.out.printf("%d sayısı büyük ve küçük sayının farkına eşit değildir oyuncu kaybetti%n",mid);
        }
    }
}
class UtilBingo{
    public static boolean isPrime(int a)
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

