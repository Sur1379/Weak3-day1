package com.company.Weak3Day1;

import java.util.Scanner;

public class MinMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        System.out.println(min(a , b, c, d));
    }
    public static int min (int a, int b, int c, int d){
        int min = a;
        if(min > b){
            min = b;
        }
        if (min > c){
            min = c;
        }
        if (min > d){
            min = d;
        }
        return min;
    }
}
