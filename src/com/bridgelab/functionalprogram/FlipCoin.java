package com.bridgelab.functionalprogram;
import com.bridgelab.util.FunctionalUtility;
import java.util.Scanner;
public class FlipCoin {
	

	public static void main(String[] args)
	{
		Scanner S=new Scanner(System.in);
		System.out.println("enter the flip count");
	    int count=S.nextInt();
		
				
	     FunctionalUtility f1=new FunctionalUtility();
		f1.FlipCoin( count);
		

}
}