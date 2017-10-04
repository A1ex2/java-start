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
			System.out.println("Введте номер квартиры...");
			a = sc.nextInt();

			if (a <= total && a > 0) {
				i = true;
				break;
			} else if (a > total) {
				System.out.println("В этом доме только " + total + " квартиры");
			} else if (a < 0) {
				System.out.println("Вы ввели не правильный номер квартиры");
			}
			System.out.println("Если хотите прервать программу, то введите '0', иначе другую цифру");
			int f = sc.nextInt();
			if (f == 0) {
				System.out.println("Программа завершена");
				break;
			}
		}

		int totalApartments = floorHouse * entrance;
		int result;
		a = a - 1;
		result = (a / totalApartments) + 1;
		System.out.println("Подъезд " + result);
		result = ((a % totalApartments) / roomsFloor) + 1;
		System.out.println("Этаж " + result);

		sc.close();
	}
}