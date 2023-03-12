package collectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterables {

	  public static void main(String args[]) {
		  ArrayList<String> list=new ArrayList<String>();   
	      list.add("Mango");  
	      list.add("Apple");    
	      list.add("Banana");    
	      list.add("Grapes");
	      System.out.println(list);  
	      
	      Iterator<String> it = list.iterator();
//	      System.out.println(it.next());
//	      System.out.println(it.next());
//	      System.out.println(it.next());
	      System.out.println(" => Iterator");
	      while(it.hasNext()) {
	    	  System.out.println(it.next());
	      }
	      System.out.println(" => For Each");
	      for(String itr:list) {
	    	  System.out.println(itr);
	      }
	      System.out.println(" => Stream");
	      list.stream().forEach(element -> System.out.println(element));
	  }
	
	
}
