package com.yash.firstApp1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	
//        Vehicle c1 = (Vehicle)context.getBean("bike");
//        c1.drive();
    	
    	Car c1 = (Car)context.getBean("car");
    	Tyre t2 = (Tyre)context.getBean("tyre");
    	t2.setBrand("MRF");
    	c1.setTyre(t2);
    	c1.drive();
        
//        Tyre t1 = (Tyre)context.getBean("tyre");
//        t1.setBrand("MRF");
//        System.out.println(t1);
    }
}
