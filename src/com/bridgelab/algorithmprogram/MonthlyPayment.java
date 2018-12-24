package com.bridgelab.algorithmprogram;
import java.util.Scanner;

import com.bridgelab.util.AlgorithmUtility;

public class MonthlyPayment {
	public static void main(String[] args) {

		Scanner S=new Scanner(System.in);
		System.out.println("enter the Value of P");
		int P =S.nextInt();
		System.out.println("enter the Value of R");
		double R =S.nextDouble();
		System.out.println("enter the Value of Y");
		int Y =S.nextInt();
		

		AlgorithmUtility f=new AlgorithmUtility();
	    f.monthlyPayment(P,R,Y);
		 
	
	}
}
