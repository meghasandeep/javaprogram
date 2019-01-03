package com.bridgelab.datastructure;

import com.bridgelab.util.FunctionalUtility;
import com.bridgelab.util.Stack;

public class BalancedParanthesis {

	public static void main(String[] args) {

		//DataStructureUtility sc=new DataStructureUtility();
		System.out.println("enter the string ");
		String exp1=FunctionalUtility.StringValue();
		
		char[] exp = exp1.toCharArray();
		 
	
		
         if (Stack.ParenthesisBalanced(exp)) 
           System.out.println("Balanced "); 
         else
           System.out.println("Not Balanced ");   
   }

}