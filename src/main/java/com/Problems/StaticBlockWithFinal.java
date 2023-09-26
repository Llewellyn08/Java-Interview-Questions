package com.Problems;

public class StaticBlockWithFinal {

    public static void main(String[] args) {
        System.out.println(Main.x);
    }
}
    class Main{
        public static final int x = 100;
    static {
        System.out.println("main -- class static block");
    }
}

// If there is a final keyword in a method. When calling the class in the main method it calls only the final class
// In this code Main.x is directly replaced by 100

