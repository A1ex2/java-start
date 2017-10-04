package net.ukr.jaroshov;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// System.out.println("¬ведите адрес файла с массивом...");
		// String fileName = sc.nextLine();
		String fileName = "i:\\massiv.txt";
		File file = new File(fileName);

		int[][] array = getArraySize(file);

		System.out.println(array.length);
		System.out.println(array[0].length);
		sc.close();
	}

	public static int[][] getArraySize(File file) {
		int a = 0;
		int b = 0;

		try (Scanner sc = new Scanner(file)) {
			for (; sc.hasNextLine();) {
				String string = sc.nextLine();
				char[] t = string.toCharArray();
				String textTemp = "";
				for (int i = 0; i < t.length; i++) {
					if (t[i] != ' ') {
						textTemp = textTemp + t[i];
					} else {
						textTemp = textTemp + ",";
					}
				}

				int temp = 0;
				String [] t2 = textTemp.split("[,]");

				for (int i = 0; i < t2.length; i++) {
					if (t2[i] != " ") {
						temp++;
					}
				}

				if (b < temp) {
					b = temp;
				}

				// System.out.println(string.length());
				System.out.println(string);
				a++;
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		int[][] array = new int[a][b];
		return array;
	}
}