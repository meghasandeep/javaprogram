/******************************************************************************
 *  Compilation:  javac -d bin Permutation.java
 *  Execution:    java -cp bin com.bridgelabz.util.FunctionalUtility n
 *  
 *  Purpose:Permutation of all string
 *
 *  @author  Megha
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************************************************/
package com.bridgelab.functionalprogram;

import com.bridgelab.util.FunctionalUtility;

public class Permutation {
	public static void main(String[] args) {
    
	
	System.out.println("enter the string");
	String ip =FunctionalUtility.StringValue();

	
	System.out.println("enter the index");
	int Index =FunctionalUtility.intValue();

	FunctionalUtility.permutations(ip.toCharArray(), Index);
}
}