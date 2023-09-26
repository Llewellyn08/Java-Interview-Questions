package Test.Revision;

import java.util.Scanner;

public class RemoveJunkRevision {

    public static void main(String[] args) {

        // How will you remove the junk characters from a string?

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String cleanedString = input.replaceAll("[^a-zA-Z0-9]+", " ");

        System.out.println("Original input: " + input);
        System.out.println("Cleaned string: " + cleanedString);

        scanner.close();

    }
}
