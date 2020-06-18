package com.dxc.bankingapppoc;

import java.io.BufferedReader;
import java.io.IOException;

public class AXIS implements RBI{

	int acc_no;
	String name;
	float amount;
	@Override
	public void openAccount(BufferedReader buff)  {
	try {
		name=buff.readLine();	
		System.out.println();
	}
	catch (Exception e) {
		System.out.println(e);
	}
	
	}

	@Override
	public void deposit(BufferedReader buff) {
		System.out.println("Enter the deposit amount");
		
		
	}

	@Override
	public void withdrawl(BufferedReader buff) {
		amount=buff.readLine();
		if(amount)
	}

	@Override
	public void openFD(BufferedReader buff) {
		// TODO Auto-generated method stub
		
	}

}
