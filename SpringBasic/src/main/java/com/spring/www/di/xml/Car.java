package com.spring.www.di.xml;

import com.spring.www.di.tire.Tire;

public class Car {

	private Tire tire;
	
	public Tire getTire() {
		return tire;
	}
	
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	public String getInfo() {
		return tire.getProduct() + "장착함!";
	}
}
