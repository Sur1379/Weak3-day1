package com.company.Weak3Day1;

import java.util.Scanner;

public class ContainsArray {
    public static void main(String[] args) {

        int[] array = {1, 5, 9, 8, 6, 4, 3, 2,};
        Scanner scanner = new Scanner(System.in);
        int key = scanner.nextInt();
        System.out.println(contains(array, key));
    }

    public static boolean contains(int[] array, int key) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == key){
                return true;
            }
        }
        return false;
    }
}