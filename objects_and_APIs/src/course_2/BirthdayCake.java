package course_2;

public class BirthdayCake extends Cake {
    int candles;

    public BirthdayCake(){
        super.setter("Chocolate",0);
        candles = 0;
    }

    public void setter(String flavour, int price, int candles){
        super.setter(flavour,price);
        this.candles = candles;
    }

    public void getter(){
        System.out.println("Candles :- "+candles);
    }

}
