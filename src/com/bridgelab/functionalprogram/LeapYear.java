/******************************************************************************
 *  Compilation:  javac -d bin LeapYear.java
 *  Execution:    java -cp bin com.bridgelabz.util.FunctionalUtility n
 *  
 *  Purpose: Converting decimal value to binary value
 *
 *  @author  Megha
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************************************************/
package com.bridgelab.functionalprogram;
import com.bridgelab.util.FunctionalUtility;


public class LeapYear 
{
	public static void main(String[] args)
	{
		System.out.println("enter the year");

		int year=FunctionalUtility.intValue();
 FunctionalUtility.leapYear(year);
}
}