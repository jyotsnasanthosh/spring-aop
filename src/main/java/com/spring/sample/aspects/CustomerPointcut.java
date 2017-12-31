package com.spring.sample.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CustomerPointcut {

	//Pointcut to match the joinpoint firstAdvice() and secondAdvice()
	@Pointcut("execution(public String getCustId())")
	public void getCustIdPointcut() {
	}

	//Pointcut to match the joinpoint allMethodAdvice()
	@Pointcut("within(com.spring.sample.services.*)")
	public void allMethodsPointcut() {
	}

	@Before("getCustIdPointcut()")
	public void firstAdvice() {
		System.out.println("Executed first advice in CustomerPointcut for getCustId() methods");
	}

	@Before("getCustIdPointcut()")
	public void secondAdvice() {
		System.out.println("Executed second advice in CustomerPointcut for getCustId() methods");
	}

	@Before("allMethodsPointcut()")
	public void allMethodAdvice() {
		System.out.println("Executed all methods advice in CustomerPointcut");
	}
}
