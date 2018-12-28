/******************************************************************************
 *  Compilation:  javac -d bin BubbleSort.java
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

public class BubbleSort {

	public static void main(String[] args) {
		
		System.out.println("enter the number of  elements");
		int n=AlgorithmUtility.intValue();
		int array[]=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++) 
		{
			 array[i] =AlgorithmUtility.intValue();
		}
		AlgorithmUtility.bubbleSort(array);
	}

}
