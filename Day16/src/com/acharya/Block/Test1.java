package com.acharya.Block;

public class Test1 {

public static void validate(int age) {

if(age<21 || age>27)

throw new ArithmeticException("not eligible");

else

System.out.println("Eligible to attend Military Selection ");

}

public static void main(String args[]) {

try {

validate(30);

}

catch(ArithmeticException e)

{

System.out.println(e);

}

System.out.println("rest of the code..."); 

}

}