package com.java8.LambdaExcercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Unit1ExcerciseUsingCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> people = Arrays.asList(
         new Person("Charles", "Dickens", 60),
         new Person("Lewis", "Carrol", 42),
         new Person("Thomas", "Carlyle", 51),
         new Person("Charlatte", "Brante", 45),
         new Person("Mathew", "Arnold", 39)
         );
//		step1: Sort list by last name
        Collections.sort(people, new Comparator<Person>(){

			@Override
			public int compare(Person o1, Person o2) {
				// TODO Auto-generated method stub
				return o1.getLastname().compareTo(o2.getLastname());
			}
        	
        	
        });
		
//		step2: create a method that prints all element in the list
        System.out.println("Print all person");
		printAll(people);

//		step3: create a method that prints all the people that have last name beginning with C
		System.out.println("Printing last name starts with C");
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {
				// TODO Auto-generated method stub
				return p.getLastname().startsWith("C");
			}
			
		});
		
		System.out.println("Print all person first name starts with C");
		printConditionally(people, new Condition() {

			@Override
			public boolean test(Person p) {
				// TODO Auto-generated method stub
				return p.getFirstname().startsWith("C");
			}
			
		});
	}
	
	private static void printConditionally(List<Person> people, Condition condition) {
		// TODO Auto-generated method stub
		System.out.println("Last name starts with C");
		for(Person p: people)
		{
			if(condition.test(p))
			{
				
				System.out.println(p);
			}
		}
		
	}

	private static void printAll(List<Person> people) {
		// TODO Auto-generated method stub
		for(Person p: people)
		{
			System.out.println(p);
		}
	}

}

interface Condition{
	boolean test(Person p);
}

