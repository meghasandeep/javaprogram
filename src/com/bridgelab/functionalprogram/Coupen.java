/******************************************************************************
 *  Compilation:  javac -d bin Coupen.java
 *  Execution:    java -cp bin com.bridgelabz.util.FunctionalUtility n
 *  
 *  Purpose: print the random numbers do you need to generate distinct coupon number
 *
 *  @author  Megha
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/
package com.bridgelab.functionalprogram;
import com.bridgelab.util.FunctionalUtility;

public class Coupen {
	public static void main(String[] args)
	{
		
		System.out.println("enter the number");
          int num=FunctionalUtility.intValue();	
				
	    
          FunctionalUtility.coupen(num);
		
	}

}
