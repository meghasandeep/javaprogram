/******************************************************************************
 *  Compilation:  javac -d bin PalindromePrime.java
 *  Execution:    java -cp bin com.bridgelabz.util.BinarySearch n
 *  
 *  Purpose: Searching the integer value by using Binary search
 *
 *  @author  Megha
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************************************************/package com.bridgelab.algorithmprogram;
import java.util.Scanner;
import com.bridgelab.util.AlgorithmUtility;

public class PalindromePrime {
	public static void main(String[] args) {
		//AlgorithmUtility f=new AlgorithmUtility();
	    Scanner S=new Scanner(System.in);
		System.out.println("enter the limit value");
		int limit=S.nextInt();
		int[] c=new int[limit];
		int i=0;
		 
		for(i=1;i<limit;i++)	
		{
			c[i]=AlgorithmUtility.prime(limit);
	      
		}
		
		System.out.println("prime numbers are "+i);
		 
	    }
		//int b=AlgorithmUtility.palindrome(limit);
//		int[] a=new int[limit];
//		for(int i=0;i<limit;i++)
//		{
//		int b=AlgorithmUtility.palindrome(c);
//		}
//       System.out.println("prime palindromes are "+b);
//	}
//	

}
