package com.bridgelab.util;
import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmUtility {
	//anagram
	public void anagram(String str1,String str2)
	{
		if(str1.length()!=str2.length())
		{
			System.out.println("str1 and str2 are not anagrams");
		}
		char[] char1 = str1.toLowerCase().toCharArray();
		char[] char2 = str2.toLowerCase().toCharArray();

		Arrays.sort(char1);
		Arrays.sort(char2);
		if(char1==char2)
			System.out.println("str1 and str2 are anagrams");
		else
		{
			System.out.println("str1 and str2 are not anagrams");
		}



	}












	////////////////////////////////////////////////

	public void prime()
	{

		for(int i=1; i < 1000; i++){

			int flag = 1;

			for(int j=2; j < i ; j++){

				if(i % j == 0){
					flag = 0;
					break;

				}
			}
			if(flag==1)
			{
				System.out.println(i);
			}




		}


	}
	///////////////////////////////
	public void palindromePrime(int limit)
	{
		int r,x=0;
		for(int i=1; i < limit; i++)
		{

			int flag = 1;

			for(int j=2; j < i ; j++)
			{

				if(i % j == 0){
					flag = 0;

				}


				if(flag==1)
				{
					int num;
					num=i;
					while(num!=0)
					{
						r=num%10;
						x=x*10+r;
						num=num/10;
					}



					if(num==x)	
						System.out.println(i);
				}

			}

		}

	}


	//////////////////////////////
	public void predictDate(int D,int M,int Y) {
		if ((D< 1 || D > 31)&&(M<1|| M>12)&&(Y>0))
		{
			int Y0 = Y - (14 - M) / 12;
			int X = Y0 + Y0/4 - Y0/100 +Y0/400;
			int M0 = M + 12 * ((14 - M) / 12) - 2;
			int D0 = (D + X + 31 * M0 / 12) % 7;  

			//String day;
			for(int i=0;i<D0;i++)
			{
				switch(i) {
				case 0: System.out.println("day = Monday ");
				break; 
				case 1:  System.out.println("day = Tuesday "); 
				break; 
				case 2:  System.out.println("day = Wednseday "); 
				break; 
				case 3: System.out.println("day = Thursday ");
				break; 
				case 4: System.out.println("day = Friday ");
				break; 
				case 5:System.out.println("day = Saturday ");
				break; 
				case 6:System.out.println("day = Sunday ");
				break; 
				default:System.out.println("inalid input");


				}


			}

		}

	}

	//////////////////////////////////////////////////////
	public void temparature(double C)
	{
		double F= ((C *9/5) + 32) ;
		System.out.println(F);


	}

	//////////////////////////////////////////////////////
	public void monthlyPayment(double P,double R,double Y) 
	{
		double r=R/(12*100);
		double n=12*Y;

		double c=Math.pow((1+r),-n);
		double payment=((P*r)/1-c);
		System.out.println(payment);
	}

	///////////////////////////////////////////////
	public void sqrt(double c) {

		double t=c;
		double epsilon= 1.0e-15; 

		while(Math.abs(t - c/t) > epsilon*t ) {
			t=((c/t)+t)/2;
		}
		System.out.println("the square root of c is"+t);


	}






	//////////////////////////////////////////////////
	public void toBinary(int n) {
		int i=0;
		int binary[]=new int[100];
		while(n>0)
		{
			binary[i]=n%2;
			n=n/2;
			i++;
		}
		for(int j=i-1;j>=0;j--)
		{
			System.out.println(binary[j]);

		}
	}




	////////////////////////////////////////////////
	public void binarySearch(int[] a,int key)
	{
		int first=0;
		int last=a.length;		
		int mid=0;


		if(first<=last)
		{
			mid=(first+last)/2;

			if(a[mid]==key)
			{
				System.out.println( "The key value found at "+mid);

			}
			if(a[mid]<key)
			{

				first=mid+1;

			}	

			else 
			{
				last=mid-1;


			}

		}



	}



	public void insertionSort(int[] array,int n) {

		int i=0;
		int key;
		for (i=1;i<n;i++)
		{
			key=array[i];
			int j=i-1;
			while(j>=0 && (array[j]>key))
			{
				array[j+1]=array[j];
				j--;

				array[j+1]=key;
			}
		}

		for(int j=0;j<n;j++) {

			System.out.print( array[j]);
			System.out.print(" ");


		}


	}


	////////////////////////////////////////////////////////////////////////






	static int i=0;
	static int total=0;
	static int money;
	public static   int calculate(int money,int[]notes)
	{
		int rem;
		if(money==0)
		{
			return -1 ;
		}
		else
		{
			if(money>=notes[i])
			{
				int count =money/notes[i];
				rem = money%notes[i];
				money =rem;
				total += count;
				System.out.println(notes[i]+  "rs Notes are  " +count );
			}
			i++;
			return calculate(money, notes);
		}
	}



	////////////////////////////////////////////////////////


	public void bubbleSort(int[] array) {
		int n = array.length;
		for (int i = 0; i < n-1; i++)
			for (int j = 0; j < n-i-1; j++)
				if (array[j] > array[j+1])
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;

				}
		for (int i = 0; i < n; i++)
		{
			System.out.println(array[i]);
		}
	}
}

























