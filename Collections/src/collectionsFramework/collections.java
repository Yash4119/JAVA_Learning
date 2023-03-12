package collectionsFramework;

import java.util.*;
import java.util.Iterator;

public class collections {
    /*
    * Java Collections frameworks consists of
    * 1. Sets
    * 2. Lists
    * 3. Queue
    * 4. Map
    * 5. also contains algorithms like
    *   a. Binary Search
    *   b. Reverse
    *   c. Copy
    *   d. Shuffle
    *   e. Frequency
    *   f. Sort
    * */

//    A set is a unordered collection of unique elements
//    Because it is an interface it cannot be instantiated.

    public static void main(String []args){
        Set st = new HashSet();
        st.add(12);
        st.add(12);
        st.add(13);

        System.out.println(st);
        System.out.println(st.contains(13));

        st.remove(12);
        System.out.println(st.size());

        Set st1 = Set.of("Yash","Omkar","Teja","Krishna","Avdesh");
//        By setting teh set in this way it becomes immutable
        System.out.println(st1+" -> "+st1.size());


//        List in java

        List<Integer> l = new ArrayList<Integer>();
        l.add(12);
        l.add(32);
        l.add(1);

        System.out.println(l + " => " + l.size());
        System.out.println(l.get(1));
//        Lists in java are ordered
        l.set(2,234);
        System.out.println(l);

        System.out.println(l.indexOf(12));
        System.out.println(l.lastIndexOf(12));
        l.remove(2);

        List l1 = List.of(12,13,13,2,346,45,76457);

//    Queue Data structure  => Ordered
        Queue q = new LinkedList();
        q.add("Yash");
        q.add("Omkar");
        q.add("Swami Ji");

        while(q.isEmpty()==false){
            System.out.println(q.remove());
        }

//        Map is also Unordered
        Map mp = new HashMap<Integer,Integer>();
        mp.put("Yash",23);
        mp.put("Omkar",20);
        mp.putIfAbsent("Yash Shinde",24);
        mp.put("Sakore bandu",34);

        System.out.println(mp);
        System.out.println(mp.get("Yash Shinde"));
        System.out.println(mp.containsKey("Yash"));
        System.out.println(mp.containsValue("24"));
        System.out.println(mp.keySet());
        System.out.println(mp.values());

//        Iterators in JAVA

        var i = mp.keySet().iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

//        Enchanced Loops

        for(int it : l){
            System.out.println(it);
        }

        st.forEach(ele -> System.out.println(ele));

        mp.forEach((x,y) -> System.out.println(x+" , "+y));
    }

}
