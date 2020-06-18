package com.dxc.bankingapppoc;

import java.io.BufferedReader;

public interface RBI {
	
	public static int ROI = 3;
	public static int MIN_FD_AMOUNT = 500;

	public static int MIN_BAL = 1000;
	
	public void openAccount(BufferedReader buff) ;
	public void deposit(BufferedReader buff);
	public void withdrawl(BufferedReader buff);
	public void openFD(BufferedReader buff);

}
