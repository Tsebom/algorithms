package org.tsebom.tousend_problems.calcformuls;

import java.util.Scanner;

public class MainCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());

        // 2.1. Составить программу:
        // а) вычисления значения функции y = 17 x2 – 6x + 13 при любом значении x;
        // б) вычисления значения функции y = 3 a2 + 5 a – 21 при любом значении а.

//        System.out.println(17 * x * x - 6 * x + 13);
//        System.out.println(3 * x * x + 5 * x - 21);

        // 2.2. Составить программу вычисления значения функции (a2 + 10) / sqrt(a2 + 1)  при любом значении а.
        double result = (x * x + 10) / Math.sqrt(x * x + 1);
        System.out.printf("%.2f", result);
    }
}
