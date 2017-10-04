package net.ukr.jaroshov;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] a = { 1, 5, 9, 8, 7, 10 };

		System.out.println(MyArraysToString(a));

		System.out.println(Arrays.toString(a));
	}

	public static String MyArraysToString(int[] a) {
		String text = "[";
		for (int i : a) {
			text += i + ", ";
		}
		text = text.substring(0, text.length() - 2);
		return text + "]";
	}
}
