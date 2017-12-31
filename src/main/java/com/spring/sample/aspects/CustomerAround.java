package com.spring.sample.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class CustomerAround {

	//Advice to execute around the the printCustId() method.
	@Around("execution(* com.spring.sample.beans.Customer.printCustId(*))")
	public Object aroundAspect(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

		System.out.println("AROUND Before calling printCustId()");
		Object value = proceedingJoinPoint.proceed();
		System.out.println("AROUND After calling printCustId()");

		return value;

	}
}
