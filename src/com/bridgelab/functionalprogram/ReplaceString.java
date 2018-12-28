/******************************************************************************
 *  Compilation:  javac -d bin ReplaceString.java
 *  Execution:    java -cp bin com.bridgelabz.util.ReplaceString n
 *  
 *  Purpose: Replace the given string by new string 
 *
 *  @author  Megha
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************************************************/
package com.bridgelab.functionalprogram;

import com.bridgelab.util.FunctionalUtility;
public class ReplaceString
{


	public static void main(String[] args)
	{
		System.out.println("enter the username");
		String str1="hello &&&username&& how are you";
		FunctionalUtility.replaceString(str1);
		
	}


}