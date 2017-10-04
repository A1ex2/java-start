package net.ukr.jaroshov;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] arrays = newArrays();
		System.out.print(Arrays.toString(arrays));
		System.out.print(" -> ");
		mirrorArrays(arrays);
		System.out.print(Arrays.toString(arrays));
	}

	static int[] newArrays() {
		Scanner sc = new Scanner(System.in);
		// int[] a = new int[9];
		System.out.println("¬ведите размер массива...");
		int[] a = new int[sc.nextInt()];
		sc.close();
		for (int i = 0; i < a.length; i++) {
			a[i] = (int) (Math.random() * 10);
		}
		return a;
	}

	static int[] mirrorArrays(int[] arrays) {
		int temp;
		int x = arrays.length - 1;
		for (int i = 0; i < arrays.length / 2; i++) {
			temp = arrays[i];
			arrays[i] = arrays[x];
			arrays[x] = temp;
			x--;
		}
		return arrays;
	}
}