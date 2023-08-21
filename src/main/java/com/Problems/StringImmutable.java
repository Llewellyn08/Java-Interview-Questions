package com.Problems;

import java.util.HashMap;
import java.util.Map;

public class StringImmutable {
    public static void main(String[] args) {
        // Creating a map with string keys
        Map<String, Integer> scores = new HashMap<>();

        // Using string literals as keys (immutable)
        scores.put("Alice", 95);
        scores.put("Bob", 87);

        // Attempting to modify a key
        String name = "Alice";
        name = name.toLowerCase();  // Changing case, but still "Alice" in content

        // Accessing the value using the modified key
        Integer aliceScore = scores.get(name);
        System.out.println("Alice's Score: " + aliceScore); // Output: Alice's Score: null

        // Accessing the value using the original key
        Integer originalAliceScore = scores.get("Alice");
        System.out.println("Original Alice's Score: " + originalAliceScore); // Output: Original Alice's Score: 95
    }
}
