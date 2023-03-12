package collectionsFramework;

import java.util.HashMap;
import java.util.Map;

public class mapExer {

    public static void main(String [] args){

        Map <String,Integer> mp = new HashMap<String,Integer>();
        mp.put("Yash",24);
        mp.put("Teja",26);

        Map <String,Integer> mp2 = new HashMap<String,Integer>();
        mp2.put("Yash",28);
        mp2.put("Teja",25);

//        Now we will calculate teh final grades

        Map <String,Integer> finalMarks = new HashMap<String,Integer>();

        mp.forEach((stud,marks) -> {
            if(marks >= mp2.get(stud)){
                finalMarks.put(stud,marks);
            }else{
                finalMarks.put(stud,mp2.get(stud));;
            }
            System.out.println(stud + " => " + finalMarks.get(stud));
        });

    }
}
