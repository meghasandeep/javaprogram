package com.bridgelab.util;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AlgorithmUtility {
	static Scanner sc = new Scanner(System.in);

	public static int intValue()
	{


		return sc.nextInt();
	}


	public static double doubleValue()
	{
		return sc.nextInt();
	}


	public static String StringValue()
	{

		return sc.next();
	}


	//Program to check whether the given strings are anagrams or not.         

	/**
	 * @param str1 input string1
	 * @param str2 input string2
	 */
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
			AlgorithmUtility.sortChar(char1);
			AlgorithmUtility.sortChar(char2);
			
			
			key= Arrays.equals(char1,char2);
		}
		if(key)
			System.out.println("str1 and str2 not anagrams");
		else
			System.out.println("str1 and str2 are  anagrams");
	}
		public static char[] sortChar(char[] cha)
		{
			char[] b=new char[cha.length];
			for(int i=0;i<cha.length;i++)
			{
				int count=0;
				for(int j=0;j<cha.length;j++)
				{
					if(cha[i]<cha[j])
					{
						count++;
					}
					b[count]=cha[i];
				}
			}
			return b;
			
		}
	

	//Program to print prime number in the given range
	/**
	 * @param limit input range till that range we have to find the prime numbers
	 * @return i
	 */
	public static int prime(int limit)
	{
		for(int i=2; i < limit; i++){
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

	//Program to search the string using binary search method


	/**
	 * @param str input string
	 * @param key string which we want to find
	 * @return mid
	 */







	// program to find the day for the given date,month and year.
	/**
	 * @param m month
	 * @param d date
	 * @param y year
	 * @return intger do
	 */
	public static int predictDate(int m,int d, int y){



		int y0 = y - (14 - m) / 12;
		int x = y0 + y0/4 - y0/100 +y0/400;
		int m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (d + x + 31 * m0 / 12) % 7;  
		return d0;
	}

	//Program to convert temperature from celcius to fahreient

	/**
	 * @param C temperature in celcius
	 */
	public static void temparature(double C)
	{
		double F= ((C *9/5) + 32) ;
		System.out.println(F);


	}

	//Program to find the monthly payment 

	/**
	 * @param P principle amount
	 * @param R rate of interest
	 * @param Y year
	 */
	public  static void monthlyPayment(int P,double R,int Y) 
	{
		double r=R/(12*100);
		double n=12*Y;

		double c=Math.pow((1+r),-n);
		double payment=((P*r)/1-c);
		System.out.println(payment);
	}

	//Program to find the squareroot

	/**
	 * @param c input number
	 */
	public static void sqrt(double c) {

		double t=c;
		double epsilon= 1.0e-15; 

		while(Math.abs(t - c/t) > epsilon*t ) {
			t=((c/t)+t)/2;
		}
		System.out.println("the square root of c is"+t);


	}
	//Program to convert decimal to binary value
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
	//Program to search the number by using binary search



	/**
	 * @param a array elements
	 * @param key number to be found
	 * @return mid
	 */
	public  static void binarySearch(int lower,int upper,int middle,int count,String input,int n)
	{
		
		System.out.println("Is your number:"+middle);
		System.out.println();
		System.out.println("Enter your answer in 'yes' or 'high' or 'low'");
		input=AlgorithmUtility.StringValue();
		
		do
		{
			if (input.equals("high"))
			{
				lower= middle;
				count++;
			}
			else if (input.equals("yes"))
			{
				System.out.println("The number you thought was: "+middle);
				int no=count+1;
				System.out.println("  times to find your exact number"+no);
				break;
			}
			else if(input.equals("low"))
			{
				upper=middle;
				count++;
			}
			if(count<n)
			{
				middle=(lower+ upper+1)/2;
				System.out.println("Is your number "+middle+":");
				input=AlgorithmUtility.StringValue();
			}
		}
		while(lower<=upper);
		if (count>n)
		{
			System.out.println("Number not found");
		}
		else
		{
			System.exit(0);
		}

}
	//Program to sort the string using insertion sort 

	/**
	 * @param arr input array string
	 * @param n number of input
	 */
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
	//Program to calcualting the number of notes to be returned.

	static int i=0;
	static int total=0;
	static int money;
	public static int calculate(int money,int[]notes)
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
	//Program to sort the intergers by using bubble sort.


	/**
	 * @param array input array
	 */
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

	//Program to swap the nibbles

	/**
	 * @param x decimal input
	 * @return
	 */
	public static int swapNibbles(int x)
	{
		return ((x & 0x0F) << 4 | (x & 0xF0) >> 4); 	

	}

	//Program to sort the string by using merge sort
	/**
	 * @param array input array
	 * @param low  lower index value
	 * @param high  higher index
	 */
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
	//Program to sort the string using bubble sort
	/**
	 * @param array input array string
	 */
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
	//Program to sort the string using binary search
	/**
	 * @param a input array string
	 * @param key key string
	 * @return 
	 */
	public static int binarySearch(String[] array1, String key1) {
		int low = 0;
		int high = array1.length - 1;
		int mid;

		while (low <= high) {
			mid = (low + high) / 2;

			if (array1[mid].compareTo(key1) < 0) {
				low = mid + 1;
			} else if (array1[mid].compareTo(key1) > 0) {
				high = mid - 1;
			} else {
				return mid;
			}
		}

		return -1;
	}



	//Program to sort the array using insertion sort

	/**
	 * @param array3 input array3
	 * @param n number of elements
	 */
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
	//Program to print the pallindrome numbers
	/**
	 * 
	 * 
	 * @param n the integer which to check for pallindrome
	 * @return true if its pallindrome or false if its not
	 */

	public static boolean Pallindrome(int n) {
		int temp = n;
		int sum = 0;
		while (temp != 0) {
			int r = temp % 10;
			sum = sum * 10 + r;
			temp = temp / 10;
		}
		if (sum == n) {
			return true;
		}
		return false;
	}
	/**
	 * to check the values are anagrams or not
	 * 
	 * @param n1 input number1
	 * @param n2 input number2
	 * @return
	 */
	public static boolean anagram(int n1, int n2) {
		int[] n1count = count(n1);
		int[] n2count = count(n2);
		for (int i = 0; i < n2count.length; i++) {
			if (n1count[i] != n2count[i]) {
				return false;
			}
		}
		return true;
	}
	public static void primePallindrome() {
		System.out.println();
		boolean b;
		for (int j = 2; j <= 1000; j++) {
			b = true;
			for (int i = 2; i < j / 2; i++) {
				if (j % i == 0) {
					b = false;
					break;
				}
			}
			if (b && Pallindrome(j))
				System.out.print(j + " ");
		}
	}

	/**
	 * Function to check if no is anagram or not
	 */
	public static void primeAnagrams() {
		ArrayList<Integer> ar = new ArrayList<Integer>();
		System.out.println();
		boolean b;
		for (int i = 2; i <= 1000; i++) {
			b = true;
			for (int j = 2; j < i / 2; j++) {
				if (i % j == 0) {
					b = false;
					break;
				}
			}
			if (b)
				ar.add(i);
		}
		for (int i = 0; i < ar.size(); i++) {
			for (int j = i + 1; j < ar.size(); j++) {
				if (anagram(ar.get(i), ar.get(j))) {
					System.out.println(ar.get(i) );
				}
			}
		}
	}



	/**
	 * Function to count the value in given integer be place
	 * 
	 * @param n the integer value to count
	 * @return the integer array for the count value
	 */
	public static int[] count(int n) {
		int[] count = new int[10];
		int temp = n;
		while (temp != 0) {
			int r = temp % 10;
			count[r]++;
			temp = temp / 10;
		}
		return count;
	}





}

