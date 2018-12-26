/******************************************************************************
 *  Compilation:  javac -d bin Coupen.java
 *  Execution:    java -cp bin com.bridgelabz.util.Coupen n
 *  
 *  Purpose: print the random numbers do you need to generate distinct coupon number
 *
 *  @author  Megha
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************************************************/
package com.bridgelab.functionalprogram;
import com.bridgelab.util.FunctionalUtility;
import java.util.Scanner;

public class Coupen {
	public static void main(String[] args)
	{
		Scanner S=new Scanner(System.in);
		System.out.println("enter the number");
          int num=S.nextInt();		
				
	     FunctionalUtility f1=new FunctionalUtility();
		f1.coupen(num);
		
	}

}
