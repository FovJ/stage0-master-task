package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {

        if (year < 0 || month < 1 || month > 12) {
            System.out.println("invalid date");
            return;
        }

        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month == 2 && isLeapYear(year)) {
            System.out.println("29");
        } else {
            System.out.println(daysInMonth[month]);
        }
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

}
