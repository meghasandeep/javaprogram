package com.bridgelab.algorithmprogram;

import java.util.Scanner;

import com.bridgelab.util.AlgorithmUtility;

public class VendingMachine {

	public static void main(String[] args) {
		AlgorithmUtility a1= new AlgorithmUtility();
		System.out.println("enter the money in Rs");
		Scanner sc=new Scanner(System.in);
		int money=sc.nextInt();
		int[] notes = { 2000,500,100,50,20,10,5,2,1};
		System.out.println("the different notes present is");
		a1.calculate(money, notes);
	}

}
