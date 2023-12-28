package Entities;

public class Rectangle {
	//atributos
	public double width;
	public double height;
	//métodos
	public double area() {
	return width * height;
	}
	public double perimeter() {
	return 2 * (width + height);
	}
	public double diagonal() {
	return Math.sqrt(width * width + height * height);
	}
}