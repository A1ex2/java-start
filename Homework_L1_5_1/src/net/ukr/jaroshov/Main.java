package net.ukr.jaroshov;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] a = new int[15];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 100);
		}
		System.out.println(Arrays.toString(a));

		System.out.println("Максимальное число " + maxNumber(a));
	}

	static int maxNumber(int[] a) {
		int max = a[0];
		for (int i = 0; i < a.length; i++) {
			if (max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}
}