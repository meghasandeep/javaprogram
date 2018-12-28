/******************************************************************************
 *  Compilation:  javac -d bin Gambler.java
 *  Execution:    java -cp bin com.bridgelabz.util.FunctionalUtility n
 *  
 *  Purpose: printing the percenatge of win or loss while playing gambler game
 *
 *  @author  Megha
 *  @version 1.0
 *  @since   18-12-2018
 *
 ******************************************************************************/
package com.bridgelab.functionalprogram;
import com.bridgelab.util.FunctionalUtility;


public class Gambler {
	public static void main(String[] args)
	{
		
		System.out.println("enter the goal  ");
		int goal =FunctionalUtility.intValue();
		System.out.println("enter the stake  ");
		int stake=FunctionalUtility.intValue();
		System.out.println("enter the num of time ");
		int n=FunctionalUtility.intValue();		
		FunctionalUtility.gambler(n,stake,goal);
		
	}
}
