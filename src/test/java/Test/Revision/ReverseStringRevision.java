package Test.Revision;

import java.util.Scanner;

public class ReverseStringRevision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String: ");

        String input = scanner.nextLine();

        String reversedString = reverseStringAlgo(input);
        System.out.println("Reversed String is: " + reversedString);

        System.out.println("Reversed String algo without using String Builder is " + reverseStringOld(input));
    }

    public static String reverseStringAlgo(String str){
        int length = str.length();
        StringBuilder reversedString = new StringBuilder(" ");

        for(int i =length - 1; i>=0; i--){
            reversedString.append(str.charAt(i));
        }
        return reversedString.toString();
    }

    public static String reverseStringOld(String str){
        int length = str.length();
        String reversed = " ";

        for(int i =  length-1; i>=0; i--){
            reversed += str.charAt(i);
        }
        return reversed;
    }
}
