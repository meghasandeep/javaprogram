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
	public static void main(String[] args)
	{
		String str1, str2;
		System.out.print("Enter First String : ");
		str1 = AlgorithmUtility.StringValue();
		System.out.print("Enter Second String : ");
		str2 = AlgorithmUtility.StringValue();
		int len1 = str1.length();                          //len1 holds Length of first String
		int len2 = str2.length();
		str2=str2.toUpperCase();
		str1=str1.toUpperCase();
		//len1 holds Length of first String
		if(len1 == len2)                                   // Check for string length are equal or not
		{
			boolean a=AlgorithmUtility.isAnagram(str2,str1);
			if(!a){
				System.out.print("Strings are not Anagram to Each Other");
			}
			else
				System.out.print("Strings are Anagram");
		}
		else
		{
			System.out.print("length of both Strings should be equal");//print if length ar e not equal
		}
	}
}
