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
public class Temparature {
	public static void main(String[] args) {
	
		System.out.println("enter the temparature in celcius");
	    double C=AlgorithmUtility.doubleValue();
	    AlgorithmUtility.temparature(C);
	}
}
