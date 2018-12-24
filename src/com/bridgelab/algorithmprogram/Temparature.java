package com.bridgelab.algorithmprogram;
import java.util.Scanner;
import com.bridgelab.util.AlgorithmUtility;
public class Temparature {
	public static void main(String[] args) {
		AlgorithmUtility f=new AlgorithmUtility();
		Scanner S=new Scanner(System.in);
		System.out.println("enter the temparature in celcius");
	    double C=S.nextDouble();
	    f.temparature(C);
	}
}
