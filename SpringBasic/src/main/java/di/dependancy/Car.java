package di.dependancy;

import di.tire.GoldTire;
import di.tire.SilverTire;
import di.tire.Tire;

public class Car {

	private Tire tire;
	public Car() {
		// 의존성 발생 
		// tire = new SilverTire();
		tire = new GoldTire();
	}
	public String getTire() {
		return tire.getProduct() + " 장착함!!";
	}
}
