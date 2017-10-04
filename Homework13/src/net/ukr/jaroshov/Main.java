package net.ukr.jaroshov;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r;
		double l;
		System.out.println("Input radius");
		r = sc.nextDouble();
		l = 2 * Math.PI * r;
		System.out.println(l);
		sc.close();
	}
}
