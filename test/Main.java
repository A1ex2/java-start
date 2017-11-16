package net.ukr.jaroshov;

public class Main {

	public static void main(String[] args) {
		
		Car m1 = new Car();
		m1.setName("m1");
		m1.setColor("red");
		System.out.println(m1);		
		
		Car m2 = new Car();
		m2.setName("m2");
		m2.setColor("black");
		System.out.println(m2);
		
		Car.color = "green";
		
		System.out.println();
		System.out.println("стало из-за 'static' - 'color' в 'Car'");
		System.out.println(m1);
		System.out.println(m2);	
	}
}
