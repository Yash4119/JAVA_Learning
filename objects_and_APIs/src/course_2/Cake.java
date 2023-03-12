package course_2;

public class Cake {
    String flavour;
    int price;

    public Cake(){
        flavour = "Plane";
        price = 300;
    }

    public void setter(String flavour, int price){
        this.flavour = flavour;
        this.price = price;
    }
    public void getter(){
        System.out.println("Flavour :- "+flavour+" : Price :- "+price);
    }
}
