package com.bridgelab.algorithmprogram;
import java.util.Scanner;
import com.bridgelab.util.AlgorithmUtility;

public class PalindromePrime {
	public static void main(String[] args) {
		AlgorithmUtility f=new AlgorithmUtility();
	    Scanner S=new Scanner(System.in);
		System.out.println("enter the limit value");
		int limit=S.nextInt();
	    f.palindromePrime(limit);

	}
	

}
