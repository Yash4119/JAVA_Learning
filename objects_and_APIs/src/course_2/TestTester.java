package course_2;

public class TestTester {

    public static void main(String []args){
        Cake ck = new Cake();
        ck.setter("Butterscotch",500);
        ck.getter();

        BirthdayCake bck = new BirthdayCake();
        System.out.println("Default Flavour :- "+bck.flavour);
        bck.setter("Chocochips", 350, 18);
        bck.getter();

        WeddingCake wck = new WeddingCake();
        System.out.println("Default Flavour :- "+wck.flavour);
        wck.setter("Mango", 300, 3);
        wck.getter();
        Boolean flag = ck instanceof BirthdayCake;
        System.out.println(flag);
    }

//    Typecasting of Objects
//    Instance of function

}
