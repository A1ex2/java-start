package net.ukr.jaroshov;

public class Main {

	public static void main(String[] args) {
		int a = 1;
		String b = "������������";
		double c = 1.2;

		System.out.println(concatenation(a, b, c));
	}

	static String concatenation(int a, String b, Double c) {
		return "������ '" + b + "' ������ '" + a + "' � ������������� '" + c + "' ����� � ������";
	}
}