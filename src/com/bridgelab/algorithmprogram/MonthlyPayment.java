/******************************************************************************
 *  Compilation:  javac -d bin MonthlyPayment.java
 *  Execution:    java -cp bin com.bridgelabz.util.MonthlyPayment n
 *  
 *  Purpose: Calculating the monthly payment
 *
 *  @author  Megha
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************************************************/
package com.bridgelab.algorithmprogram;
import java.util.Scanner;

import com.bridgelab.util.AlgorithmUtility;

public class MonthlyPayment {
	public static void main(String[] args) {

		Scanner S=new Scanner(System.in);
		System.out.println("enter the Value of P");
		int P =S.nextInt();
		System.out.println("enter the Value of R");
		double R =S.nextDouble();
		System.out.println("enter the Value of Y");
		int Y =S.nextInt();
		

		AlgorithmUtility f=new AlgorithmUtility();
	    f.monthlyPayment(P,R,Y);
		 
	
	}
}
