package com.company.Weak3Day1;

import java.util.Scanner;

public class ArrayIndexReturn {
    public static void main(String[] args) {
        int[] array = {1, 5, 9, 8, 6, 4, 3, 2,};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input searching number");;
        int key = scanner.nextInt();
        System.out.println(search(array, key) + " is index of number " +key );
    }

    public static int search(int[] array, int key) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == key){
                return i;
            }
        }
        return -1;
    }
}
