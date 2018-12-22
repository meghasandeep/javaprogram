package com.bridgelab.algorithmprogram;
import com.bridgelab.util.AlgorithmUtility;
import java.util.Scanner;
public class InsertionSort {
	public static void main(String[] args) {
		AlgorithmUtility f=new AlgorithmUtility();
		Scanner S=new Scanner(System.in);
		System.out.println("enter the number of  elements");
		int n=S.nextInt();
		int a[]=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++) 
		{
			a[i] =S.nextInt();
		}
		f.InsertionSort(a,n);
	}
}
