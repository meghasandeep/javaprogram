/******************************************************************************
 *  Compilation:  javac -d bin BubbleSort.java
 *  Execution:    java -cp bin com.bridgelabz.util.BubbleSort n
 *  
 *  Purpose: Searching the integer value by using Binary search
 *
 *  @author  Megha
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************************************************/

package com.bridgelab.algorithmprogram;

import java.util.Scanner;

import com.bridgelab.util.AlgorithmUtility;

public class BubbleSort {

	public static void main(String[] args) {
		AlgorithmUtility f=new AlgorithmUtility();
		Scanner S=new Scanner(System.in);
		System.out.println("enter the number of  elements");
		int n=S.nextInt();
		int array[]=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++) 
		{
			 array[i] =S.nextInt();
		}
		f.bubbleSort(array);
	}

}
