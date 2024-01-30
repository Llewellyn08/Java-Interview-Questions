package Inheritance;

public class MultiLevelInheritance {
}

class A2{
    void showA2(){
        System.out.println("a class method");
    }
}

class B2 extends A2{
    void showB2(){
        System.out.println("b class method");
    }
}

class C2 extends B2{
    void showC2(){
        System.out.println("b class method");
    }

    public static void main(String[] args) {
        A2 ob1 = new A2();
        ob1.showA2();

        B2 ob2 = new B2();
        ob2.showB2();
        ob2.showA2();

        C2 ob3 = new C2();
        ob3.showA2();
        ob3.showC2();
        ob3.showB2();
    }
}