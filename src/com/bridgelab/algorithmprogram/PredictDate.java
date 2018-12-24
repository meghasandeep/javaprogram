package com.bridgelab.algorithmprogram;
import java.util.Scanner;
import com.bridgelab.util.AlgorithmUtility;

public class PredictDate {
	public static void main(String[] args) {
		AlgorithmUtility f=new AlgorithmUtility();
		Scanner S=new Scanner(System.in);
		System.out.println("enter the Date");
	    int D=S.nextInt();
	    System.out.println("enter the Month");
	    int M=S.nextInt();
	    System.out.println("enter the Year");
	    int Y=S.nextInt();
	    f.predictDate(D,M,Y);
	

}
}