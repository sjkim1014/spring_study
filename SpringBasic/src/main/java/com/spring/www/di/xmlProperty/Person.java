package com.spring.www.di.xmlProperty;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.www.di.tire.Tire;

public class Person {
	
	public static void main(String[] args) {
		
		// 어플리케이션 컨텍스트 객체 
		ApplicationContext context = null; 
		
		// XML 파일(스프링 빈 설정파일) 에 등록된 Bean 정보를 읽어 어플리케이션 컨텍스트로 등록 
		context = new FileSystemXmlApplicationContext("/src/main/java/com/spring/www/di/xmlProperty/di.xml");
		
		Car car = (Car) context.getBean("sCar");
		Car car2 = (Car) context.getBean("gCar");
		
		
		System.out.println("-------------------------");
		
		// 레퍼런스 확인 
		System.out.println("car : " + car);
		System.out.println("car2 : " + car2);
		
		// 장착된 타이어 확인 
		System.out.println("car info : " + car.getInfo());
		System.out.println("car2 info : " + car2.getInfo());
		
		
		
	}
}
