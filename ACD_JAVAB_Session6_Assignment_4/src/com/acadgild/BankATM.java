package com.acadgild;

public class BankATM {

	private int atmId;
	private String bankName;
	private String location;
	private double balance;
	
	public BankATM(int atmId,String bankName,String location,double balance){
		this.atmId=atmId;
		this.bankName=bankName;
		this.location=location;
		this.balance=balance;
	}
	
	public void withdraw(double amt){
		
		boolean flag=true;
		try {
			flag=checkBalance();
			
			if(!flag){
				throw new BankATMException();
			}
			else{
				balance=balance-amt;
				System.out.println("Amount "+amt+" is withdrawn from the ATM.Balance is:"+balance);
			}
		} catch (BankATMException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deposit(double amt){
		
		balance=balance+amt;
		System.out.println("Amount "+amt+" is deposited in the ATM.Balance is:"+balance);
	}
	
	private boolean checkBalance() throws BankATMException{
		
		if(balance<10000)
			return false;
			else
				return true;
			
		
	}
	
}
