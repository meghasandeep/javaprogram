/******************************************************************************
 *  Compilation:  javac -d bin Prime.java
 *  Execution:    java -cp bin com.bridgelabz.util.Prime n
 *  
 *  Purpose:Printing a prime numbers between the limit value
 *
 *  @author  Megha
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************************************************/
package com.bridgelab.algorithmprogram;
import java.util.Scanner;
import com.bridgelab.util.AlgorithmUtility;
public class Prime {
	public static void main(String[] args) {
		AlgorithmUtility f=new AlgorithmUtility();
		 Scanner S=new Scanner(System.in);
		 System.out.println("enter the limit value");
		 int limit=S.nextInt();
	    f.prime(limit);
		 
		
	}
	

}
