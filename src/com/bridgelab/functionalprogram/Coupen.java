package com.bridgelab.functionalprogram;
import com.bridgelab.util.FunctionalUtility;
import java.util.Scanner;

public class Coupen {
	public static void main(String[] args)
	{
		Scanner S=new Scanner(System.in);
		System.out.println("enter the number");
          int num=S.nextInt();		
				
	     FunctionalUtility f1=new FunctionalUtility();
		f1.coupen(num);
		
	}

}
