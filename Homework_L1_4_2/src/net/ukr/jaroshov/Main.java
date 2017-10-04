package net.ukr.jaroshov;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("—оздание массива...");
		System.out.println("¬ведите размер массива");
		int length = sc.nextInt();
		int[] a = new int[length];
		for (int i = 0; i < a.length; i++) {
			System.out.println("¬ведите значение элемента массива " + i);
			a[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(a));
		sc.close();
	}
}