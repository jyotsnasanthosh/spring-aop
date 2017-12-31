package com.spring.sample.beans;

public class Customer {

	private String custId;

	public String getCustId() {
		return custId;
	}

	public void setCustId(String custId) {
		this.custId = custId;
	}

	public void getCustomerId() {
		System.out.println("Method getCustomerId() called");
	}

	public void throwException() {
		throw new RuntimeException("Runtime exception thrown in Customer");
	}

	public void printCustId(String custId) {
		System.out.println("Cust ID is : " + custId);
	}

}
