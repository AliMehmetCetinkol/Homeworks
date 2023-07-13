package com.ali.homework7;

import static com.ali.util.NumberUtil.isPrime;

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
        if(isPrime(sum)){
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

