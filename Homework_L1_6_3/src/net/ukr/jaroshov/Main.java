package net.ukr.jaroshov;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите число в бинарном формате...");
		String number = sc.nextLine();
		System.out.println(decimalSystem(number));
		sc.close();
	}

	public static int decimalSystem(String number) {
		int decimal = 0;
		int degree = 0;
		for (int i = number.length() - 1; i >= 0; i--) {
			int a = (int) Math.pow(2, degree);
			decimal += (number.charAt(i) == '1' ? 1 : 0) * a;
			degree++;
		}
		return decimal;
	}
}
