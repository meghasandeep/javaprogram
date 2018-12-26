/******************************************************************************
 *  Compilation:  javac -d bin UtilityClass.java
 *  Execution:    java -cp bin com.bridgelabz.util.UtilityClass n
 *  
 *  Purpose: determine the value by using different sorting methods
 *
 *  @author  Megha
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************************************************/
package com.bridgelab.algorithmprogram;

import java.util.Scanner;

import com.bridgelab.util.AlgorithmUtility;
import com.bridgelab.util.FunctionalUtility;

public class UtilityClass {

	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("1.binary search of numbers 2. binary search of strings 3.insertion sort of numbers 4.insertion sort of strings 5.bubble sort of numbers 6. bubble sort of strings");

		System.out.println("enter the choice");
		int choice=S.nextInt();
		switch(choice)
		{
		case 1:System.out.println("enter the number of  elements");
		int n1=S.nextInt();
		int array1[]=new int[n1];
		System.out.println("enter the value of  key");
		int key1=S.nextInt();
		long a =FunctionalUtility.start();
		System.out.println("start time is "+(a/1000));
		System.out.println("enter the array elements");
		for(int i=0;i<n1;i++) 
		{
			array1[i] =S.nextInt();
		}
		
		long b=FunctionalUtility.end();
		System.out.println("endtime is "+(b/1000));
		AlgorithmUtility.binarySearch(array1,key1);
		long c=FunctionalUtility.elapse();
		System.out.println("elapsed time is "+(c/1000));
		break;
		
		
		case 2:System.out.println("enter the number of  elements");
		int n2=S.nextInt();
		String[] array2=new String[n2];
		System.out.println("enter the value of  key");
		String key2=S.next();
		long d =FunctionalUtility.start();
		System.out.println("start time is "+(d/1000));
		System.out.println("enter the array elements");
		for(int i=0;i<n2;i++) 
		{
			array2[i] =S.next();
		}
		long e=FunctionalUtility.end();
		System.out.println("endtime is "+(e/1000));
		AlgorithmUtility.binary_Search_String(array2,key2);
		long f=FunctionalUtility.elapse();
		System.out.println("elapsed time is "+(f/1000));
		break;
		
		case 3:System.out.println("enter the number of  elements");
		int n3=S.nextInt();
		int array3[]=new int[n3];
		long g=FunctionalUtility.start();
		System.out.println("start time is "+(g/1000));
		System.out.println("enter the array elements");
		for(int i=0;i<n3;i++) 
		{
			array3[i] =S.nextInt();
		}
		long h=FunctionalUtility.end();
		System.out.println("endtime is "+(h/1000));
		AlgorithmUtility.insertionSort(array3,n3);
		
		System.out.println("Elements after sorting");
        for(int i=0;i<n3;i++)
        {
            System.out.println(array3[i]+"");
        }
        long j=FunctionalUtility.elapse();
        System.out.println("elapsed time is "+(j/1000));
		break;
		
		
		case 4:System.out.println("enter the number of  elements");
		int n4=S.nextInt();
		String array4[]=new String[n4];
        long k =FunctionalUtility.start();
        System.out.println("start time is "+(k/1000));
		System.out.println("enter the array elements");
		for(int i=0;i<n4;i++) 
		{
			array4[i] =S.next();
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
		case 5:System.out.println("enter the number of  elements");
		int n5=S.nextInt();
		int array5[]=new int[n5];
		long n =FunctionalUtility.start();
        System.out.println("start time is "+(n/1000));
		System.out.println("enter the array elements");
		for(int i=0;i<n5;i++) 
		{
			array5[i] =S.nextInt();
		}
		long o=FunctionalUtility.end();
        System.out.println("end time is "+(o/1000));
		AlgorithmUtility.bubbleSort(array5);
		System.out.println("Elements after sorting");
        for(int i=0;i<n5;i++)
        {
            System.out.println(array5[i]+"");
        }
        long p=FunctionalUtility.elapse();
        System.out.println("elapsed time is "+(p/1000));
		break;
		
		
		
		case 6:System.out.println("enter the number of  elements");
		int n6=S.nextInt();
		String array6[]=new String[n6];
		long q=FunctionalUtility.start();
        System.out.println("start time is "+(q/1000));
		System.out.println("enter the array elements");
		for(int i=0;i<n6;i++) 
		{
			array6[i] =S.next();
		}
		long r=FunctionalUtility.end();
        System.out.println("end time is "+(r/1000));
		AlgorithmUtility.bubble_Sort_String(array6);
		long s=FunctionalUtility.elapse();
        System.out.println("elapsed time is "+(s/1000));
		}
	
	}
}



