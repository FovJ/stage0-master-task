package com.epam.loops;

import java.util.Scanner;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        for (int i = 1; i <= 10; i++) {
            int result = numberTableToPrint * i;
            System.out.printf("%d x %d = %d%n", i, numberTableToPrint, result);
        }
    }

}
