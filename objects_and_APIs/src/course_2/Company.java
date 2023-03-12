package course_2;

//Java does not have mutiple inheritance
public class Company{

//    Method Overriding is a process in which a child class overrides the method of its parent class to add
//    some extra functionality. Overriden method has the same signature but different body.
//    It is recommended to give the @override keyword
    public static void main(String []args){
        Programmer obj1 = new Programmer(13, "Teja",12,"SDE");
        Employee obj = new Employee(1,"Yash");

        Employee newOb = new Programmer(15,"Omkar",13,"Web");
        newOb.give();
        ((Programmer)newOb).show();

        obj.give();
        obj1.show();
        System.out.println("Square of 14 is :- "+obj.square(14));
        System.out.println(obj.salary(12,2));
        System.out.println(obj1.salary(12,2));

        Person p = new Person();
        System.out.println(p.get_Sal(12,12));

    }

    /*
    *   Access Specifiers are
    * 1. Public     => Global scope
    * 2. Private    => Class level Scope
    * 3. Protected  => Package level Scope
    *
    * Default access specifier is Protected
    *
    * Sealed classes make the inheritance of methods and fields more strict and allows to only specific classes
    * A sealed class grants permission to a specific set of classes.
    *
    * Every permitted subclass by a sealed class needs to declare itself as sealed, non-sealed or final
    *
    * A Final class to not have any descendants.
    *
    * Private methods and fields are not inherited
    * Final methods are inherited but cannot be overriden
    * */

}
