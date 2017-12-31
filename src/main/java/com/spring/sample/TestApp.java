package com.spring.sample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.sample.beans.Customer;

public class TestApp {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Customer customer = (Customer) context.getBean("customer");

		customer.setCustId("KKDC124");
		
		//For before, after and after returning advices
		customer.getCustId();
		
		//For Around advice
		customer.printCustId("POSJ245");
		
		//For AfterThrowing advice
		try {
			customer.throwException();
		}catch (Throwable e) {
			System.out.println("Exception caught in Customer : "+e);
		}
	}
}
