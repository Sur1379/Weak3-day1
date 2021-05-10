package com.company.Weak3Day1;

public class booleanMethod {
    public static void main(String[] args) {

        System.out.println(bool(false, false));
    }
    public static boolean bool(boolean b1, boolean b2){
        if (b1 && b2 || b1 == false && b2 && false){
          return false;
        }
            else {
                return true;
        }
    }

}
