/******************************************************************************
 *  Compilation:  javac -d bin Permutation.java
 *  Execution:    java -cp bin com.bridgelabz.util.FunctionalUtility n
 *  
 *  Purpose:Permutation of all string
 *
 *  @author  Megha
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************************************************/
package com.bridgelab.functionalprogram;

import java.util.ArrayList;
import java.util.List;

import com.bridgelab.util.FunctionalUtility;

public class Permutation {
		 public static void main(String[] args) {
	            System.out.println("enter a string");
	            String str = FunctionalUtility.StringValue(); //user input
	            int len = str.length();
	            int fact=1;
	            for(int i=len;i>=1;i--)
	            {
	                fact=fact*i;
	            }
	            System.out.println("Possible combinations are :"+fact);
	            List<String> arr = new ArrayList<String>();
	            System.out.println("recursion of a string is ");
	            //Method 1- using static function of FunctionalUtilty class of com.bridgelabz.util package
	            List<String> arr1=FunctionalUtility.recursion(str, 0, len,arr);
	            System.out.println(arr1);
	            System.out.println("recursion size is: "+arr1.size());
	            System.out.println("array after sorting :");
	            arr1=FunctionalUtility.listSort(arr1);
	            System.out.println(arr1);
	            System.out.println("--------------------------------------------------------------------------------");
	            System.out.println("iteration of a string is ");
	            //Method 2- using static function of FunctionalUtilty class of com.bridgelabz.util package
	            List<String> arr2=FunctionalUtility.iteration(str);
	            System.out.println(arr2);
	            System.out.println("iteration size is: "+arr2.size());
	            System.out.println("array after sorting :");
	            arr2=FunctionalUtility.listSort(arr2);
	            System.out.println(arr2);
	            System.out.println();
	            int flag=FunctionalUtility.comparision(arr1, arr2);
	            if(flag==1)
	            {
	            System.out.println("arrays returned by two string functions are equal");
	            }
	            else
	            System.out.println("arre not same");
	        }
	    }