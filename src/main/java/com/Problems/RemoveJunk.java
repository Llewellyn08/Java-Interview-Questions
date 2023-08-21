package com.Problems;

public class RemoveJunk {
    public static void main(String[] args) {

        // How will you remove the junk characters from a string?

        String special = "This#string%contains^special*characters&.";

        //Regular Expression: [^a-zA-Z0-9] --> Regular expression are written in [] ^ is not, it means remove all characters that are not specified in []

        special = special.replaceAll("[^a-zA-Z0-9]"," " );

        System.out.println(special);
    }
}
