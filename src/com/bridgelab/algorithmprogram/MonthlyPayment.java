/******************************************************************************
 *  Compilation:  javac -d bin MonthlyPayment.java
 *  Execution:    java -cp bin com.bridgelabz.util.AlgorithmUtility n
 *  
 *  Purpose: Calculating the monthly payment
 *
 *  @author  Megha
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************************************************/
package com.bridgelab.algorithmprogram;

import com.bridgelab.util.AlgorithmUtility;

public class MonthlyPayment {
	public static void main(String[] args) {

		
		System.out.println("enter the Value of P");
		int P =AlgorithmUtility.intValue();
		System.out.println("enter the Value of R");
		double R =AlgorithmUtility.doubleValue();
		System.out.println("enter the Value of Y");
		int Y =AlgorithmUtility.intValue();
		

		AlgorithmUtility.monthlyPayment(P,R,Y);
		 
	
	}
}
