package com.bridgelab.functionalprogram;

import com.bridgelab.util.FunctionalUtility;
import java.util.Scanner;
public class ReplaceString
{


	public static void main(String[] args)
	{
		Scanner S=new Scanner(System.in);
		System.out.println("enter the username");
		String str1="hello &&&username&& how are you";
	     FunctionalUtility f1=new FunctionalUtility();
		f1.replaceString(str1);
		
	}


}