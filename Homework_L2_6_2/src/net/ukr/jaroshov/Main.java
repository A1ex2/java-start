package net.ukr.jaroshov;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите первое число...");
		int number1 = sc.nextInt();
		System.out.println("Введите второе число...");
		int number2 = sc.nextInt();
		String binary1 = binarySystem(number1);
		String binary2 = binarySystem(number2);
//		System.out.println(binary1);
//		System.out.println(binary2);
		distance(binary1, binary2);
		sc.close();
	}

	public static String binarySystem(int a) {
		String text = "";
		for (;;) {
			text = "" + (a % 2) + text;
			a = a / 2;
			if (a <= 0) {
				break;
			}
		}
		return text;
	}

	public static void distance(String a, String b) {
		int max = (a.length() > b.length() ? a.length() : b.length()) - 1;
		int dis = 0;
		String a2 = String.format("%" + (max + 1) + "s", a);
		String b2 = String.format("%" + (max + 1) + "s", b);

		for (int i = max; i >= 0; i--) {
			char charA = a2.charAt(i) == ' ' ? '0' : a2.charAt(i);
			char charB = b2.charAt(i) == ' ' ? '0' : b2.charAt(i);

			if (charA != charB) {
				dis += 1;
			}
		}
		System.out.println("Растояние Хэмминга между числами: " + dis);
	}
}
