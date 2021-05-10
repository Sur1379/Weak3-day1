package com.company.Weak3Day1;

import java.util.Scanner;

public class PowerOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A number");
        double a = scanner.nextInt();
        System.out.println("Enter power N");
        int n = scanner.nextInt();
        System.out.println(power(a , n));
    }
    public static double power( double a, int n ){
        double b = a;
        for (int i = 1; i < n; i++) {
            a = a * b ;
        }
        if ( n == 0){
            a = 1;
        }
        return a;
    }
}
