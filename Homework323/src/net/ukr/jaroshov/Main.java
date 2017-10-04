package net.ukr.jaroshov;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("¬ведите ширину");
		a = sc.nextInt();

		for (int i = 1; i <= a; i++) {
			for (int j = 1; j <= a; j++) {
				if (i >= j & i >= (a + 1) - j || (i <= j & i <= (a + 1) - j)) {
					System.out.print("*");

				} else {
					System.out.print(" ");
				}
				if (j % a == 0) {
					System.out.println("");
				}
			}
		}
		sc.close();
	}
}