package com.parameters;

public abstract class Bank {
	
	public void deposit(){
		System.out.println("Deposit from Bank abstract class");
	}
	
	public void sum(){
		int i = 19;
		int j = 10;
		int k = i+j;
		int l = i|j;
		System.out.println(k);
		System.out.println(l);
		
	}
	
	public abstract void credit();

}
