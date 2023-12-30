package Application;

import java.util.Scanner;

import Entities.Rectangle;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //memory alloc of object sc
		
		Rectangle rect = new Rectangle(); //memory alloc of object rect
		
		System.out.println("Enter rectangle width and height:");
		rect.width = sc.nextDouble();   //prompting width and height
		rect.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rect.area());
		System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
		sc.close();
		}
	}


