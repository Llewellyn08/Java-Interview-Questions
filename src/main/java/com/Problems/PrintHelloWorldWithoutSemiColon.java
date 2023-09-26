package com.Problems;

public class PrintHelloWorldWithoutSemiColon {

    public static void main(String[] args) {
        if(System.out.printf("Hello World" + "\n") == null){

        }

        //2 Use append Method
        if(System.out.append("Hello World" + "\n") == null){

        }

        //3
        if(System.out.append("Hello World" + "\n").equals(null)){

        }

        //4 For Loop
        for(int i=0; i<1; System.out.println("Hello World")){
            i++;
        }
    }
}