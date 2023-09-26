package com.Problems;

public class CompareTwoIntegers {

    // Compare two integers: Integer Caching

    public static void main(String[] args) {
        // With the object type as integer. The numbers will be equal only when the range is from -127 to 127
        // Anything outside the range when compared with == will be not equal
        Integer num1=-128;
        Integer num2=-128;

        if(num1==num2){
            System.out.println("both are equal");
        }else{
            System.out.println("both are not equal");
        }
    }
}
