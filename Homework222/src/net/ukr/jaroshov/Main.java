package net.ukr.jaroshov;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double aX = 0;
		double aY = 0;
		double bX = 4;
		double bY = 4;
		double cX = 6;
		double cY = 1;

		System.out.println("Введите 'x'");
		double xX = sc.nextDouble();
		System.out.println("Введите 'y'");
		double xY = sc.nextDouble();

		double sABC = Math.abs(((((aX - cX) * (bY - cY)) - ((bX - cX) * (aY - cY))) / 2));
		double sABX = Math.abs(((((aX - xX) * (bY - xY)) - ((bX - xX) * (aY - xY))) / 2));
		double sAXC = Math.abs(((((aX - cX) * (xY - cY)) - ((xX - cX) * (aY - cY))) / 2));
		double sXBC = Math.abs(((((xX - cX) * (bY - cY)) - ((bX - cX) * (xY - cY))) / 2));
				
		if (sABC == sABX + sAXC + sXBC) {
			System.out.println("Точка в треугольнике");
		} else {
			System.out.println("Точка не в треугольнике");
		}
		sc.close();
	}
}