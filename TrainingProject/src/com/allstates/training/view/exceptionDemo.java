package com.allstates.training.view;

 
import java.io.*;


public class exceptionDemo {
public static void main(String args[])
{
	
	try
	{
		FileInputStream fis=new FileInputStream("allstates.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		FileOutputStream fos=new FileOutputStream("allstatesnew.txt");
				int i;
		while((i=bis.read())!=-1)
				{
			fos.write(i);
			System.out.print((char)i);

		}
		bis.close();
		fis.close();
		fos.close();
	}catch(IOException e)
	{
		
		System.out.println(e.getMessage());
	}
	
	
}
	
}
