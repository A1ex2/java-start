package net.ukr.jaroshov;

public class Main {

	public static void main(String[] args) {
		int[] a = { 0, 5, 2, 4, 7, 1, 3, 19 };
		int j = 0;
		for (int i : a) {
			if ((i % 2) != 0) {
				j++;
			}
		}
		System.out.println("Количество нечетный цифр " + j);
	}
}