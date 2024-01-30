package ConstructorConcept;

public class realWorldExample {


    // With Constructor

    static class Employee{
        String name;
        int emp_id;

        Employee(String name, int emp_id){
            this.name = name;
            this.emp_id = emp_id;
        }

        public static void main(String[] args) {
            Employee e1 = new Employee("llewellyn", 12);
            Employee e2 = new Employee("shawn", 44);
            System.out.println("Employee1: "+e1.name+" "+e1.emp_id);
            System.out.println("Employee2: "+e2.name+" "+e2.emp_id);
        }
    }

    // Without Constructor
 /*   static class Employee{
        String name;
        int emp_id;

        public static void main(String[] args) {
            Employee e1 = new Employee();
            Employee e2 = new Employee();
            System.out.println("Employee1: "+e1.name+" "+e1.emp_id);
            System.out.println("Employee2: "+e2.name+" "+e2.emp_id);
        }
    }*/

}
