package com.revise.string;

import java.util.Scanner;

public class Reverse_A_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String temp = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			temp += str.charAt(i);
		}
		System.out.println(temp);
		System.out.println("This is the string I need to traverse");
	}
}
