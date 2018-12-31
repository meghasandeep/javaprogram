/******************************************************************************
 *  Compilation:  javac -d bin Temparature.java
 *  Execution:    java -cp bin com.bridgelabz.util.AlgorithmUtility n
 *  
 *  Purpose: converting temparature from celcius to Fahrenheit
 *
 *  @author  Megha
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************************************************/
package com.bridgelab.algorithmprogram;
import com.bridgelab.util.AlgorithmUtility;
public class Temparature{
	public static void main(String[] args) {
		System.out.println("enter 1. for conversion from celcius to fahrenheit 2. for conversion from fahrenheit to celcius");
		int choice=AlgorithmUtility.intValue();

		switch(choice) {
		case 1:    System.out.println("Enter the temperature in celsius");
		double tc=AlgorithmUtility.doubleValue();
		double c=AlgorithmUtility.temparatureF(tc);
		System.out.println(c);
		break;

		case 2:System.out.println("Enter the temperature in fahrenheit");
		double tf=AlgorithmUtility.doubleValue();
		double f=AlgorithmUtility.temparatureC(tf);
		System.out.println(f);
		break;
		}
	}
}
