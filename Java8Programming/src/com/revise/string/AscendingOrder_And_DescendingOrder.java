package com.revise.string;

import java.util.Scanner;

public class AscendingOrder_And_DescendingOrder {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = sc.nextLine();
		String t = "";
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			t += arr[i];
		}
		System.out.println(t+" is now ascending");
	}
}
