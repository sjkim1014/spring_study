package di.constructor;

import di.tire.GoldTire;
import di.tire.SilverTire;
import di.tire.Tire;

public class Car {

	private Tire tire;
	
	public Car(Tire tire) {
		// 생성자를 통한 의존성 주입! 
		this.tire = tire;
	}
	
	public String getTire() {
		return tire.getProduct() + " 장착함!!";
	}
}
