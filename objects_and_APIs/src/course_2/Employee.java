package course_2;

public class Employee extends absClass {

    private int eid;
    private String name;

    public Employee(){
        System.out.println("In the Employee class");
    }

    public Employee(int eid, String name){
        this.eid = eid;
        this.name = name;
    }

    public int salary(int hrs, int PPH){
        return hrs*PPH;
    }

    @Override
    public int square(int n){
        return n*n;
    }

    public void give(){
        System.out.println("Employee Id is "+eid+" and name is "+name);
    }
}
