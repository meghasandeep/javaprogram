/******************************************************************************
 *  Compilation:  javac -d bin StopWatch.java
 *  Execution:    java -cp bin com.bridgelabz.util.StopWatch n
 *  
 *  Purpose: finding the elapsed time between start and end time
 *
 *  @author  Megha
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************************************************/
package com.bridgelab.functionalprogram;

import com.bridgelab.util.FunctionalUtility;

public class StopWatch {
	public static void main(String[] args)
	{
		System.out.println("enter any integer to start the watch");
		int start=FunctionalUtility.intValue();
		long a =FunctionalUtility.start();
		System.out.println(a);
		//int d=FunctionalUtility.intValue();
		//System.out.println(d);
		System.out.println("enter any integer to stop the watch");
		int stop=FunctionalUtility.intValue();
		long b=FunctionalUtility.end();
		System.out.println(b);
		
		long c=FunctionalUtility.elapse();
		System.out.println(c+" millisec");
	}
}
