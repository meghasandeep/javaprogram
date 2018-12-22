package com.bridgelab.util;
import java.util.Arrays;
public class AlgorithmUtility {
	public void Anagram(String str1,String str2)
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

	public void Prime()
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
	public void PalindromePrime()
	{
		int num,r,x=0;
		for(int i=1; i < 1000; i++)
		{

			int flag = 1;

			for(int j=2; j < i ; j++)
			{

				if(i % j == 0){
					flag = 0;
					break;

				}
			}

			if(flag==1)
			{
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



	//////////////////////////////
	public void PredictDate(int D,int M,int Y) {
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
	public void Temparature(double C)
	{
		double F= ((C *9/5) + 32) ;
		System.out.println(F);


	}

	//////////////////////////////////////////////////////
	public void MonthlyPayment(double P,double R,double Y) 
	{
		double r=R/(12*100);
		double n=12*Y;

		double c=Math.pow((1+r),-n);
		double payment=((P*r)/1-c);
		System.out.println(payment);
	}

	///////////////////////////////////////////////
	public void Sqrt(double c) {

		double t=c;
		double epsilon= 1.0e-15; 

		while(Math.abs(t - c/t) > epsilon*t ) {
			t=((c/t)+t)/2;
		}
			System.out.println("the square root of c is"+t);

		
	}






	//////////////////////////////////////////////////
	public void ToBinary(int n) {
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
	public void BinarySearch(int[] a,int key)
	{
		int first=0;
		int last=a.length;		
		int mid=0;


		while(first<=last)
		   {
			mid=(first+last)/2;

			if(a[mid]==key)
			{
				System.out.println(mid);
				
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



public void InsertionSort(int[] a,int n) {
	
	int i=0;
	int key;
	for (i=0;i<n;i++)
	{
		key=a[i];
		int j=i-1;
		while(j>=0 &&(a[j]>key))
		{
			a[j+1]=a[j];
			j--;
	}
	a[j+1]=key;
	for (i=0;i<n;i++) {

	System.out.println(a[j]);

	
	}
}

//public void WordBinary() {
	
}


}










