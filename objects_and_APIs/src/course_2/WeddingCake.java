package course_2;

public class WeddingCake extends Cake {
    int tiers;

    public WeddingCake(){
        super.setter("Almond",0);
        tiers = 0;
    }

    public void setter(String flavour, int price, int tiers){
        super.setter(flavour,price);
        this.tiers = tiers;
    }

    public void getter(){
        System.out.println("Tiers :- "+tiers);
    }
}
