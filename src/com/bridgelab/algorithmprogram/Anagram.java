/******************************************************************************
 *  Compilation:  javac -d bin Anagram.java
 *  Execution:    java -cp bin com.bridgelabz.util.Anagram n
 *  
 *  Purpose: Determines whether given strings are anagram or not
 *
 *  @author  Megha
 *  @version 1.0
 *  @since   22-12-2018
 *
 ******************************************************************************/

package com.bridgelab.algorithmprogram;
import java.util.Scanner;
import com.bridgelab.util.AlgorithmUtility;

public class Anagram {
	public static void main(String[] args) {

		Scanner S=new Scanner(System.in);
		System.out.println("enter the string1");
		String str1 =S.nextLine();
        System.out.println("enter the string2");
		String str2 =S.nextLine();
		

		AlgorithmUtility f=new AlgorithmUtility();
	    f.anagram(str1,str2);
		 
		
}
}