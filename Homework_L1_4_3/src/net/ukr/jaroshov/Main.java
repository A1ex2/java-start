package net.ukr.jaroshov;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] a = new int[15];
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 10);
		}
		System.out.println(Arrays.toString(a));
		int[] b = Arrays.copyOf(a, a.length * 2);
		int j = 0;
		for (int i = a.length; i < b.length; i++) {
			b[i] = a[j] * 2;
			j++;
		}
		System.out.println(Arrays.toString(b));
	}
}