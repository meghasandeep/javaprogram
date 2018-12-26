/******************************************************************************
 *  Compilation:  javac -d bin FlipCoin.java
 *  Execution:    java -cp bin com.bridgelabz.util.FlipCoin n
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
import java.util.Scanner;
public class FlipCoin {
	

	public static void main(String[] args)
	{
		Scanner S=new Scanner(System.in);
		System.out.println("enter the flip count");
	    int count=S.nextInt();
		
				
	     FunctionalUtility f1=new FunctionalUtility();
		f1.flipCoin( count);
		

}
}