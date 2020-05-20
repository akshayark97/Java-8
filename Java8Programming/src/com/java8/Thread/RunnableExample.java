package com.java8.Thread;

public class RunnableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//      Without using lambda
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("THis is the simple thread programme");
			}
			
			
		});
		thread.run();
		
//		Thread using lambda
		Thread myLambda = new Thread(() -> System.out.println("This is the thread using lambda"));
		myLambda.run(); 	
	}


}
