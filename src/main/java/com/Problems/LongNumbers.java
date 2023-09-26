package com.Problems;

public class LongNumbers {

    // What will be the output when you use a long number with L and without L suffix?
    public static void main(String[] args) {
        long longnumberwithoutL = 1000*60*60*24*365; //1471228928

        long longnumberwithL = 1000*60*60*24*365L; //31536000000

        System.out.println(longnumberwithoutL);
        System.out.println(longnumberwithL);
    }
}

// Important points
// Max limit for int is 32 bits
// If calculation crosses 32 bits the last 4 bits will be ignored
// That is why the output is different with L and without L
// This can be verified on a calculator as well. The calculator will give the correct output that is with L