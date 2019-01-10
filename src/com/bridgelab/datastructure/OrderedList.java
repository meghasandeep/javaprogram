package com.bridgelab.datastructure;


import java.io.IOException;

import com.bridgelab.util.FunctionalUtility;
import com.bridgelab.util.LinkedList;



public class OrderedList {
	    static String sortFile="/home/admin1/Documents/input.txt";
	    static String fName="/home/admin1/Documents/ds.txt";
	    public static void main(String[] args) throws IOException
	    {
	    	LinkedList List=new LinkedList();

	        List=LinkedList.readFile(List);
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
	            int key=FunctionalUtility.intValue();
	            String key1=String.valueOf(key);
	            int k=LinkedList.delete(List, key1);
	            System.out.println(k);
	            if(k==0) {
	            	LinkedList.insert(List, key1);
	            }
	           // System.out.println("your here");

	            int[] fileContent = LinkedList.toIntConv(List); 
	            String[] fileContent1 = LinkedList.toStrinConv(List);
	            int[] arr=LinkedList.stringSort(fileContent);
	            String[] sarray=new String[arr.length];
	            int[] arry = LinkedList.toIntConv(List);
	            for(int i=0;i<arr.length;i++) {
	                if(arr[i]!=0) 
	                {
	                     sarray[i]=String.valueOf(arr[i]);
	                    i++;
	                }
	            }
	            LinkedList.usingFileWriter(List,sarray,sortFile);
	          //  LinkedList.writeIntFile(fName,arr);
	            break;
	            
	            case 3:    LinkedList.dispFile(sortFile);
	            break;
	            default:System.out.println("Please enter an valid option");
	            break;
	            }
	        }
	    }

	}
