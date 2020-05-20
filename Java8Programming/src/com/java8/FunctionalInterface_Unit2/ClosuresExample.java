package com.java8.FunctionalInterface_Unit2;

public class ClosuresExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		int b = 20;
//Without using lambda function
//		doProcess(a, new Process() {
//
//			@Override
//			public void process(int i) {
//				// TODO Auto-generated method stub
//				System.out.println(i + b);
//			}
//
//		});
//	}
		
//-------------------- Using Lambda Expression-----------------

     doProcess(a, i -> System.out.println(i + b));
	}
	
	private static void doProcess(int i, Process p) {
		// TODO Auto-generated method stub

		p.process(i);
		
	}

}

interface Process {
	void process(int i);
}
