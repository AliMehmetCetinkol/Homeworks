package com.ali.homework7;

import java.util.Random;

public class printRandomDate {
    public static void main(String[] args) {
        IsValidDateTest.run();
    }
}
class IsValidDateTest{
    public static void run()
    {
        Random r = new Random();
        int day = r.nextInt(1,30);
        int month = r.nextInt(1,12);
        int year = r.nextInt(1900,2100);

        if(DateUtil.isValidDate(day, month, year))
            System.out.printf("%02dth %02d %04d tarihi geçerlidir%n", day, month, year);
        else
            System.out.println("Geçersiz tarih");
    }
}
class DateUtil{
    public static boolean isValidDate(int day, int month, int year)
    {
        return 1 <= day && day <= 31 && 1 <= month && month <= 12 && day <= getDays(month, year);
    }
    public static int getDays(int month, int year)
    {
        int days = 31;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                days = 28;
                if(isLeapYear(year))
                    ++days;
        }
        return days;
    }
    public static boolean isLeapYear(int year)
    {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
