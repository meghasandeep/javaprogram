package com.bridgelab.datastructure;

import java.util.Scanner;

import com.bridgelab.util.DequeImpl;

public class Palindrome {
	public static void main(String[] args) 

	{
		DequeImpl f=new DequeImpl();
	
			Scanner sc=new Scanner(System.in);

			System.out.println("Enter a String To Check Whether It is Pallindrome or Not : ");
			String s=sc.nextLine();

			//adding each character to the rear of the dequeue
			for(int i=0;i<s.length();i++)
			{
				char c =s.charAt(i);
			}
			boolean flag=true;

			while(f.size()>1)
			{
				System.out.println("mmm");
				for(int i=0;i<s.length();i++)
				{
					char d =s.charAt(i);
					System.out.println(d);
				
				  Object first = f.removeFront(d);
				  System.out.println(d);
				  Object last = f.removeRear(d);
				if(first!=last)
				{
					flag=false;
					break;
				}

			}
			}
				if(flag)
				{
					System.out.println("The Entered String is not a Pallindrome");
				}
				else
				{
					System.out.println("The Entered String is not a Pallindrome");
				}
			}

	}
	


	

