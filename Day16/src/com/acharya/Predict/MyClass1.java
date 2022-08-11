package com.acharya.Predict;
import java.util.*;
public class MyClass1 {

	public static void main(String[] args) {
		MyClass ob = new MyClass();
		try
		{
			ob.meth1();
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmaticException throw by meth() method is caught in main()method");
		}

	}
	public void meth1()
	{
		try
		{
			System.out.println(100/0);
		}
		catch(Exception nullExp)
		{
			System.out.println("we have an Exception-"+nullExp);
			{
				
			}
		}
	}

}
