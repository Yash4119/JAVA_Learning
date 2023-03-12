package course_2;

//Keyword Implements is used to implement the Interfaces
public class Person implements Product{

    private String name = "Yash";

    @Override
    public int get_Sal(int hrs, int pay){
        System.out.println(name);
        return hrs* pay;
    }

}
