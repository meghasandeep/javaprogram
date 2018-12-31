     /******************************************************************************
	 *  Compilation:  javac -d bin BinarySearchWord.java
	 *  Execution:    java -cp bin com.bridgelabz.util.AlgorithmUtility n
	 *  
	 *  Purpose: Program to search a string present in the word file
	 *
	 *  @author  Megha
	 *  @version 1.0
	 *  @since   22-12-2018
	 *
	 ******************************************************************************/
	package com.bridgelab.algorithmprogram;
    import com.bridgelab.util.AlgorithmUtility;

	import java.io.BufferedReader;
	import java.io.FileNotFoundException;
	import java.io.FileReader;
	


	public class BinarySearchWord {
	    public static void main(String[] args) throws FileNotFoundException {
	       
	        String csvFile = "/home/admin1/Documents/name.csv";
	      
	        BufferedReader fileReader = new BufferedReader(new FileReader(csvFile));

	        final String DELIMITER = ",";
	        try {
	            String line = " ";
	            while ((line = fileReader.readLine()) != null) {
	                String[] tokens = line.split(DELIMITER);
	       
	                for (String token : tokens) {
	                    // Print all tokens
	                    System.out.println(token);
	                }
	                System.out.println("enter the key word which has to be searched ");
	                String key =AlgorithmUtility.StringValue(); 
	                int i = AlgorithmUtility.binarySearch(tokens, key);
	                if (i >= 0) {
	                    System.out.println(tokens[i] + " is present in " + (i + 1) + " position in the array");
	                } else
	                    System.out.println(key + " doesnot exists in the given csv file");
	            }
	        } 
	        catch (Exception e) {
	           System.out.println("File not found");
	        } finally {
	            try {
	                fileReader.close();
	            } catch (Exception e) {
	                e.addSuppressed(e);
	            }
	        }
	    }

}
