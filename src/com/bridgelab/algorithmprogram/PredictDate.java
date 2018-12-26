/******************************************************************************
 *  Compilation:  javac -d bin PredictDate.java
 *  Execution:    java -cp bin com.bridgelabz.util.PredictDate n
 *  
 *  Purpose: Finding a day of the week
 *
 *  @author  Megha
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************************************************/
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