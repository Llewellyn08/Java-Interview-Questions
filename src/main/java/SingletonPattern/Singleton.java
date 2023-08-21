package SingletonPattern;

public class Singleton {

    // In OOP, a singleton class is a class that can have only one object(instance) of the class at a time

    // How to design a singleton class
    //1. Make constructor as private
    //2. Write a public static method: getInstance that has return type of object of this singleton class(Lazy Initialization)

    // Difference Between Normal and Singleton Class
    // For normal class we use constructor whhereas for singleton clas we use getInstance() method for instantiation

    // Private static variable to hold the single instance of the class
    private static Singleton singleton_instance = null;
    public String str;

    // Private constructor to prevent external instantiation
    private Singleton(){
        str="Hey, I am using singleton class pattern";
    }

    // Public static method to get the single instance of the class
    public static Singleton getInstance(){
        if(singleton_instance == null)
            singleton_instance = new Singleton();
        return singleton_instance;
    }

    public static void main(String[] args) {

       Singleton x = Singleton.getInstance();
       Singleton y = Singleton.getInstance();
       Singleton z = Singleton.getInstance();

        x.str=(x.str).toUpperCase();

        System.out.println(x.str);
        System.out.println(y.str);
        System.out.println(z.str);

        z.str=(z.str).toLowerCase();

        System.out.println(x.str);
        System.out.println(y.str);
        System.out.println(z.str);
    }
}
