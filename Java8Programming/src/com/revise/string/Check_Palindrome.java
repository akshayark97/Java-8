package com.revise.string;

import java.util.Scanner;

public class Check_Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String t = "";
		String n = sc.nextLine();
		t += n;
		String t1 = "";
		for (int i = t.length() - 1; i >= 0; i--) {
			t1 += t.charAt(i);
		}
		if (t1.equals(n)) {
			System.out.println(n + " is a palindrome");
		} else {
			System.out.println(n + " is not a palindrome");
		}
	}
}
