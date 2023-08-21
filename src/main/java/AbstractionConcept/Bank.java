package AbstractionConcept;

public abstract class Bank {

    //Partial Abstraction
    //Hiding the implementation login -- Called Abstraction
    //Abstract Class can have abstract and non-abstract methods as well
    //Cannot create object of abstract class

    int amt=100;
    final int rate=10;
    static int loanRate=5;

    public abstract  void loan(); // abstract method = no method body

    // Non Abstract Methods
    public void credit(){
        System.out.println("Bank --Credit");
    }

    public void debit(){
        System.out.println("Bank --Debit");
    }


}
