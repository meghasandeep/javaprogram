/******************************************************************************
 *  Compilation:  javac -d bin ToBinary.java
 *  Execution:    java -cp bin com.bridgelabz.util.AlgorithmUtility n
 *  
 *  Purpose: Converting decimal value to binary value
 *
 *  @author  Megha
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************************************************/
package com.bridgelab.algorithmprogram;
import com.bridgelab.util.AlgorithmUtility;
public class ToBinary {

	public static void main(String[] args) {
		
	   System.out.println("enter the Value of n");
		int n =AlgorithmUtility.intValue();
	    int[] b=AlgorithmUtility.toBinary(n);
	    for(int j=7;j>=0;j--)
		{
			System.out.println(b[j]);

		} 
		

	}

}
