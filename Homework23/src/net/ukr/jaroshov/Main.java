package net.ukr.jaroshov;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year;
		System.out.println("¬ведите год");
		year = sc.nextInt();

		if (year % 4 == 0) {
			if ((year % 100 == 0) && (year % 400 != 0)) {
				System.out.println("365");
			} else {
				System.out.println("366");
			}
		} else {
			System.out.println("365");
		}

		sc.close();
	}
}