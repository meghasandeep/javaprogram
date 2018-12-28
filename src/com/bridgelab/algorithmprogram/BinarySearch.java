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
		
		System.out.println("enter the number of  elements");
		int n=AlgorithmUtility.intValue();
		int a[]=new int[n];
		System.out.println("enter the value of  key");
		int key=AlgorithmUtility.intValue();
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++) 
		{
		 a[i] =AlgorithmUtility.intValue();
		}
		int c=AlgorithmUtility.binarySearch(a,key);
		System.out.println("the key value found at "+c);
	} 
}
