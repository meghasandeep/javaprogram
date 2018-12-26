/******************************************************************************
 *  Compilation:  javac -d bin MergeSort.java
 *  Execution:    java -cp bin com.bridgelabz.util.MergeSort n
 *  
 *  Purpose: Searching the integer value by using Merge sort
 *
 *  @author  Megha
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************************************************/
package com.bridgelab.algorithmprogram;

import java.util.Scanner;

import com.bridgelab.util.AlgorithmUtility;

public class MergeSort
{

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of your array");
        int n=sc.nextInt();
        String arr[]=new String[n];
        System.out.println("Enter the elements");

        for( int i=0;i<n;i++)
        {   
            arr[i]=sc.next();
        }
       
        AlgorithmUtility.mergeSort(arr,0,n);
        System.out.println("Elements after sorting");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+"");
        }

    }

}
