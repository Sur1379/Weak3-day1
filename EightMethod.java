package com.company.Weak3Day1;

import java.util.Scanner;

public class EightMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        System.out.println(hasEight(inputNum));
    }

    public static boolean hasEight(int inputNum) {
        String s = String.valueOf(inputNum);
        for (int i = 0; i < s.length(); i++) {
            String s1 = s.charAt(i) + "";
            if (Integer.parseInt(s1) != 8) {
                continue;
            }
            if (Integer.parseInt(s1) == 8) {
                return true;
            }
        }
        return false;
    }
}
