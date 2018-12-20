
package com.bridgelab.util;
import java.util.Random;
import java.util.Scanner;
import com.bridgelab.functionalprogram.*;
public class FunctionalUtility <E>{






	public void ReplaceString( String str1)
	{
		Scanner S=new Scanner(System.in);

		String S1=S.nextLine();
		if(S1.length()>=3)
		{
			String S2 = str1.replace("&&&username&&", S1);
			System.out.println(S2);
		}
		else
		{

			System.out.println("invalid name"); 

		}

	}




	public void FlipCoin(int count)
	{
		int head=0;
		int tail=0;
		int i=count;
		Random result=new Random();
		while(count>0)
		{
			double r=result.nextInt();
			if(r==0.5)

				tail++;

			else

				head++;

			count--;
		}	      



		System.out.println(head*100/i);
		System.out.println(tail*100/i);
	}










	public void LeapYear()
	{

		Scanner S=new Scanner(System.in);
		System.out.println("enter the year");

		int year=S.nextInt();

		if((year%400 == 0) &&(year%4 ==0))
		{
			System.out.println("year is leap year");
		}
		else if(year%100==0)
		{
			System.out.println("year is not leap year");
		}
		else
		{
			System.out.println("year is not leap year");
		}
	}












	public void Power()
	{
		Scanner N=new Scanner(System.in);
		System.out.println("enter the number ");
		int n=N.nextInt();
		int count=0;
		if(n>=0 && n<31)
		{

			for(int i=0;i<n;i++)
			{
				System.out.println(Math.pow(2,count));
				count++;

			}


		}
		else
		{
			System.out.println("out of range");
		}
	}


	public void Harmonic()
	{
		Scanner N=new Scanner(System.in);
		System.out.println("enter the number  ");
		int n=N.nextInt();
		int i=1;
		double result=0;
		for(i=1;i<=n;i++)
		{

			result=result+(float)1/i;

		}
		System.out.println(result);
	}


	public void PrimeFactor()
	{
		Scanner N=new Scanner(System.in);
		System.out.println("enter the number  ");
		int n=N.nextInt();
		int i=1;int j=2;
		int res = 1;
		for(i=2;i<=n;i++)
		{
			if(n%i==0)
			{

				for(j=2;j<=(i/2);j++)	
				{
					if(i%j==0)
					{
						res=0;
						break;

					}
				}   


				if(res==1)

					System.out.println(i);

			}
		}
	}



	public void Gambler()
	{
		Scanner N=new Scanner(System.in);
		System.out.println("enter the goal  ");
		int goal =N.nextInt();
		System.out.println("enter the stake  ");
		int stake=N.nextInt();
		System.out.println("enter the num of time ");
		int n=N.nextInt();
		Random result=new Random();
		int i=1;
		int win=0;
		int loss=0;

		for(i=1;i<=n;i++)
		{
			int cash=stake;
			while(cash>0 && cash<goal)
			{
				double r=result.nextInt();

				if(r<0.4)
				{
					cash++;
				}
				else
				{
					cash--;
				}
			}

			if(cash==goal)
			{
				win++;

			}
			else

				loss++;

		}

		System.out.println(win*100/n);
		System.out.println(loss*100/n);
	}

	public void Coupen(int n)
	{
		boolean[] coup=new boolean[n];
		int count=0;
		int distinct=0;
		while(distinct<n)
		{
			Random rand=new Random();
			int content=rand.nextInt(n);
			count++;
			if(!coup[content])
			{
				distinct++;
				System.out.println(distinct);
				coup[content]=true;
			}
		}

		System.out.println("num of count"+count);

	}





/////////////////////////////////////////////

public void Triplet(int[] arr,int n)
{
		
	boolean flag =false;
	for(int i=0;i<=n-2;i++)
	{
		for(int j=i+1;j<=n-1;j++)
		{
			for(int k=j+1;k<=n;k++)
			{
				if(arr[i]+arr[j]+arr[k]==0)
				{
					System.out.println("true");
				flag=true;
			
					
			     }
				
		     }
			
	      }
		
       }
if(flag==false)
{
	System.out.println("false");
}
}


///////////////////////////////////////////

public  void displayarray(E[][]garray,int m,int n)
{
	 for(int i=0;i< m;i++)
     {
   	    for(int j=0;j<n;j++)
   	    {
   		System.out.println(garray[i][j] +" ");
   	  }
     }
}

}






























































