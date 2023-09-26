package com.Problems;

public class NullArgument {

    public static void main(String[] a) {
        test(null);
    }

    public static void test(Object o){
        System.out.println("Object Argument");
    }

    public static void test(String s){
        System.out.println("String Argument");
    }

   /* // Will give error. The same is with String Builder
    public static void test(StringBuffer s){
        System.out.println("String Buffer Argument");
    }*/
}
