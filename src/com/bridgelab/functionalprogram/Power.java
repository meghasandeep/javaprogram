package com.bridgelab.functionalprogram;
import com.bridgelab.util.FunctionalUtility;
import java.util.Scanner;
public class Power {
	public static void main(String[] args)
	{
		Scanner N=new Scanner(System.in);
		System.out.println("enter the number ");
		int n=N.nextInt();
	 FunctionalUtility f=new FunctionalUtility();
	f.power(n);
}
}