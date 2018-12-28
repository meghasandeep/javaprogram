/******************************************************************************
 *  Compilation:  javac -d bin SwapNibbles.java
 *  Execution:    java -cp bin com.bridgelabz.util.AlgorithmUtility n
 *  
 *  Purpose: determine the new value by swapping the nibbles
 *
 *  @author  Megha
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************************************************/
package com.bridgelab.algorithmprogram;
import com.bridgelab.util.AlgorithmUtility;
public class SwapNibbles {

	public static void main(String[] args) {
		System.out.println("enter the Value of n");
		int x =AlgorithmUtility.intValue();
	    int flag=0;
	    int c=AlgorithmUtility.swapNibbles(x);
 	   System.out.println(c);
 	  
 	  int[] d=AlgorithmUtility.toBinary(c);
 	  for(int j=7;j>=0;j--)
 	  { 
 		  
 		  System.out.println(d[j]);
 	  }
	
 	 for (int i = 1; i <c; i++) {
         if (Math.pow(2, i)== c) 
             flag=1;
 	 }
         
      if(flag==1)
      {
    	  System.out.println("number is a power of 2");
 	 
 	 }
      else
      { 
    	  System.out.println("number is not a power of 2");
      }
 	 
        
	}

     }
	
    
	    
	


