package net.ukr.jaroshov;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int c;
		int d;		
		int max;
		
		System.out.println("Input a");
		a = sc.nextInt();
		System.out.println("Input b");
		b = sc.nextInt();
		System.out.println("Input c");
		c = sc.nextInt();
		System.out.println("Input d");
		d = sc.nextInt();
		
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		if (max < c) {
			max = c;
		}
		if (max < d) {
				max = d;
		}
		System.out.println("Max = " + max);
		sc.close();
	}
}
