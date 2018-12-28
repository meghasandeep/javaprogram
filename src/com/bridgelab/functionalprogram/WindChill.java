/******************************************************************************
 *  Compilation:  javac -d bin WindChill.java
 *  Execution:    java -cp bin com.bridgelabz.util.WindChill n
 *  
 *  Purpose:Calculating the temperature value and velocity value in windchill.
 *
 *  @author  Megha
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************************************************/
package com.bridgelab.functionalprogram;
import com.bridgelab.util.FunctionalUtility;

public class WindChill {
	public static void main(String[] args)
	{
		System.out.println("enter the temperature value");
		double t=FunctionalUtility.doubleValue();
		System.out.println("enter the value of velocity ");
		double v=FunctionalUtility.doubleValue();
		FunctionalUtility.windChill(t,v);
}
}