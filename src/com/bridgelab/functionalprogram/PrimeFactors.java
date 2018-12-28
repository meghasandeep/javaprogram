/******************************************************************************
 *  Compilation:  javac -d bin PrimeFactors.java
 *  Execution:    java -cp bin com.bridgelabz.util.FunctionalUtility n
 *  
 *  Purpose: Finding the prime factors in the given range
 *
 *  @author  Megha
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************************************************/
package com.bridgelab.functionalprogram;
import com.bridgelab.util.FunctionalUtility;
public class PrimeFactors {
	public static void main(String[] args)
	{
		System.out.println("enter the number  ");
		int n=FunctionalUtility.intValue();
 FunctionalUtility.primeFactor(n);
	}

}
