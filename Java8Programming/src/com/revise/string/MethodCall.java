package com.revise.string;

public class MethodCall {

	public void greet(Greeting greet)
	{
		greet.perform();
	}
	
	public static void main(String[] args) {
	   MethodCall mc = new MethodCall();
	   Greet g = new Greet();
	   mc.greet(g);
	   
	}
}
