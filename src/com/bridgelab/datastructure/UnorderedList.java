package com.bridgelab.datastructure;

import java.io.IOException;

import com.bridgelab.util.FunctionalUtility;
import com.bridgelab.util.LinkedList;

public class UnorderedList {
	
	
	    static String fileName="/home/admin1/Documents/ds.txt";
	    public static void main(String[] args) throws IOException{
	    
	    	LinkedList List=new LinkedList();
	        List=LinkedList.readFile( List);
	        LinkedList.printList(List);
	        while(true)
	        {
	            System.out.println("please select one option");
	            System.out.println("1.Display list 2.to search element 3.Display modified File  ");
	            int option=FunctionalUtility.intValue();
	            switch(option) {
	            case 1:LinkedList.printList(List);
	            break;
	            case 2:System.out.println("Enter the key element to be searched");
	            String key=FunctionalUtility.StringValue();
	            int k=LinkedList.delete(List,key);
	            System.out.println(k);
	            if(k==0) {
	            	LinkedList.insert(List, key);
	            }
	            String[] fileContent = LinkedList.toStrinConv(List);
	            LinkedList.usingFileWriter(List,fileContent,fileName);
	            break;
	            case 3:    LinkedList.dispFile(fileName);
	            break;
	            default:System.out.println("Please enter an valid option");
	            break;
	            }
	        }
	    }
	}