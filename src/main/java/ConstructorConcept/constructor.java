package ConstructorConcept;

public class constructor {

    // Default - Compiler created constructor
/*    int i;
    public static void main(String[] args) {
        constructor c = new constructor();
        System.out.println(c.i);
    }*/

    // No arg constructor
   /* int i;
    String s;
    constructor(){
        System.out.println("no args contstructor");
    }
    public static void main(String[] args) {
        constructor c = new constructor();
    }*/

    // Parametrized constructor
    constructor(int a){
        System.out.println("parametrized constructor");
    }
    public static void main(String[] args) {
        constructor c = new constructor(10);
    }
}
