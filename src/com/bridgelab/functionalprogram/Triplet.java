/******************************************************************************
 *  Compilation:  javac -d bin Triplet.java
 *  Execution:    java -cp bin com.bridgelabz.util.Triplet n
 *  
 *  Purpose: finding the triplet numbers whose sum is zero
 *
 *  @author  Megha
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************************************************/
package com.bridgelab.functionalprogram;
import com.bridgelab.util.FunctionalUtility;

public class Triplet {
	public static void main(String[] args)
	{
		System.out.println("enter the number");
          int n=FunctionalUtility.intValue();;		
          int[] arr=new int[n];
          for(int i=0;i<n;i++)
          {
        	  System.out.println("the elements are");
               arr[i]=FunctionalUtility.intValue();
          }
			
	     
          FunctionalUtility.triplet(arr,n);
		
	}

}

