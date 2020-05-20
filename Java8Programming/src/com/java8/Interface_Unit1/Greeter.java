package com.java8.Interface_Unit1;

public class Greeter {

	public void greet(Greeting greet) {
		greet.perform();
	}

	public static void main(String[] args) {
		Greeter g = new Greeter();
		HelloWorldGreeting hw = new HelloWorldGreeting();
		//g.greet(hw);

		Greeting myLambdaFunction = () -> System.out.println("Hello Programmer");
		//To print using lambda expression
		myLambdaFunction.perform();
		//Anonymous inner class
		Greeting greet = new Greeting() {
			public void perform() {
				System.out.println("Hello I'm using Anonymous inner class");
			}
		};
		greet.perform();
        //Alternate way to print
		g.greet(myLambdaFunction);
		g.greet(greet);
	}

}


interface myLambda {
	void foo();
}