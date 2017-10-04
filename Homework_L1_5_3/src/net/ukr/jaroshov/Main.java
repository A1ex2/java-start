package net.ukr.jaroshov;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("—оздание пр€моугольника...");
		System.out.println("¬ведите ширину");
		int a = sc.nextInt();
		System.out.println("¬ведите высоту");
		int b = sc.nextInt();
		sc.close();	
		createRectangle(a, b);
	}

	static void createRectangle(int a, int b) {
		for (int i = 1; i <= b; i++) {
			for (int j = 1; j <= a; j++) {
				if ((i == 1) || (i == b) || (j == 1) || (j == a)) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}