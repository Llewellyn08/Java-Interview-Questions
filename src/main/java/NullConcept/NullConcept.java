package NullConcept;

public class NullConcept {
    static Object obj;

    public static void main(String[] args) {
        // 1. Case Sensitive: Has to be in lowercase: 'null'
        //Object obj = null;

        //2. Default refernce value will be null
        //System.out.println(obj);

        //3. Cannot reference a null value of a class to a primitive data type
        //Integer i = null;
        //int j = i;

        //4. instanceOf
        /*Integer i = null;
        Integer j = 10;

        System.out.println(j instanceof Integer); // Output: True
        System.out.println(i instanceof Integer); // Output: False - As it is null*/

        //5. static vs non static
       /* NullConcept obj = null;
        obj.send(); // non static method cannot be referenced by null references
        obj.sum(); // static method can be accessed by null references*/

        //6. == and !=
      /*  System.out.println(null == null); // True
        System.out.println(null != null); // False*/
    }

    public static void sum(){
        System.out.println("sum...");
    }

    public void send(){
        System.out.println("send...");
    }






}
