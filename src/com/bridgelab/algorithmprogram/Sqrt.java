/******************************************************************************
 *  Compilation:  javac -d bin Sqrt.java
 *  Execution:    java -cp bin com.bridgelabz.util.Sqrt n
 *  
 *  Purpose: finding the square root of the given value
 *
 *  @author  Megha
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************************************************/
package com.bridgelab.algorithmprogram;
import java.util.Scanner;

import com.bridgelab.util.AlgorithmUtility;


public class Sqrt {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("enter the Value of c");
		double c =S.nextDouble();
		AlgorithmUtility f=new AlgorithmUtility();
	    f.sqrt(c);
		 


	}

}
