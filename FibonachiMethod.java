package com.company.Weak3Day1;

import java.util.Scanner;

public class FibonachiMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(countFibo(scanner.nextInt()));
    }

    public static int countFibo(int inputNum) {
        if (inputNum == 1) {
            return 0;
        } else {
            int k;
            int n = 2;
            int after = 0;
            int before = 1;
            while (inputNum > n) {
                k = after + before;
                after = before;
                before = k;
                n++;
            }
            return before;
        }
    }
}
