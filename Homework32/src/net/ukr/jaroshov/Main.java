package net.ukr.jaroshov;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� �����, � ��������� �� 5 �� 15");
		int a = sc.nextInt();
		long f = 1;
		if ((a >= 5) && (a <= 15)) {
			for (int i = 1; i <= a; i++) {
				f = f * i;
			}
			System.out.println("��������� " + f);
		} else {
			System.out.println("��������� ����� �� ������������� �������!");
		}
		sc.close();	
	}
}