/******************************************************************************
 *  Compilation:  javac -d bin TwoDArray.java
 *  Execution:    java -cp bin com.bridgelabz.util.TwoDArray n
 *  
 *  Purpose: printing the T
 *
 *  @author  Megha
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************************************************/
package com.bridgelab.functionalprogram;
import com.bridgelab.util.*;

public class TwoDArray {
	public static void main(String[] args)
	{
		
		FunctionalUtility f1=new FunctionalUtility();
		System.out.println("enter the number of rows:");
          int m=FunctionalUtility.intValue();	
          System.out.println("enter the number of column:");
          int n=FunctionalUtility.intValue();	
          System.out.println("1:Integer  2:Double  3:Boolean" );
          int flag=FunctionalUtility.intValue();
          switch(flag)
          {
          case 1:Integer[][] array=new Integer[m][n];
          for(int i=0;i<m;i++)
          {
        	  for(int j=0;j<n;j++)
        	  {
        		  array[i][j]=FunctionalUtility.intValue();
        	  }
          }
        		f1.displayArray(array,m,n);
        		break;
        		  
        		  
          case 2:Double[][] darray=new Double[m][n];
          for(int i=0;i<m;i++)
          {
        	  for(int j=0;j<n;j++){
        		  darray[i][j]=FunctionalUtility.doubleValue();
        	  }
          }
        		f1.displayArray(darray,m,n);
        		break;
        		
          case 3:Boolean[][] barray=new Boolean[m][n];
          for(int i=0;i<m;i++)
              {
        	  for(int j=0;j<n;j++)
        	  {
        		  barray[i][j]=FunctionalUtility.win();
              }
        		f1.displayArray(barray,m,n);
        		break;
              }
        		default: System.out.println("Select among the choice");
        		break;
              }
          //FunctionalUtility.close();
	   }
}

 		    
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
        		  
          
          

