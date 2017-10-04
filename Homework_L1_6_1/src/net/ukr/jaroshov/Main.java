package net.ukr.jaroshov;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Calendar cl = Calendar.getInstance();
		Calendar clLast = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH.mm.ss");
		clLast.set(Calendar.MONTH, cl.get(Calendar.MONTH) - 1);

		Date date = cl.getTime();
		Date date2 = clLast.getTime();

		System.out.println("Дата сегодня: " + sdf.format(date));
		System.out.println("Дата в прошлом месяце: " + sdf.format(date2));
		
		System.out.println("Разница в милисекундах по календарю " + (cl.getTimeInMillis() - clLast.getTimeInMillis()));
		System.out.println("Разница в милисекундах по датам календаря " + (date.getTime() - date2.getTime()));
		System.out.println();
	}
}
