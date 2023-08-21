package com.Problems;

public class StringManipulation {
    public static void main(String[] args) {
        String str = "The rains have started here";
        String str1 = "The rains have Started here";

        //Length of String
        System.out.println(str.length());

        //Character at specific index
        System.out.println(str.charAt(5));

        //Index at specific character
        // First occurrence of e
        int indexOfe = str.indexOf('e');
        System.out.println(indexOfe);

        //Index of second occurrence of character in string.
        // Start after the first occurrence of character
        // Second occurrence of e
        int indexOf2e = str.indexOf('e', str.indexOf('e')+1);
        System.out.println(str.indexOf('e', indexOf2e));

        //Third occurrence of e
        int indexOf3e = indexOf2e+1;
        System.out.println(str.indexOf('e', (str.indexOf('e', indexOf3e))));

        //Index of string in a larger string
        int indexOfString = str.indexOf("have");
        System.out.println(indexOfString);

        //Index of string/character that is not available on string
        //Can be used in assertion for selenium
        int indexOfInvalidString = str.indexOf("hello");
        System.out.println(indexOfInvalidString);

        //String Comparison: String should be exactly the same, as java is case sensitive
        System.out.println(str.equals(str1));

        //String comparison: Ignore cases
        System.out.println(str.equalsIgnoreCase(str1));

        //Find substring: Make sure to take index of last element+1 as it cuts out if stopped at last element
        String findSubstring = str.substring(0, 9);
        System.out.println(findSubstring);

        //How to Trim spaced?
        //Trim method can only remove before and after space
        String space = "    Hello World     ";
        String trimSpace = space.trim();
        System.out.println(trimSpace);

        //How to remove space between string?
        //Replace method removes all space in the string
        String replaceSpace = space.replace(" ","");
        System.out.println(replaceSpace);

        //Replace HW
        String date="26-07-2023";
        String replaceDate=date.replace("-","/");
        System.out.println(replaceDate);

        //How to split?
        //Splits the string in different strings
        //The string is taken and the different words are split and stored in an array.
        //For that reason spliTest[] is used
        //For loop will have to be used to print values
        String test = "Hello_World_Test_Selenium";
        String splitTest[] = test.split("_");
        for(int i=0; i<splitTest.length; i++){
            System.out.println(splitTest[i]);
        }

        //How to concatenate?
        String s2 = "cares";
        String concatS2 = s2.concat("s");
        System.out.println(concatS2);

        //Adding String and Integers
        //Strings can be concatenated with any data type
        String x = "Hello";
        String y = "World";
        int a = 100;
        int b = 200;

        System.out.println(x+y);
        System.out.println(a+b);
        System.out.println(x+y+a+b);
        System.out.println(a+b+x+y);
        System.out.println(x+y+(a+b));


    }
}
