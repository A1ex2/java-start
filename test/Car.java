package net.ukr.jaroshov;

public class Car {
	private String name;
	public static String color;
	
	public Car(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}

	public Car() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + "]";
	}
}
