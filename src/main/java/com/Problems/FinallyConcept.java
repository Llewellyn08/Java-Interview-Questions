package com.Problems;

public class FinallyConcept {
    public static void main(String[] args) {
        //test1();
        //test2();
        division();
    }

    //finally block is always used with try catch block
    //No matter what exception is thrown, the code in the finally block will be run

    public static void test1(){
        try{
            System.out.println("Inside test1 method");
            throw new RuntimeException("test");
        }catch (Exception e){
            System.out.println("Inside catch block");
        }

        finally {
            System.out.println("inside finally block");
        }
    }

    //finally keyword can be used with just try block
    //It wouldn't need an exception

    public static void test2(){
        try {
            System.out.println("Inside test2");
        }
        finally {
            System.out.println("finally code in test2 method");
        }
    }

    //Real Time Example
    //Finally will be called always even if the exception provided is incorrect
    //It can be used in database connectivity. The connection has to be closed once operation is complete
    //If there is error in data retrieval then the finally keyword can be used with close connection method to ensure connection is closed

    public static void division(){
        int i=10;
        try {
            System.out.println("Inside try block");
            int k=i/0;
        }
        catch (ArithmeticException e){
            System.out.println("Inside catch block");
            System.out.println("divide by zero error");
        }
        finally {
            System.out.println("Execute this code even after any exception");
        }
    }


}


