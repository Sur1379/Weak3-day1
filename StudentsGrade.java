package com.company.Weak3Day1;

import java.util.Scanner;

public class StudentsGrade {
    public static void main(String[] args) {
        averageGrade();
    }
    public static void averageGrade() {
        int count = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Print students count");
        int numOf = scanner.nextInt();
        int[] array = new int[numOf];
        for (int i = 0; count < numOf; i++) {
            array[i] = scanner.nextInt();
            sum = sum + array[i];
            count++;
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        float average = sum / numOf;
        System.out.println(average);
        System.out.println(min);
        System.out.println(max);

    }
}