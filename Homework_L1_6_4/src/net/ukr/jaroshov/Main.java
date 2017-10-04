package net.ukr.jaroshov;

import java.util.Formatter;

public class Main {

	public static void main(String[] args) {
		double pi = Math.PI;
		//System.out.println(pi);

		for (int i = 0; i < 10; i++) {
			Formatter form = new Formatter();
			form.format("%." + (i + 2) + "f", pi);
			System.out.println(form.toString());
			form.close();
		}
	}
}
