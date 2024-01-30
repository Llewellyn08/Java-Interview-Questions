package Inheritance;

public class HierarchicalInheritance {
}
class A3{
    void showA3(){
        System.out.println("a class method");
    }
}

class B3 extends A3{
    void showB3(){
        System.out.println("b class method");
    }
}

class C3 extends A3{
    void showC3(){
        System.out.println("b class method");
    }

    public static void main(String[] args) {
        A3 ob1 = new A3();
        ob1.showA3();

        B3 ob2 = new B3();
        ob2.showB3();
        ob2.showA3();

        C3 ob3 = new C3();
        ob3.showA3();
        ob3.showC3();
    }
}