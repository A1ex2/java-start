package net.ukr.jaroshov;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите строку");
		String text = sc.nextLine();
		sc.close();
		System.out.println(numberWords(text));
	}

	static int numberWords(String text) {
		String[] t = text.split("[ ,.]");
		int number = 0;
		for (String string : t) {
			if (string.length() != 0) {
				number++;
			}
		}
		return number;
	}
}