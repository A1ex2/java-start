package net.ukr.jaroshov;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� 'x'");
		double x = sc.nextDouble();
		System.out.println("������� 'y'");
		double y = sc.nextDouble();
		double c;
		c = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		double r = 4;		
		if (c > r) {
			System.out.println("����� �� ����� ������ �����!");
		} else {
			System.out.println("����� ����� ������ �����!");
		}
		sc.close();
	}
}