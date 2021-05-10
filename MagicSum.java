package com.company.Weak3Day1;

import java.util.Scanner;

public class MagicSum {

    public static void main(String[] args) {

        System.out.println("The Magical Sum is - " + sum());
    }

    public static int sum() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive integers or -1 to end");
        int inputNum = scanner.nextInt();
        int magicSum = 0;
        while (inputNum != -1) {
            String s = String.valueOf(inputNum);
            for (int i = 0; i < s.length(); i++) {
                String s1 = s.charAt(i) + "";
                if (Integer.parseInt(s1) == 8) {
                    magicSum = magicSum + inputNum;
                    break;
                }
            }
            System.out.println("Input positive integers or -1 to end");
            inputNum = scanner.nextInt();
        }
        return magicSum;
    }
}
