package net.ukr.jaroshov;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		double a = 23.5;
//		double b = 35.8;
//		double c = 50.1;
		System.out.println("¬ведите сторону 'a'");
		double a = sc.nextDouble();
		System.out.println("¬ведите сторону 'b'");
		double b = sc.nextDouble();
		System.out.println("¬ведите сторону 'c'");
		double c = sc.nextDouble();
		
		if ((a + b > c) && (a + c > b) && (b + c > a)) {
			System.out.println("“реугольник существует");
		} else {
			System.out.println("“реугольник не существует");
		}
		sc.close();
	}
}