package course_2;

public interface Product {

    /*
    * Interfaces do not have constructors
    * they should not have private fields or methods
    * they are abstract
    * the fields must be initialized
    * By conventions variables must be in all caps
    * variable must be static or final
    *
    * Interfaces are used to implement Multiple Inheritance, Abstraction, Polymorphism.
    *
    * Interfaces can also have static default variables methods as well
    * */
    public String name = "";

    /*
    * 1. Interfaces cannot be instantiated
    * 2. Interfaces can be implemented by classes and extended by other interfaces
    * 3. Any class that implements an interface must implement all of its methods or it must declare itself abstract
    * 4. By default, methods in an interface are public and abstract
    * 5. In addition to abstract method, interfaces may alo contain default and static methods.
    * */

    public int get_Sal(int hrs, int pay);

    default public void show(){
        System.out.println("This is a Default Method");
    }

    static public void get(){
        System.out.println("Static methods cannot be overriden \n Static methods can be called using the interface's name \n static method does not be instantiated");
    }

}
