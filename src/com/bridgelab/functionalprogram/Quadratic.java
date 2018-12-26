/******************************************************************************
 *  Compilation:  javac -d bin Quadratic.java
 *  Execution:    java -cp bin com.bridgelabz.util.Quadratic n
 *  
 *  Purpose: finding the Quadratic roots for given value
 *
 *  @author  Megha
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************************************************/
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
			f1.quadratic(a,b,c);
	}

}
