package com.bridgelab.functionalprogram;
import com.bridgelab.util.*;

import java.util.Scanner;
public class TwoDArray {
	public static void main(String[] args)
	{
		Scanner S=new Scanner(System.in);
		
		FunctionalUtility f1=new FunctionalUtility();
		System.out.println("enter the number of rows:");
          int m=S.nextInt();	
          System.out.println("enter the number of column:");
          int n=S.nextInt();	
          System.out.println("1:Integer  2:Double  3:Boolean" );
          int flag=S.nextInt();
          switch(flag)
          {
          case 1:Integer[][] array=new Integer[m][n];
          for(int i=0;i<m;i++)
          {
        	  for(int j=0;j<n;j++)
        	  {
        		  array[i][j]=S.nextInt();
        	  }
          }
        		f1.displayarray(array,m,n);
        		break;
        		  
        		  
          case 2:Double[][] darray=new Double[m][n];
          for(int i=0;i<m;i++)
          {
        	  for(int j=0;j<n;j++){
        		  darray[i][j]=S.nextDouble();
        	  }
          }
        		f1.displayarray(darray,m,n);
        		break;
        		
          case 3:Boolean[][] barray=new Boolean[m][n];
          for(int i=0;i<m;i++)
              {
        	  for(int j=0;j<n;j++)
        	  {
        		  barray[i][j]=S.nextBoolean();
        	  }
              }
        		f1.displayarray(barray,m,n);
        		break;
        		default: System.out.println("Select among the choice");
        		break;
              }
          S.close();
	   }
     
}
 		    
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
          
          

