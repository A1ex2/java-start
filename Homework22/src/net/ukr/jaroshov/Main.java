package net.ukr.jaroshov;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int floorHouse;
		floorHouse = 9;
		int entrance;
		entrance = 4;
		int roomsFloor;
		roomsFloor = 4;
		int total;
		total = floorHouse * entrance * roomsFloor;
		int a;
		a = 0;

		boolean i = false;
		for (; i = true;) {
			System.out.println("������ ����� ��������...");
			a = sc.nextInt();

			if (a <= total && a > 0) {
				i = true;
				break;
			} else if (a > total) {
				System.out.println("� ���� ���� ������ " + total + " ��������");
			} else if (a < 0) {
				System.out.println("�� ����� �� ���������� ����� ��������");
			}
			System.out.println("���� ������ �������� ���������, �� ������� '0', ����� ������ �����");
			int f = sc.nextInt();
			if (f == 0) {
				System.out.println("��������� ���������");
				break;
			}
		}

		int totalApartments = floorHouse * entrance;
		int result;
		a = a - 1;
		result = (a / totalApartments) + 1;
		System.out.println("������� " + result);
		result = ((a % totalApartments) / roomsFloor) + 1;
		System.out.println("���� " + result);

		sc.close();
	}
}