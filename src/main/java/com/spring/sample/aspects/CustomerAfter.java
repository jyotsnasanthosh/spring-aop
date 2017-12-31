package com.spring.sample.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class CustomerAfter {

	//Advice to excecute after all executing get methods.
	@After("execution(* com.spring.sample.beans.*.get*())")
	public void printId() {
		System.out.println("Advice after all get methods");
	}

	//Advice to excecute after returning value of custId for the getCustId() method
	@AfterReturning(pointcut = "execution(public String getCustId())", returning = "custId")
	public void getAfterReturningAdvice(String custId) {
		System.out.println("AfterReturning advice after returning custId : " +custId+ " from customer");
	}
	
	//Advice to execute after throwing exception if any from the Customer class
	@AfterThrowing("within(com.spring.sample.beans.Customer)")
	public void logExceptions(JoinPoint joinPoint){
		System.out.println("Exception thrown in Customer Method="+joinPoint.toString());
	}
}
