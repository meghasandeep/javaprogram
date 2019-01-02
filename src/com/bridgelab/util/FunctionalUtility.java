
package com.bridgelab.util;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import com.bridgelab.functionalprogram.*;
/**
 * @author admin1
 *
 * @param <E>
 */
public class FunctionalUtility <E>{
	static Scanner sc = new Scanner(System.in);

	public static int intValue()
	{

		return sc.nextInt();
	}


	public static double doubleValue()
	{

		return sc.nextDouble();
	}


	public static String StringValue()
	{

		return sc.next();

	}
	 public static boolean booleanvalue()
	    {
	    	return sc.nextBoolean();
	    }



	//Program to replace the given string by userdefied string.

	/**
	 * @param str1 input string to replace the given string
	 */
	public static void replaceString( String str1)
	{

		//input string from user
		String S1=FunctionalUtility.StringValue();
		// input string length should be greater than 3
		if(S1.length()>=3)
		{
			// replace the given string by user input string
			String S2 = str1.replace("&&&username&&", S1);
			System.out.println(S2);
		}
		//if input string length is less than 3
		else
		{

			System.out.println("invalid name"); 

		}

	}

	//Program to print the percentage of head and tail when flip the coin.


	/**
	 * @param count number of times flips the coin.
	 */
	public static void flipCoin(int count)
	{
		//initialize head,tail,count.
		double head=0;
		double tail=0;
		int i=count;
		Random result=new Random();
		while(count!=0)
		{
			double r=result.nextDouble();
			//if random number generated is equal to 0.5 increment tail value
			if(r<0.5)

				tail++;

			else

				head++;

			count--;
		      
		}


		System.out.println(head*100/i);
		System.out.println(tail*100/i);
	}

	
	//Program to check whether the entered year is leap or not.

	public static void leapYear(int year)
	{


		//leap year should be divided by both 4 and 400
		if((year%4== 0) &&(year%400 ==0 &&year%100==0))
		{
			System.out.println("year is leap year");

		}

		else
		{
			System.out.println("year is not leap year");
		}
	}
	// Program to find the power of 2.
	/**
	 * @param n number till we want to find the power of 2
	 */
	public static void power(int n)
	{

		int count=0;//
		// entered input should be between 0 to 31
		if(n>=0 && n<31)
		{

			for(int i=0;i<=n;i++)
			{
				System.out.println(Math.pow(2,count));
				count++;

			}


		}
		// if entered input number is more than 31
		else
		{
			System.out.println("out of range");
		}
	}

	//program to find the harmonic sum of the numbers.
	/**
	 * @param n input value till we want to find the harmonic sum
	 */
	public static void harmonic(int n)
	{
		//initialize the i value
		int i=1;
		//result is used to store the result 
		double result=0;
		for(i=1;i<=n;i++)
		{
			//float is used to avoid  typecasting
			result=result+(float)1/i;

		}
		System.out.println(result);
	}
	//Program to find the Prime facttors for the given number

	/**
	 * @param n input number to find the prime factor
	 */

	public static void primeFactor(int n)
	{
		int i=1;int j=2;
		int res = 1;
		for(i=2;i<=n;i++)
		{
			while(n%i==0)
			{
				System.out.println(i);
				n=n/i;
			}
			
		}
			
	}
	//program to find the perecentage of win and loss 



	/**
	 * @param n   number of times
	 * @param stake   present amount
	 * @param goal   goal amount
	 */
	public static void gambler(int n,int stake,int goal)
	{
		//generation of random numbers
		Random result=new Random();
		//int i=1;
		int win=0;
		int loss=0;

		for(int i=0;i<n;i++)
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
	//Program to generate random numbers to get a distinct coupen number.

	/**
	 * @param n input coupen number
	 */
	public static void coupen(int n)
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
				int c=distinct;
				coup[content]=true;
			}
		}

		System.out.println("num of count"+count);

	}
	//Program to find the triplet sum is zero or not

	/**
	 * @param arr input array elements
	 * @param n number of input
	 */
	public static void triplet(int[] arr,int n)
	{

		//boolean flag =false;
		int count=0;
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(arr[i]+arr[j]+arr[k]==0)
					{
						System.out.print(arr[i]+" "+arr[j]+" "+arr[k]);
						count++;
						System.out.println();

					}

				}

			}

		}
		System.out.println("total distinct triplets present in the given array is "+count);

		
	}
	//Program to display the 2D array elements

	/**
	 * @param garray generic array
	 * @param m number of rows
	 * @param n numbner of columns
	 */
	public   void displayArray(E[][]garray,int m,int n)
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


	// Program to find the distance between origin and the given point.

	/**
	 * @param x  x axis distance from origin
	 * @param y  y axis distance from origin
	 */
	public static void distance(int x,int y)
	{


		double result;
		result=Math.sqrt(x*x+y*y);
		System.out.println("result is"+result);

	}



	//Program to find the quadratic roots

	/**
	 * @param a input value of a
	 * @param b input value of b
	 * @param c input value of c
	 */
	public static void quadratic(double a,double b,double c) {

		double d=Math.sqrt(b*b-4*a*c);
		double root1=(-b+(d)/(2*a*b));
		double root2=(-b-(d)/(2*a*b));
		System.out.println(root1);
		System.out.println(root2);



	}


	//Program to find the elapsed time between the start time and end time


	static long starttime,endtime;

	/**
	 * @return printing the started time
	 */
	public static long start()
	{
		starttime= System.currentTimeMillis();

		return(starttime);
	}
	/**
	 * @return printing the end time
	 */

	public static long end()
	{
		endtime= System.currentTimeMillis();
		return(endtime);
	}
	/**
	 * @return elapsed time between start and end time
	 */
	public static long elapse() {

		long elaspedtime= endtime-  starttime ;
		return(elaspedtime);
	}
	//Program to find the effective temperature

	/**
	 * @param t temperature value given by user
	 * @param v velocity value given by user
	 */
	public static void windChill(double t,double v)
	{
		double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
		System.out.println("The value of W is   " +w);

	}

	// Utility function to swap two characters in a character array
	private static void swap(char[] ip, int i, int j) {
		{
			char temp = ip[i];
			ip[i] = ip[j];
			ip[j] = temp;
		}
	}
	// Recursive function to generate the permutations of a String
	public static List<String> recursion(String str, int initial, int last,List<String> arr) {

		if (initial == last) {
		   arr.add(str);
		} else {
		   for (int i = initial; i < last; i++) {
		       str = swap(str, initial, i);
		       recursion(str, (initial + 1), last,arr);
		   }
		}
		return arr;
		}

		/**
		* static method is used to swap the string alphabets
		* @param str string value
		* @param i index of string
		* @param j index of string
		* @return String
		*/
		public static String swap(String str, int i, int j) {
		char temp;
		char[] ch = str.toCharArray();
		temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		return String.valueOf(ch);

		}

		/**
		* static method is used to possible iterations we can do it for a string
		* @param s is the string value
		* @return arr array of string
		*/
		public static List<String> iteration(String str) {
		List<String> arr = new ArrayList<>();
		arr.add(String.valueOf(str.charAt(0)));
		for (int i = 1; i < str.length(); i++) {
		   for (int j = arr.size() - 1; j >= 0; j--) {
		       String s = arr.remove(j);
		       for (int k = 0; k <= s.length(); k++) {
		           arr.add(s.substring(0, k) + str.charAt(i) + s.substring(k));
		       }
		   }
		}
		return arr;
		}

		/**
		* static method is used to sort the array list
		* @param arr is arraylist
		* @return arraylist
		*/
		public static List<String> listSort(List<String> arr)
		{
		Collections.sort(arr);
		return arr;
		}

		/**
		* static method is used to compare 2 array list
		* @param arr1 array list1
		* @param arr2 array list2
		* @return integer value
		*/
		@SuppressWarnings("unused")
		public static int comparision(List<String> arr1,List<String> arr2)
		{
		for(int i=0;i<arr1.size();i++)
		{
		   if(arr1.get(i).compareTo(arr2.get(i))==0)
		   {
		       return 1;
		   }
		   else
		       return 0;
		}
		return 0;
		}
		

	//Program to play Tic TAC Toe

	static int player = 0;
	static int[][] BOARD = new int[3][3];
	static boolean isEmpty = true;

	public static void initBoard() {
		System.out.println("TIC TAC TOE GAME\nComputer is o\nPlayer  is x ");
		for (int i = 0; i < BOARD.length; i++) {
			for (int j = 0; j < BOARD[i].length; j++) {
				BOARD[i][j] = -10;
			}
		}
		System.out.println("Board is this :");
		dispBoard();
	}

	public static void dispBoard() {
		int count = 0;
		for (int i = 0; i < BOARD.length; i++) {
			System.out.println("---------------");
			System.out.print("||");
			for (int j = 0; j < BOARD[i].length; j++) {
				if (BOARD[i][j] == 0) {
					count++;
					System.out.print(" o |");
				} else if (BOARD[i][j] == 1) {
					count++;
					System.out.print(" x |");
				} else
					System.out.print("   |");
			}
			System.out.println("|");
		}
		if (count == 9) {
			isEmpty = false;
		}
		System.out.println("---------------");
	}
	/*
	 * static void putVal(int i, int j, int player) { if if (player % 2 == 0) {
	 * BOARD[i][j] = 0; } else BOARD[i][j] = 1; }
	 */

	public static void putVal() {
		int i;
		int j;
		if (player % 2 == 1) {
			i = (int) (Math.random() * 10) % 3;
			j = (int) (Math.random() * 10) % 3;
		} else {
			Scanner s = new Scanner(System.in);
			System.out.println("enter value of x and y by space");
			i = s.nextInt();
			j = s.nextInt();
		}
		if (BOARD[i][j] == -10) {
			if (player % 2 == 0) {
				BOARD[i][j] = 0;
			} else {
				BOARD[i][j] = 1;
				System.out.println("Coumputer Choosing " + i + " " + j);
			}
		} else
			putVal();

	}

	public static boolean win() {
		return ((BOARD[0][0] + BOARD[0][1] + BOARD[0][2] == player * 3)
				|| (BOARD[1][0] + BOARD[1][1] + BOARD[1][2] == player * 3)
				|| (BOARD[2][0] + BOARD[2][1] + BOARD[2][2] == player * 3)
				|| (BOARD[0][0] + BOARD[1][0] + BOARD[2][0] == player * 3)
				|| (BOARD[0][1] + BOARD[1][1] + BOARD[2][1] == player * 3)
				|| (BOARD[0][2] + BOARD[1][2] + BOARD[2][2] == player * 3)
				|| (BOARD[0][0] + BOARD[1][1] + BOARD[2][2] == player * 3)
				|| (BOARD[2][0] + BOARD[1][1] + BOARD[0][2] == player * 3));
	}

	public static void play() {
		initBoard();
		while (isEmpty) {
			System.out.println("Players turn");
			putVal();
			dispBoard();
			if (win()) {
				System.out.println("Player won");
				return;
			}
			player = 1;
			System.out.println("Computers turn");
			putVal();
			dispBoard();
			if (win()) {
				System.out.println("Computer won");
				return;
			}
			player = 0;
		}
		

	}


}












































