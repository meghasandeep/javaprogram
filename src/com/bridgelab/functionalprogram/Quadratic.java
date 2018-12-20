package com.bridgelab.functionalprogram;

import java.util.Scanner;

import com.bridgelab.util.FunctionalUtility;

public class Quadratic {
	public static void main(String[] args)
	{
		Scanner N=new Scanner(System.in);
		System.out.println("enter the value of a ");
		double a=N.nextDouble();
		System.out.println("enter the value of b");
		double b=N.nextDouble();
		System.out.println("enter the value of c  ");
		double c =N.nextDouble();
		 FunctionalUtility f1=new FunctionalUtility();
			f1.Quadratic(a,b,c);
	}

}
