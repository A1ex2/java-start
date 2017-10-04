package net.ukr.jaroshov;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Enter 5 numeral");
		x = sc.nextInt();
		System.out.println(x / 10000);
		System.out.println(x % 10000 / 1000);
		System.out.println(x % 1000 / 100);
		System.out.println(x % 100 / 10);
		System.out.println(x % 10);
		sc.close();
	}

}
