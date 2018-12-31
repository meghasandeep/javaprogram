/******************************************************************************
 *  Compilation:  javac -d bin PredictDate.java
 *  Execution:    java -cp bin com.bridgelabz.util.AlgorithmUtility n
 *  
 *  Purpose: Finding a day of the week
 *
 *  @author  Megha
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************************************************/
package com.bridgelab.algorithmprogram;
import com.bridgelab.util.AlgorithmUtility;

public class PredictDate {

	public static void main(String[] args) {
		
			int m =Integer.parseInt(args[0]);
			if (m < 1 || m > 12) 
			{
				System.out.println("Months are between 1 and 12");
			}

			int d = Integer.parseInt(args[0]);
			if (d < 1 || d > 31) 
			{
				System.out.println("Days are between 1 and 31");
				
			}

			int y = Integer.parseInt(args[0]);
			if (y < -10000 || y > 10000) 
			{
				System.out.println("Years are between -10000 and 10000");
				
			}
		
			int f= AlgorithmUtility.predictDate(m,d,y);
			String[] day= {"Sunday","Monday","Tuesday","Wednesday","Thursday","friday","saturday"};
		
			System.out.println("day is " +day[f]);
		}

	}












