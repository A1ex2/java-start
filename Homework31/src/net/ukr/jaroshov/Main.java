package net.ukr.jaroshov;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите количество полос");
		int a = sc.nextInt();
				
		for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= a; j++) {
				if ((j % 2) == 0) {
					System.out.print("+++");					
				} else {
					System.out.print("***");
				}
			}
			System.out.println();
		}
		sc.close();
	}
}