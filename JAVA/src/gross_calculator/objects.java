package gross_calculator;


class Rectangle{
    private double l;
    private double w;

    public Rectangle(int l,int w){
        this.l = l;
        this.w = w;
    }

    public double areas(){
        return l*w;
    }
}

public class objects {


    public static void main(String [] args){
        Rectangle obj = new Rectangle(5,6);
        double ar = obj.areas();
        System.out.println(ar);

        int [] arr = new int[10];
        arr[2] = 12;
    }

//  A wrapper class provides the mechanism to convert a primitive data type to object and an object to a primitive data type

//    A Record a special data class with only fields
    
//    Arrays
//    Homogenous container of elements

    /*
    * Strings in JAVA are Objects which is an array of characters
    *
    * string_name.charAt(index);
    * string_name.split(parameter_to_split);
    * string_name.toCharArray();
    * string_name.format("Your roll no is %d", rollNo)
    * string_name.equals()other_string);
    * string_name.equalsIgnoreCase(other_string);
    *
    * multiline texts can be enclosed in a string using triple quotes """ """
    * */

}
