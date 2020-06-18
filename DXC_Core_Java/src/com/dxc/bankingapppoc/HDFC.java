package com.dxc.bankingapppoc;

import java.io.BufferedReader;
import java.io.IOException;

public class HDFC implements RBI{

	float bal;
	@Override
	public void openAccount(BufferedReader buff) throws Exception  {
		String name=buff.readLine();
		System.out.println(name+" account is created");
		
	}

	@Override
	public void deposit(BufferedReader buff) {
		b
	}

	@Override
	public void withdrawl(BufferedReader buff) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void openFD(BufferedReader buff) {
		// TODO Auto-generated method stub
		
	}

	

}
