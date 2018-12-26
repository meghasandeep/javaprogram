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
import java.util.Scanner;

import com.bridgelab.util.FunctionalUtility;

public class StopWatch {
	public static void main(String[] args)
	{
		FunctionalUtility f=new FunctionalUtility();
		
		long a =f.start();
		
		long b=f.end();
		
		long c=f.elapse();
		System.out.println(c+" millisec");
	}
}
