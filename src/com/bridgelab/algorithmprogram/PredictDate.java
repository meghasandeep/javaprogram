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
		while(true) {
			System.out.println("Enter The Month");
			int m =AlgorithmUtility.intValue();
			if (m < 1 || m > 12) {
				System.out.println("Months are between 1 and 12");
				break;
			}

			System.out.println("Enter The Day");
			int d = AlgorithmUtility.intValue();
			if (d < 1 || d > 31) {
				System.out.println("Days are between 1 and 31");
				break;
			}

			System.out.println("Enter The Year");
			int y = AlgorithmUtility.intValue();
			if (y < -10000 || y > 10000) {
				System.out.println("Years are between -10000 and 10000");
				break;
			}
			int d0 = AlgorithmUtility.predictDate(m,d,y);

			switch(d0){
			case 0:
				System.out.println("The day of the week is Sunday");
				break;
			case 1:	
				System.out.println("The day of the week is Monday");
				break;
			case 2:
				System.out.println("The day of the week is Tuesday");
				break;
			case 3:
				System.out.println("The day of the week is Wednesday");
				break;
			case 4:
				System.out.println("The day of the week is Thursday");
				break;
			case 5:
				System.out.println("The day of the week is Friday");
				break;
			case 6:
				System.out.println("The day of the week is Saturday");
				break;
			default:
				System.out.println("Invalid input");
			}
			break;
		}
		
	}


	
}






