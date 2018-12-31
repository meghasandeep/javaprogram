/******************************************************************************
 *  Compilation:  javac -d bin BinarySearch.java
 *  Execution:    java -cp bin com.bridgelabz.util.AlgorithmUtility n
 *  
 *  Purpose: Searching the integer value by using Binary search
 *
 *  @author  Megha
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************************************************/

package com.bridgelab.algorithmprogram;
import com.bridgelab.util.AlgorithmUtility;
public class BinarySearch {
	public static void main(String[] args) {
		
		
		    int n=Integer.parseInt(args[0]);
			int range=(int)(Math.pow(2,n-1));                //range calculation for the number
			System.out.println("Take number between '0' to "+range);
			int count=0;
			String input="null";
			int lower=0;
			int upper=range;
			int middle=(lower+upper/2);
			AlgorithmUtility.binarySearch(lower,upper,middle,count,input,n-1);
		
	
	}
	}


