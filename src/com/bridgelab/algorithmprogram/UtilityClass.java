/******************************************************************************
 *  Compilation:  javac -d bin UtilityClass.java
 *  Execution:    java -cp bin com.bridgelabz.util.AlgorithmUtility n
 *  
 *  Purpose: determine the value by using different sorting methods
 *
 *  @author  Megha
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************************************************/
package com.bridgelab.algorithmprogram;


import com.bridgelab.util.AlgorithmUtility;
import com.bridgelab.util.FunctionalUtility;

public class UtilityClass {

	public static void main(String[] args) {
		
		System.out.println("1.binary search 2.insertion sort  3.bubble sort ");

		System.out.println("enter the choice");
		int choice=AlgorithmUtility.intValue();
		switch(choice)
		{
		
		case 1:System.out.println("enter the number of  elements");
		int n1=AlgorithmUtility.intValue();
		String array1[]=new String [n1];
		System.out.println("enter the value of  key");
		String key1=AlgorithmUtility.StringValue();
		long a =FunctionalUtility.start();
		System.out.println("start time is "+(a));
		System.out.println("enter the array elements");
		for(int i=0;i<n1;i++) 
		{
			array1[i] =AlgorithmUtility.StringValue();
		}
		
		long b=FunctionalUtility.end();
		System.out.println("endtime is "+(b));
		
		int x=AlgorithmUtility.binarySearch(array1,key1);
		System.out.println("key element found at "+x);
		long c=FunctionalUtility.elapse();
		System.out.println("elapsed time is "+(c));
		break;
		
		
		
		
		
		case 2:System.out.println("enter the number of  elements");
		int n4=AlgorithmUtility.intValue();
		String array4[]=new String[n4];
        long k =FunctionalUtility.start();
        System.out.println("start time is "+(k/1000));
		System.out.println("enter the array elements");
		for(int i=0;i<n4;i++) 
		{
			array4[i] =AlgorithmUtility.StringValue();
		}
		long l=FunctionalUtility.end();
        System.out.println("end time is "+(l/1000));
        AlgorithmUtility.insertion_Sort_String(array4,n4);
		System.out.println("Elements after sorting");
        for(int i=0;i<n4;i++)
        {
            System.out.println(array4[i]+"");
        }
		long m=FunctionalUtility.elapse();
        System.out.println("elapsed time is "+(m/1000));
       break;
		
		case 3:System.out.println("enter the number of  elements");
		int n6=AlgorithmUtility.intValue();
		String array6[]=new String[n6];
		long q=FunctionalUtility.start();
        System.out.println("start time is "+(q/1000));
		System.out.println("enter the array elements");
		for(int i=0;i<n6;i++) 
		{
			array6[i] =AlgorithmUtility.StringValue();
		}
		long r=FunctionalUtility.end();
        System.out.println("end time is "+(r/1000));
		AlgorithmUtility.bubble_Sort_String(array6);
		long s=FunctionalUtility.elapse();
        System.out.println("elapsed time is "+(s/1000));
		}
	
	}
}



