package com.Problems;

import java.util.Scanner;

public class RemoveJunk {
    public static void main(String[] args) {

        // How will you remove the junk characters from a string?

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            // Regular Expression: [^a-zA-Z0-9]+ - Remove all characters that are not alphanumeric
            // Regular expression are written in [] ^ is not,
            // it means remove all characters that are not specified in []
            // + quantifier, which matches one or more occurrences of non-alphanumeric characters.
            // This ensures that consecutive sequences of special characters are replaced with just one space.
            String cleanedString = input.replaceAll("[^a-zA-Z0-9]+", " ");

            System.out.println("Original input: " + input);
            System.out.println("Cleaned string: " + cleanedString);

            scanner.close();
    }
}
