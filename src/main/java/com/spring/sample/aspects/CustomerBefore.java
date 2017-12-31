package com.spring.sample.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class CustomerBefore {

	@Before("execution(public String getCustId())")
	// this aspect executes before all String getCustId() methods.
	public void getCustIdAdvice(JoinPoint joinpoint) {
		System.out.println("Advice before only getCustId() on joinpoint : "+ joinpoint.getSignature().getName());
	}

	@Before("execution(* com.spring.sample.beans.*.get*())")
	// this aspect executes before all get*() methods.
	public void getAllAdvice(JoinPoint joinpoint) {
		System.out.println("Advice before all get methods on joinpoint : "+ joinpoint.getSignature().getName());
	}
}
