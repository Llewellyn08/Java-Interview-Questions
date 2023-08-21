package com.Problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateElements {
    public static void main(String[] args) {
        String names[] = {"Java", "JavaScipt", "Ruby", "C", "Python", "Java", "C"};

        //1. Compare each element:Time Complexity: O(nxn) -- worst solution
       /* for(int i=0; i< names.length; i++){
            for(int j=i+1; j< names.length; j++) {
                if (names[i].equals(names[j])) {
                    System.out.println("Duplicate element is: " + names[i]);
                }
            }
        }*/

// ---------------------------------------------------------------------------------------

       /* //2. Using hashset: Java Collection: It stores unique values
        // Time Complexity: O(n)
        Set<String> store = new HashSet<String>();
        for (String name : names){
            if (store.add(name) == false){
                System.out.println("Duplicate element is:: " + name);
            }
        }*/

// ---------------------------------------------------------------------------------------

        //3. Using HashMap
        // Time Complexity: O(2n)
        Map<String, Integer> storeMap = new HashMap<String, Integer>();

        for(String name : names){
            Integer count = storeMap.get(name);
            if(count == null){
                storeMap.put(name, 1);
            }
            else{
                storeMap.put(name, ++count);
            }
        }

        //get the values from this Hashmap

        Set<Map.Entry<String, Integer>> entrySet = storeMap.entrySet();
        for(Map.Entry<String, Integer> entry : entrySet){
            if(entry.getValue() > 1){
                System.out.println("Duplicate element is: " + entry.getKey());
                System.out.println("The occurence of element "+entry.getKey()+" is "+ entry.getValue());
            }
        }


    }
}
