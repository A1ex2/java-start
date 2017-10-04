package net.ukr.jaroshov;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите 'x'");
		double x = sc.nextDouble();
		System.out.println("Введите 'y'");
		double y = sc.nextDouble();
		double c;
		c = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		double r = 4;		
		if (c > r) {
			System.out.println("Точка не лежит внутри круга!");
		} else {
			System.out.println("Точка лежит внутри круга!");
		}
		sc.close();
	}
}