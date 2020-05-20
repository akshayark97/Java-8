package com.java8.Unit3;

public class MethodReferenceExample1 {

	public static void main(String[] args) {
		
		Thread t = new Thread(MethodReferenceExample1::printMessage); //() -> method(); Instead using MethodReferenceExample1::printMessage === () -> printMessage()
		t.start();
	}
	
	public static void printMessage() {
		System.out.println("Hello");
	}
}
