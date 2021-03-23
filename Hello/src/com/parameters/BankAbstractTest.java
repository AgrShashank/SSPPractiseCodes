package com.parameters;

public class BankAbstractTest extends Bank implements Banking {

	public static void main(String[] args) {

	Bank b = new BankAbstractTest();
	b.sum();
	
	}
	

	@Override
	public void credit() {
		// TODO Auto-generated method stub

	}

	@Override
	public void personalLoan() {
		// TODO Auto-generated method stub

	}

	@Override
	public void homeLoan() {
		// TODO Auto-generated method stub

	}
	

}
