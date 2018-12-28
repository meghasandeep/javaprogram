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


import com.bridgelab.util.FunctionalUtility;

public class Quadratic {
	public static void main(String[] args)
	{
		
		System.out.println("enter the value of a ");
		double a=FunctionalUtility.doubleValue();
		System.out.println("enter the value of b");
		double b=FunctionalUtility.doubleValue();
		System.out.println("enter the value of c  ");
		double c =FunctionalUtility.doubleValue();
		 FunctionalUtility.quadratic(a,b,c);
	}

}
