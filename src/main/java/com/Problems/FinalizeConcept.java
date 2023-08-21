package com.Problems;

public class FinalizeConcept {

    public  void finalize(){
        System.out.println("finalize method");
    }
    public static void main(String[] args) {

        //finalize is a method
        //If there is no object reference garbage collector will remove all those objects from memory
        //Clean up processing before garbage collector processing

        FinalizeConcept f1 = new FinalizeConcept();
        FinalizeConcept f2 = new FinalizeConcept();

        f1=null;
        f2=null;

        System.gc();

    }
}
