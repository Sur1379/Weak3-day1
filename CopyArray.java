package com.company.Weak3Day1;

public class CopyArray {


    public static void main(String[] args) {
        int[] array = {1, 5, 9, 8, 6, 4, 3, 2,};
        for (int i = 0; i < array.length; i++) {
            System.out.print(copyOf(array)[i] + " ");
        }
    }

    public static int[] copyOf(int[] n) {
        int[] Array = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            Array[i] = n[i];
        }
        return Array;
    }

}

