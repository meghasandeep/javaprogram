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
	 if ((D< 1 || D > 31)&&(M<1|| M>12) &&(Y < -10000 || Y > 10000)) 
	 {
         System.out.println("Months are between 1 and 12");
         int Y0 = Y - (14 - M) / 12;
         int X = Y0 + Y0/4 - Y0/100 +Y0/400;
         int M0 = M + 12 * ((14 - M) / 12) - 2;
         int D0 = (D + X + 31 * M0 / 12) % 7;  
         
         String day;
       for(int i=0;i<=D0;i++)
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
public void MonthlyPayment(double P,double R,int Y) 
{
	double r=R/(12*100);
	double n=12*Y;
	
	 double c=Math.pow((1+r),-n);
	double payment=((P*r)/1-c);
}
}
