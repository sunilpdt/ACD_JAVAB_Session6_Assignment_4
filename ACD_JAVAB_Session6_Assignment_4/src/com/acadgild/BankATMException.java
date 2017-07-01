package com.acadgild;

public class BankATMException extends Exception {

	public BankATMException() {
		System.out.println("Balance is less than 10000.Please try again later.");
	}
}
