package com.bridgelab.algorithmprogram;
import java.util.Scanner;
import com.bridgelab.util.AlgorithmUtility;
import com.bridgelab.util.FunctionalUtility;

public class Anagram {
	public static void main(String[] args) {

		Scanner S=new Scanner(System.in);
		System.out.println("enter the string1");
		String str1 =S.nextLine();
        System.out.println("enter the string2");
		String str2 =S.nextLine();
		

		AlgorithmUtility f=new AlgorithmUtility();
	    f.Anagram(str1,str2);
		 
		
}
}