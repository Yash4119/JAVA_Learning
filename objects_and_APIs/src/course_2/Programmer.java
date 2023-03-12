package course_2;

//For inheritance purpose we use the extends keyword
public class Programmer extends Employee{

    private int progId;
    private String field;

    public Programmer(){
        System.out.println("In the Programmer class");
    }
    public Programmer(int eid, String name, int progId, String field){
        super(eid,name);
        this.progId = progId;
        this.field = field;
    }

    public int salary(int hrs, int PPH){
        return 2*hrs*PPH;
    }

    public void show(){
        System.out.println("The programmer id is "+progId+" and field is "+field);
    }

}
