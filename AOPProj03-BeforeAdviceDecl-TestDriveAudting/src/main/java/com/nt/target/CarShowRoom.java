package com.nt.target;

public class CarShowRoom {
	public String sellCar(String custName,String carModel,double price)
	{
		System.out.println("CarShowRoom.sellCar()");
		if(carModel.equalsIgnoreCase("beleano"))
			return "car"+carModel+"is sold with price"+price+"to customer"+custName;
		else
			return  "car"+carModel+"is not available for selling..";
	}
}
