package net.ukr.jaroshov;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите строку...");
		String text = sc.nextLine();
		int i = 0;
		int j = 0;
		String find = "b";
		for (; i >= 0;) {
			i = text.indexOf(find);
			if (i >= 0) {
				text = text.substring(i + 1);
				j++;
			}
		}
		System.out.println("Количество символов " + find + " - " + j);
		sc.close();
	}
}