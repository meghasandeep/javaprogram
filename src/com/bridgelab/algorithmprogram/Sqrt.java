/******************************************************************************
 *  Compilation:  javac -d bin Sqrt.java
 *  Execution:    java -cp bin com.bridgelabz.util.AlgorithmUtility n
 *  
 *  Purpose: finding the square root of the given value
 *
 *  @author  Megha
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************************************************/
package com.bridgelab.algorithmprogram;
import com.bridgelab.util.AlgorithmUtility;

public class Sqrt {

	public static void main(String[] args) {
		
		System.out.println("enter the Value of c");
		double c =AlgorithmUtility.doubleValue();
		AlgorithmUtility.sqrt(c);
		 


	}

}
