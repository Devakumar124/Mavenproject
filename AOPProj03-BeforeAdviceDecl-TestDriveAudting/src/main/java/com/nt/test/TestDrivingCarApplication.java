package com.nt.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.target.CarShowRoom;

public class TestDrivingCarApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
		CarShowRoom csr=ctx.getBean("carShowRoom",CarShowRoom.class);
		try {
		System.out.println(csr.sellCar("Sree","beleano",2000000));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
