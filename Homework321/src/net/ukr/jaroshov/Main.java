package net.ukr.jaroshov;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int j = 0;

		System.out.println("¬ведите максимальную высоту");
		int h = sc.nextInt();
		int h2 = h * 2;

		for (; i < (h2 - 1);) {
			if (j >= (h - Math.abs(h - i))) {
				System.out.println();
				i++;
				j = 0;
			}
			System.out.print("*");
			j++;
			sc.close();
		}
	}
}