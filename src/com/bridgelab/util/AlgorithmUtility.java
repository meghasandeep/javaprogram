package com.bridgelab.util;
import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmUtility {

	public static void anagram(String str1,String str2)
	{   
		boolean key=true;

		if(str1.length()!=str2.length())
		{
			key=false;
		}
		else {	

			char[] char1 = str1.toLowerCase().toCharArray();
			char[] char2 = str2.toLowerCase().toCharArray();

			Arrays.sort(char1);
			Arrays.sort(char2);
			key= Arrays.equals(char1,char2);
		}


		if(key)
		{

			System.out.println("str1 and str2 are anagrams");
		}
		else
		{
			System.out.println("str1 and str2 are not anagrams");
		}

	}














	//prime number

	public static int prime(int limit)
	{

		for(int i=1; i < limit; i++){

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
		return i;


	}
	//palindrome 
	public static int palindrome(int limit)
	{
		int rem;
		int rev=0;
			for (int i = 1; i <= limit; i++)
			{
				int num = i;
				while (num > 0)
				{
					rem= num % 10;
					rev = rev * 10 + rem;
					num = num / 10;
				}
				if (rev == i)
				{
					System.out.print(i + " ");
				}
				rev = 0;
			}
			return 0;
			
		}





	///predictdate
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
	/**
	 * @param n input number
	 * @return
	 */
	public static int[] toBinary(int n) {
		int i=0;
		int binary[]=new int[100];
		while(n>0)
		{
			binary[i]=n%2;
			n=n/2;
			i++;
		}

		return(binary);
	}




	////////////////////////////////////////////////
	
	/**
	 * @param a input array 
	 * @param key required element
	 * @return mid value
	 */
	/**
	 * @param a
	 * @param key
	 * @return
	 */
	public static int binarySearch(int[] a,int key)
	{
		int first=0;
		int last=a.length;		
		int mid=0;


		if(first<=last)
		{
			mid=(first+last)/2;

			if(a[mid]==key)
			{
			return mid;

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

return 0;

	}



	public static void insertion_Sort_String(String[] arr,int n) {

		int i=0;
		String temp=" ";
		for (i=1;i<n;i++)
		{
			temp=arr[i];
			int j=i-1;
			while((j>=0) && ((arr[j].compareTo(temp))>0))
			{

				{
					arr[j+1]=arr[j];
					j--;

					arr[j+1]=temp;
				}
			}



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
				return count ;
			}
			i++;
			return calculate(money, notes);
		}
	}



	////////////////////////////////////////////////////////


	public static void bubbleSort(int[] array) {
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

	////////////////////////////////////////////////////////////
	public static int swapNibbles(int x)
	{
		return ((x & 0x0F) << 4 | (x & 0xF0) >> 4); 	

	}


	public static void mergeSort(String array[],int low,int high)
	{
		int n=high-low;
		if(n<=1)
			return;
		int mid=low+n/2;
		mergeSort(array,low,mid);
		mergeSort(array,mid,high);
		String[] temp=new String[n];
		int i=low,j=mid;
		for(int k=0;k<n;k++)
		{
			if(i==mid)
				temp[k]=array[j++];
			else if(j==high)
				temp[k]=array[i++];
			else if(array[j].compareToIgnoreCase(array[i])<0)
				temp[k]=array[j++];
			else
				temp[k]=array[i++];
		}

		for(int k=0;k<n;k++)
		{
			array[low +k]=temp[k];
		}

	}

	public static void bubble_Sort_String(String[] array) {
		int n = array.length;
		String temp="";
		for (int i = 0; i < n-1; i++)
			for (int j = 0; j < n-i-1; j++)
				if ((array[j]).compareTo(array[j+1])>0)
				{
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;

				}
		for (int i = 0; i < n; i++)
		{
			System.out.println(array[i]);
		}
	}

	public static void binary_Search_String(String[] a,String key)
	{
		int first=0;
		int last=a.length;		
		int mid=0;


		if(first<=last)
		{
			mid=(first+last)/2;

			if(a[mid].equalsIgnoreCase(key))
			{
				System.out.println( "The key value found at "+mid);


				if((a[mid]).compareTo((key))>0)
				{

					first=mid+1;

				}	

				else 
				{
					last=mid-1;


				}

			}



		}

	}
	public static void insertionSort(int[] array3,int n) {

		int i=0;

		for (i=1;i<n;i++)
		{
			int temp=array3[i];
			int j=i-1;
			while((j>=0) && ((array3[j]>(temp))))
			{

				{
					array3[j+1]=array3[j];
					j--;

					array3[j+1]=temp;
				}
			}



		}


	}

}







