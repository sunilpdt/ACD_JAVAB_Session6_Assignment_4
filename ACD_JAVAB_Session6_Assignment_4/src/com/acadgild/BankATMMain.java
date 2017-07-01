package com.acadgild;

public class BankATMMain {

	public static void main(String[] args) {
		
		BankATM bankATM1=new BankATM(1, "HDFC", "Vile_Parle", 20000);
		BankATM bankATM2=bankATM1;
		BankATM bankATM3=bankATM1;
		
		
		
		bankATM1.withdraw(3000);
		bankATM2.withdraw(4000);
		bankATM3.withdraw(10000);
		bankATM2.deposit(200);
		bankATM1.withdraw(3000);
		

	}

}
