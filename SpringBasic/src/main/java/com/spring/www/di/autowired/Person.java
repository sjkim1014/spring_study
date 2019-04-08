package com.spring.www.di.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.www.di.tire.Tire;

public class Person {
	
	public static void main(String[] args) {
		
		// 어플리케이션 컨텍스트 객체 
		ApplicationContext context = null; 
		
		// XML 파일(스프링 빈 설정파일) 에 등록된 Bean 정보를 읽어 어플리케이션 컨텍스트로 등록 
		context = new FileSystemXmlApplicationContext("/src/main/java/com/spring/www/di/autowired/di.xml");
		
		// di.xml 에 등록된 Bean 가져옴
		
		Car car = (Car) context.getBean("car");
		
		System.out.println("car : " + car);
		System.out.println("car info : " + car.getInfo());
		
	}
}
