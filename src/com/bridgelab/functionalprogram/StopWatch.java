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
		
		long a =FunctionalUtility.start();
		System.out.println(a);
		
		long b=FunctionalUtility.end();
		System.out.println(b);
		
		long c=FunctionalUtility.elapse();
		System.out.println(c+" millisec");
	}
}
