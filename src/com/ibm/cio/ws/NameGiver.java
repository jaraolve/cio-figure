package com.ibm.cio.ws;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Random;

/**
 * @version 1.0
 * 2016/07/16
 */
public class NameGiver 
{
	/**
	 * Name creator
	 * @return the name
	 */
	public String getName()
	{
		LinkedList<String> adjetives= getLines("Files/adjetives");
		LinkedList<String> subjects=getLines("Files/subjects");
		Random r1,r2;
		r1= new Random();
		r2= new Random();
		int index1=r1.nextInt(adjetives.size()-1);
		int index2=r2.nextInt(subjects.size()-1);
		return "The "+adjetives.get(index1)+" "+subjects.get(index2);
	}
	/**
	 * Brings the words of the file 
	 * @param arch
	 * @return words of a file
	 * @throws IOException
	 */
	private LinkedList<String> getLines(String path)
	{
		try
		{
			BufferedReader br = new BufferedReader(new FileReader(path));
			LinkedList<String> toReturn= new LinkedList<String>();
		    String line = br.readLine();
		    while (line != null) 
		    {
		        line = br.readLine();
		        toReturn.add(line);
		    }
		    
		    return toReturn;
		}
		catch(IOException e)
		{
			e.getMessage();
		}
		
		return null;
	}
}
