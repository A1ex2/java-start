package net.ukr.jaroshov;

public class Main {

	public static void main(String[] args) {
		double a = 23.5;
		double b = 35.8;
		double c = 50.1;
		double p = (a + b + c) / 2;
		double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));

		System.out.println(s);
	}

}
