package com.Problems;

public class SwapTwoStrings {
    public static void main(String[] args) {

        String a="Hello";
        String b="World";

        System.out.println("Before Swapping");
        System.out.println("The value of a is "+a);
        System.out.println("The value of b is "+b);

        //Step 1. Append a and b
        a=a+b; //HelloWorld

        //Step 2. Store Initial string a in b;
        b=a.substring(0, a.length()-b.length());

        //Step 3. Store initial string b in a
        a=a.substring(b.length());

        System.out.println("After Swapping");
        System.out.println("The value of a is " +a);
        System.out.println("The value of b is "+b);
    }
}
