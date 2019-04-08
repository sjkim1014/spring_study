package com.spring.www.di.autowired;

import javax.annotation.Resource;
import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.spring.www.di.tire.Tire;

public class Car {

	@Qualifier("gTire") // bean이 2개이기 때문에 NoUniqueBeanDefinitionException 에러가 난다 :: 빈을 지정해준다
	@Autowired  // @Autowired 하면 new 안해도된다	
//	@Resource
//	@Inject
	
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
