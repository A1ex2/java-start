package net.ukr.jaroshov;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите подряд одинаковые числа...");
		String textNumber = sc.nextLine();

		String temp = "";

		for (int i = 0; i < textNumber.length()-1; i++) {
			int lengthTemp = temp.length();
			if (textNumber.length() < lengthTemp * 2) {
				System.out.println("Не правильно задан порядок чисел.");
				break;
			}
			
			if (lengthTemp != 0) {
				String a = textNumber.substring(lengthTemp, lengthTemp * 2);				
				if (temp.equals(a)) {
					break;					
				}
			}
			temp = temp + textNumber.charAt(i);					
		}
		
		System.out.println("Минимальное число " + temp);
		sc.close();
	}
}