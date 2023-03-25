package com.yash.SpringAnnotations;

import org.springframework.stereotype.Component;

@Component("SnapdragonProcessor")
public class Snapdragon implements MobileProcessor {

	public void process() {
		// TODO Auto-generated method stub
		System.out.println("Inside Snapdragon Processor");
	}

}
