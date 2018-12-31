/******************************************************************************
 *  Compilation:  javac -d bin VendingMachine.java
 *  Execution:    java -cp bin com.bridgelabz.util.AlgorithmUtility n
 *  
 *  Purpose: printing the number of notes return from machine
 *
 *  @author  Megha
 *  @version 1.0
 *  @since   24-12-2018
 *
 ******************************************************************************/
package com.bridgelab.algorithmprogram;
import com.bridgelab.util.AlgorithmUtility;

public class VendingMachine {

	public static void main(String[] args) {
		System.out.println("enter the money in Rs");
        int money=AlgorithmUtility.intValue();
        int[] notes = {1000,500,100,50,10,5,2,1};
        System.out.println("the different notes present is");
        AlgorithmUtility.calculate(money, notes);


    }

}

