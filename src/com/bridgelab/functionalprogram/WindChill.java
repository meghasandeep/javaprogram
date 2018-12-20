package com.bridgelab.functionalprogram;
import java.util.Scanner;

import com.bridgelab.util.FunctionalUtility;

public class WindChill {
	public static void main(String[] args)
	{
		FunctionalUtility f=new FunctionalUtility();
		Scanner S=new Scanner(System.in);
		System.out.println("enter the temperature value");
		double t=S.nextDouble();
		System.out.println("enter the value of velocity ");
		double v=S.nextDouble();
        f.WindChill(t,v);
}
}