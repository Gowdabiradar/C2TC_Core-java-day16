package com.acharya.Handling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

class MyClasss {

	public void checkFileNotFound()
{
		try {
			FileInputStream in = new FileInputStream("input.txt");
			System.out.println("This is not printed");
		}
		catch (Exception fileNotFoundException)
		{
			System.out.println(fileNotFoundException+"file not found exception");
			// TODO Auto-generated method stub
		}

	}
	public static void main(String[] arrs)
	{
		MyClasss example =new MyClasss();
		example.checkFileNotFound();
	}
	
		
	}


