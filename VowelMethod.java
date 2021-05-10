package com.company.Weak3Day1;

import java.util.Scanner;

public class VowelMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputChar = scanner.nextLine();
        System.out.println(valueVowel(inputChar));
    }
    public static boolean valueVowel(String inputChar) {
        if (Integer.valueOf(inputChar.charAt(inputChar.length() - 1)) == 65 ||
                Integer.valueOf(inputChar.charAt(inputChar.length() - 1)) == 97
                || Integer.valueOf(inputChar.charAt(inputChar.length() - 1)) == 45 ||
                Integer.valueOf(inputChar.charAt(inputChar.length() - 1)) == 101
                || Integer.valueOf(inputChar.charAt(inputChar.length() - 1)) == 73 ||
                Integer.valueOf(inputChar.charAt(inputChar.length() - 1)) == 105
                || Integer.valueOf(inputChar.charAt(inputChar.length() - 1)) == 79 ||
                Integer.valueOf(inputChar.charAt(inputChar.length() - 1)) == 111
                || Integer.valueOf(inputChar.charAt(inputChar.length() - 1)) == 85
                || Integer.valueOf(inputChar.charAt(inputChar.length() - 1)) == 117) {
            return true;
        } else {
            return false;
        }
    }
}
