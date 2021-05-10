package com.company.Weak3Day1;

import java.util.Scanner;

public class FactorialMethod {
    static int factorial = 1;

    public static void main(String[] args) {
        System.out.println("Input number for factorial");
        Scanner scanner = new Scanner(System.in);
        System.out.println(countFactorial(scanner.nextInt()));
    }

    public static int countFactorial(int a) {
        if (a == 0) {
            return 0;
        }
        for (int i = 0; i < a; i++) {
            factorial = factorial * (i + 1);
        }
        return factorial;
    }
}
