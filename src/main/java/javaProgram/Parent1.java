package javaProgram;

import io.cucumber.core.internal.com.fasterxml.jackson.databind.util.JSONPObject;

public class Parent1 {
	public static void main(String[] args)
	{
		System.out.println("I navigated to the home page");
		Parent2 obj=new Parent2();
		obj.main(args);
		
	}

}
