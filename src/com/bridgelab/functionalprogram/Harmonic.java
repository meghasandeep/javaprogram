/******************************************************************************
 *  Compilation:  javac -d bin Harmonic.java
 *  Execution:    java -cp bin com.bridgelabz.util.FunctionalUtility n
 *  
 *  Purpose: finding the sum of harmonic numbers in the given limit
 *
 *  @author  Megha
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************************************************/
package com.bridgelab.functionalprogram;
import com.bridgelab.util.FunctionalUtility;
public class Harmonic {
	public static void main(String[] args)
	{

		System.out.println("enter the number  ");
		int n=FunctionalUtility.intValue();
	FunctionalUtility.harmonic(n);


}
}