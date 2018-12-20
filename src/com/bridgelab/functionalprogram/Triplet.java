package com.bridgelab.functionalprogram;
import com.bridgelab.util.FunctionalUtility;
import java.util.Scanner;

public class Triplet {
	public static void main(String[] args)
	{
		Scanner S=new Scanner(System.in);
		System.out.println("enter the number");
		FunctionalUtility f1=new FunctionalUtility();
          int n=S.nextInt();		
          int[] arr=new int[n];
          for(int i=0;i<n;i++)
          {
        	  System.out.println("the elements are");
               arr[i]=S.nextInt();
          }
			
	     
		f1.Triplet(arr,n);
		
	}

}

