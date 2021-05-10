package com.company.Weak3Day1;

public class booleanCount {
    public static void main(String[] args) {
        System.out.println(bool(true, true, false));
    }

    public static boolean bool(boolean b1, boolean b2, boolean b3) {
        if (b1 && b2 || b2 && b3 || b1 && b3) {
            return true;
        } else {
            return false;
        }
    }
}
