/******************************************************************************
 *  Compilation:  javac -d bin FlipCoin.java
 *  Execution:    java -cp bin com.bridgelabz.util.FunctionalUtility n
 *  
 *  Purpose: Flip Coin and print percentage of Heads and Tails

 *
 *  @author  Megha
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************************************************/
package com.bridgelab.functionalprogram;
import com.bridgelab.util.FunctionalUtility;

public class FlipCoin {
	

	public static void main(String[] args)
	{
		System.out.println("enter the flip count");
	    int count=FunctionalUtility.intValue();
		
		
	    FunctionalUtility.flipCoin( count);
		

}
}