/******************************************************************************
 *  Compilation:  javac -d bin InsertionSort.java
 *  Execution:    java -cp bin com.bridgelabz.util.Insertionsort n
 *  
 *  Purpose: Searching the string  by using Insertion sort
 *
 *  @author  Megha
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************************************************/
package com.bridgelab.algorithmprogram;
import com.bridgelab.util.AlgorithmUtility;
import java.util.Scanner;
public class InsertionSort {
	public static void main(String[] args) {
		
		Scanner S=new Scanner(System.in);
		System.out.println("enter the number of  elements");
		int n=S.nextInt();
		 String arr[]=new String[n];
	        System.out.println("Enter the elements");

	        for( int i=0;i<n;i++)
	        {   
	            arr[i]=S.next();
	        }
		
		 AlgorithmUtility.insertion_Sort_String(arr,n);
	        System.out.println("Elements after sorting");
	        for(int i=0;i<n;i++)
	        {
	            System.out.println(arr[i]+"");
	        }

	}
}
