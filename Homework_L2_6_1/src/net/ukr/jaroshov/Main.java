package net.ukr.jaroshov;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");

		System.out.println("������� ���� � ������� ��.��.����...");
		String dateString = sc.nextLine();

		try {
			date = sdf.parse(dateString);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		Calendar clEnt = Calendar.getInstance();
		clEnt.setTime(date);

		Calendar cl = Calendar.getInstance();
		
		if (cl.get(Calendar.DATE) != clEnt.get(Calendar.DATE)) {
			System.out.println("���� " + clEnt.get(Calendar.DATE) + " �� ����� ������� " + cl.get(Calendar.DATE));
		}
		if (cl.get(Calendar.MONTH) != clEnt.get(Calendar.MONTH)) {
			System.out.println("����� " + (clEnt.get(Calendar.MONTH) + 1)+" �� ����� �������� " + cl.get(Calendar.MONTH));
		}
		if (cl.get(Calendar.YEAR) != clEnt.get(Calendar.YEAR)) {
			System.out.println("��� " + clEnt.get(Calendar.YEAR) + " �� ����� �������� " + cl.get(Calendar.YEAR));
		}

		sc.close();		
	}
}
