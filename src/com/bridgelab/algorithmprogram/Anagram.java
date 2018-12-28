/******************************************************************************
 *  Compilation:  javac -d bin Anagram.java
 *  Execution:    java -cp bin com.bridgelabz.util.AlgorithmUtility n
 *  
 *  Purpose: Determines whether given strings are anagram or not
 *
 *  @author  Megha
 *  @version 1.0
 *  @since   22-12-2018
 *
 ******************************************************************************/

package com.bridgelab.algorithmprogram;
import com.bridgelab.util.AlgorithmUtility;

public class Anagram {
	public static void main(String[] args) {

		System.out.println("enter the string1");
		String str1 =AlgorithmUtility.StringValue();
        System.out.println("enter the string2");
		String str2 =AlgorithmUtility.StringValue();
	     AlgorithmUtility.anagram(str1,str2);
		 
		
}
}