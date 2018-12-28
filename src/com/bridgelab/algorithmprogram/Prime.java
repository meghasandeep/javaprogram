/******************************************************************************
 *  Compilation:  javac -d bin Prime.java
 *  Execution:    java -cp bin com.bridgelabz.util.AlgorithmUtility n
 *  
 *  Purpose:Printing a prime numbers between the limit value
 *
 *  @author  Megha
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************************************************/
package com.bridgelab.algorithmprogram;
import com.bridgelab.util.AlgorithmUtility;
public class Prime {
	public static void main(String[] args) {
		
		
		 System.out.println("enter the limit value");
		 int limit=AlgorithmUtility.intValue();
		 AlgorithmUtility.prime(limit);
		 
		
	}
	

}
