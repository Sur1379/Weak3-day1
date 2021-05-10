package com.company.Weak3Day1;

import java.util.Scanner;

public class PalindromeMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        System.out.println(isPalindrome(inputNum));
    }

    public static boolean isPalindrome(int inputNum) {
        String s = String.valueOf(inputNum);
        int j = s.length() - 1;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) == s.charAt(j)) {
                j--;
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}
