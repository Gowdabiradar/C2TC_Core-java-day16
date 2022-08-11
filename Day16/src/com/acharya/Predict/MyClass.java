package com.acharya.Predict;
import java.util.*;

public class MyClass {

	public static void main(String[] args) {
		MyClass ob = new MyClass();
		try
		{
			ob.meth1();
		}
		catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException throw by meth1() method is caugh in main()method");
		}
		
		// TODO Auto-generated method stub

	}
	void meth1() {
		// TODO Auto-generated method stub
		
	}
	public void metth()
	{
		try
		{
			System.out.println(100/0);
		}
		catch(NullPointerException nullExp)
		{
			System.out.println("We have an Exception-"+nullExp);
		}
		System.out.println("Outside try-catch block");
	}
}