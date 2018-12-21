package com.bridgelab.functionalprogram;
import java.util.Scanner;

import com.bridgelab.util.FunctionalUtility;

public class StopWatch {
	public static void main(String[] args)
	{
		FunctionalUtility f=new FunctionalUtility();
		Scanner S=new Scanner(System.in);
		System.out.println("enter 1 to start");
		//long st=S.nextLong();
		f.start();
		System.out.println("enter 2 to end ");
		long end=S.nextLong();
		f.end();
		System.out.println("enter 3 to find elapsed time ");
		//long elapse=S.nextLong();
		f.elapse();
	}
}
