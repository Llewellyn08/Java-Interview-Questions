package OverrideStaticMethodConcept;

public class BMW extends Car{

    public static void start(){
        System.out.println("BMW Start");
    }

    public void stop(){
        System.out.println("BMW Stop");
    }

    // This is not possible
    /*@Override
    public static void start(){
        System.out.println("BMW Start");
    }*/

    // This isn't possible also as the method in parent is static and this method is not.
  /*  public void start(){
        System.out.println("BMW Start");
    }
*/
}
