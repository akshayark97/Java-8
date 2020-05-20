package com.java8.LambdaExcercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Unit1ExcerciseUsingJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person> people = Arrays.asList(new Person("Charles", "Dickens", 60), new Person("Lewis", "Carrol", 42),
				new Person("Thomas", "Carlyle", 51), new Person("Charlatte", "Brante", 45),
				new Person("Mathew", "Arnold", 39));
//		step1: Sort list by last name
		Collections.sort(people, (p1, p2) -> p1.getLastname().compareTo(p2.getLastname()));

//		step2: create a method that prints all element in the list
		System.out.println("Print all person");
		printConditionally(people, p -> true);

//		step3: create a method that prints all the people that have last name beginning with C
		System.out.println("Printing last name starts with C");
		printConditionally(people, p -> p.getLastname().startsWith("C"));

		System.out.println("Print all person first name starts with C");
		printConditionally(people, p -> p.getFirstname().startsWith("C"));
	}

	private static void printConditionally(List<Person> people, Condition condition) {
		// TODO Auto-generated method stub
		System.out.println("Last name starts with C");
		for (Person p : people) {
			if (condition.test(p)) {

				System.out.println(p);
			}
		}

	}

}
