/******************************************************************************
 *  Compilation:  javac -d bin Distance.java
 *  Execution:    java -cp bin com.bridgelabz.util.FunctionalUtility n
 *  
 *  Purpose: calculating a distance between the origin and entered value.
 *
 *  @author  Megha
 *  @version 1.0
 *  @since   19-12-2018
 *
 ******************************************************************************/
package com.bridgelab.functionalprogram;
import com.bridgelab.util.*;
public class Distance {
	public static void main(String[] args) 
	{
		System.out.println("enter the value of x  ");
		int x =FunctionalUtility.intValue();
		System.out.println("enter the value of y ");
		int y=FunctionalUtility.intValue();

		
		FunctionalUtility.distance(x,y);
	
	}

}
