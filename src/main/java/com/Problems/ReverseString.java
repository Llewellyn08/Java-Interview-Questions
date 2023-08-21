package com.Problems;

public class ReverseString {

    public static void main(String[] args) {

    // Reverse a String?
    // Difference between String and String Buffer?
    // Do we have a reverse function in String?

        String s = "Selenium";

      /*  // 1. Using charAt() and for loop
        int length = s.length();
        String reverse = "";
        for(int i = length - 1; i>=0; i--){
           reverse = reverse + s.charAt(i);
           // The loop will start from muineleS. The reason for appending is because reverse is blank
            // Do not print inside the for loop as it will print every iteration of the loop
        }
        System.out.println(reverse);*/

        // 2. Using StringBuffer class
        StringBuffer sf = new StringBuffer(s); // String Buffer is mutable and can be changed unlike String
        System.out.println(sf.reverse());


/*        s.reverse cannot be used as the String 's' is immutable and cannot be changed
        System.out.println(s.reverse);*/
    }
}
