package com.bridgelab.algorithmprogram;
import java.util.Scanner;
import com.bridgelab.util.AlgorithmUtility;


public class BinarySearch {
	public static void main(String[] args) {
		AlgorithmUtility f=new AlgorithmUtility();
		Scanner S=new Scanner(System.in);
		System.out.println("enter the number of  elements");
		int n=S.nextInt();
		int a[]=new int[n];
		System.out.println("enter the value of  key");
		int key=S.nextInt();
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++) 
		{
		 a[i] =S.nextInt();
		}
	    f.BinarySearch(a,key);
	} 
}
