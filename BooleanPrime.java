package com.company.Weak3Day1;

import java.util.Scanner;

public class BooleanPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number");
        System.out.println(isPrime(scanner.nextInt()));
    }
    public static boolean isPrime(int n){
        int count = 0;
        for (int i = 2; i < n/2 ; i++) {
            if( n % i == 0){
                count++;
            }
        }
        if (count == 0){
            return true;
        }
        else {
            return false;
        }
    }
}
