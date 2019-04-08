package di.setter;

import di.tire.Tire;

public class Car {

	private Tire tire;
	
	public void setTire(Tire tire) {
		// setter를 통한 의존성 주입 (제어의 역전)
		this.tire = tire;
	}
	
	public String getTire() {
		return tire.getProduct() + " 장착함!!";
	}
}
