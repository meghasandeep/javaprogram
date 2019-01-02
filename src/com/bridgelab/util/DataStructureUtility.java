package com.bridgelab.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DataStructureUtility {
	static Scanner sc = new Scanner(System.in);

	public static int intValue()
	{


		return sc.nextInt();
	}


	public static double doubleValue()
	{
		return sc.nextDouble();
	}


	public static String StringValue()
	{

		return sc.next();
	}
	public static boolean booleanvalue()
	{
		return sc.hasNextBoolean();
	}

    Node head; // head of list
    // Linked list Node.
    // This inner class is made static
    // so that main() can access it
    static class Node {

        String data;
        Node next;

        // Constructor
        Node(String token)
        {
            data = token;
            next = null;
        }
    }
    public static DataStructureUtility insert(DataStructureUtility list, String String)
    {
        // Create a new node with given data
        Node new_node = new Node(String);
        new_node.next = null;
        if (list.head == null) {
            list.head = new_node;
        }
        else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = new_node;
        }
        return list;
    }
    public static void printList(DataStructureUtility list)
    {
        Node currNode = list.head;
        System.out.print("LinkedList: ");
        while (currNode != null)
        {
            if(currNode.data!=null)
                System.out.println(currNode.data + " ");
            currNode = currNode.next;
        }
    }
    public static int delete(DataStructureUtility list,String key)
    {
        int flag=0;
        Node currNode = list.head;        
        while(currNode != null)
        {
            if(currNode.data!=null)
            {
                if((currNode.data).compareToIgnoreCase(key)==0) {
                    currNode.data=null;    
                    System.out.println("entered "+key+" found and deleted");
                    flag=1;        
                }
            }
            currNode = currNode.next;
        }

        return flag;            
    }
    public static void usingFileWriter(DataStructureUtility list,String[] fileContent,String path) throws IOException
    {
        //String[] fileContent = DataStructureUtility.toStrinConv(list);
        FileWriter fileWriter = new FileWriter(path);    
        for(String s:fileContent)
        {
            if(s!=null) {
                fileWriter.write(s);
                fileWriter.write(" ");
            }
        }
        fileWriter.close();
    }
    public static void dispFile( String filename)
    {
        String line = null;
        try
        {
            FileReader fileReader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }
            bufferedReader.close();
        }
        catch(IOException ex)
        {
            System.out.println("Error reading file named '" + filename + "'");
        }
    }
    public static DataStructureUtility readFile(DataStructureUtility list) throws IOException
    {
        System.out.println("Enter the path of the file");
        String txtFile = StringValue();
        String line = "";
        String name[]=new String[100];
        //int size=0;
        try (BufferedReader br = new BufferedReader(new FileReader(txtFile)))
        {
            while ((line = br.readLine()) != null)
            {
                name = line.split(" ");
                for(int i=0;i<name.length;i++){
                    String name1=name[i];
                    insert(list, name1);
                }
            }
        }
		return list;
    }

    public static String[] toStrinConv(DataStructureUtility list)
    {
        Node currNode = list.head;
        int i=0;
        String[] str =new String[1000];
        while (currNode != null) {
            if(currNode.data!=null)
                str[i]=currNode.data ;
            i++;
            currNode = currNode.next;
        }
        return str;
    }
}
