
package com.bridgelab.util;
import java.util.Random;
import java.util.Scanner;
import com.bridgelab.functionalprogram.*;
public class FunctionalUtility <E>{






	public void replaceString( String str1)
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




	public void flipCoin(int count)
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










	public void leapYear()
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












	public void power()
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


	public void harmonic()
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


	public void primeFactor()
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



	public void gambler()
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

	public void coupen(int n)
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

public void triplet(int[] arr,int n)
{
		
	boolean flag =false;
	for(int i=0;i<n-2;i++)
	{
		for(int j=i+1;j<n-1;j++)
		{
			for(int k=j+1;k<n;k++)
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

public  void displayArray(E[][]garray,int m,int n)
{
	 for(int i=0;i< m;i++)
     {
   	    for(int j=0;j<n;j++)
   	    {
   		System.out.print(garray[i][j] +" ");
   	  }
   	    System.out.println();
     }
}


//////////////////////////////////////////////////
public void distance()
{
	Scanner N=new Scanner(System.in);
	System.out.println("enter the value of x  ");
	int x =N.nextInt();
	System.out.println("enter the value of y ");
	int y=N.nextInt();
	double result;
	result=Math.sqrt(x*x+y*y);
	System.out.println("result is"+result);
	
}



///////////////////////////////
public void quadratic(double a,double b,double c) {
	
	double d=Math.sqrt(b*b-4*a*c);
	double root1=(-b+(d)/(2*a*b));
	double root2=(-b-(d)/(2*a*b));
	System.out.println(root1);
	System.out.println(root2);
	

	
}



////////////////////////////////////


	
	long starttime=0;
	long endtime=0;
	long elaspedtime=0;
	
	
	   public void start()
	   {
		 starttime= System.currentTimeMillis();
	
		 System.out.println("Start time "+starttime);
	   }
	   public void end()
	   {
     endtime= System.currentTimeMillis();
	 System.out.println("end time "+endtime);
	   }
	public void elapse() {
		elaspedtime=endtime-starttime;
		System.out.println(elaspedtime);
	}


public void windChill(double t,double v)
{
	double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
	System.out.println("The value of W is   " +w);
	
}



////////////////////////////////////////
public void  permutations()
{
	class Permutations
	{
		private  void swap(char[] ip , int i, int j)
		{
			char temp = ip[i];
			ip[i] = ip[j];
			ip[j] = temp;
			System.out.println((ip));
		}
	
	private  void permutations(char[] ip, int Index)
	{
		if (Index == ip.length - 1) {
			System.out.println(ip);
		}

		for (int i = Index; i < ip.length; i++)
		{
			
			swap(ip, Index, i);
			permutations(ip, Index + 1);
			swap(ip, Index, i);
		
	}
	
	
	}
}
}


}











































