package com.Problems;

public class SwapTwoIntegers {
    public static void main(String[] args) {

        int x = 5;
        int y = 10;

      /*  //1. With Using Third Variable. In this case t
        int t;
        t=x; //t=5
        x=y; //x=10
        y=t; //y=5
        System.out.println("Using Third Varaible");
        System.out.println("The value of x is "+x);
        System.out.println("The value of y is "+y);*/

        /*//2. Without using third variable. Using + operator
        x=x+y;//x=15
        y=x-y;//y=5
        x=x-y;//x=10
        System.out.println("Not Using Third Varaible: + Operator");
        System.out.println("The value of x is "+x);
        System.out.println("The value of y is "+y);*/

        //3. Without using third variable. Using * operator
       /* x=x*y; //50
        y=x/y; //5
        x=x/y; //10
        System.out.println("Not Using Third Varaible: * Operator");
        System.out.println("The value of x is "+x);
        System.out.println("The value of y is "+y);*/

        //4. Without using third variable. Using XOR: ^ operator(Bitwise Operator)
        x=x^y; //15 --> 1111
        y=x^y; //10 --> 1010
        x=x^y; //5 --> 0101

        System.out.println("Not Using Third Varaible: ^ Operator");
        System.out.println("The value of x is "+x);
        System.out.println("The value of y is "+y);

    }
}
