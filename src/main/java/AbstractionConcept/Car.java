package AbstractionConcept;

public interface Car {

    //Only final and static vars;

    final int wheels=4;


    // Always define only abstract methods
    // No method body
    // Only method declaration
    // We achieve 100% abstraction
    // Cannot create the object of interface
    // No need to write abstract keyword in interface class

    public void start();
    public void stop();
    public void refuel();
}
