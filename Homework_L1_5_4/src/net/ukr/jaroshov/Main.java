package net.ukr.jaroshov;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите число поиска");
		int number = sc.nextInt();
		sc.close();
		int[] a = new int[100];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);
		}
		System.out.println(findNumber(a, number));
	}

	static int findNumber(int[] a, int number) {
		int index = -1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == number) {
				index = i;
				break;
			}
		}
		return index;
	}
}