package com.bridgelab.datastructure;

import com.bridgelab.util.FunctionalUtility;
import com.bridgelab.util.StackImpl;

public  class BalancedParanthesis{

	public static void main(String[] args) throws Exception {
	

		System.out.println("enter the string ");
		String exp1=FunctionalUtility.StringValue();
		
		char[] exp = exp1.toCharArray();
	
		
		
         if (StackImpl.ParenthesisBalanced(exp)) 
           System.out.println("Balanced "); 
         else
           System.out.println("Not Balanced ");   
   }

}