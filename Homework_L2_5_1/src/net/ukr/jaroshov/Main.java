package net.ukr.jaroshov;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите последовательность чисел через ','");
		String t = sc.nextLine();
		String[] text = t.split("[,]");
		sc.close();

		System.out.println("Следующее число " + sequenceString(text));
	}

	static int sequenceString(String[] text) {
		int[] tempArrays = new int[text.length - 1];

		for (int i = 1; i < text.length; i++) {
			tempArrays[i - 1] = (Integer.parseInt(text[i])) - (Integer.parseInt(text[i - 1]));
		}
		int a = findString(tempArrays, Integer.parseInt(text[text.length - 1]));

		return a;
	}

	static int findString(int[] tempArrays, int lastNumber) {
		int a = 0;
		int temp = tempArrays[0];
		boolean arithmetic = false;

		for (int i = 0; i < tempArrays.length; i++) {
			if (temp == tempArrays[i]) {
				arithmetic = true;
			} else {
				arithmetic = false;
				break;
			}
		}

		if (arithmetic) {
			return lastNumber + temp;
		} else {
			for (int i = tempArrays.length - 1; i > 0; i--) {
				if (i == tempArrays.length - 1) {
					a = tempArrays[i] / tempArrays[i - 1];
					continue;
				}

				if (a != tempArrays[i] / tempArrays[i - 1]) {
					return 0;
				}
			}
			return lastNumber * a;
		}
	}
}