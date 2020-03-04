import java.util.Scanner;

public class Calculator {
	public void SquareFeet() {
		Scanner scan_length = new Scanner(System.in);
		System.out.println("Please enter the length of the room in feet to calculate the area in square feet:");
		double length = scan_length.nextDouble();

		Scanner scan_width = new Scanner(System.in);
		System.out.println("Please enter the width of the room in feet to calculate the area in square feet:");

		double width = scan_width.nextDouble();
		double s_feet = length * width;
		System.out.println("The area in square feet is:" + s_feet + "SQAURE FEET");

	}

	public void SquareMeter() {
		Scanner scan_length = new Scanner(System.in);
		System.out.println("Please enter the length of the room in feet to calculate the area in square meter:");
		double length = scan_length.nextDouble();

		Scanner scan_width = new Scanner(System.in);
		System.out.println("Please enter the width of the room in feet to calculate the area in square meter:");
		double width = scan_width.nextDouble();

		double s_feet = length * width;
		double s_meter = s_feet * 0.09290304;
		System.out.println("The area in square feet is:" + s_meter + "SQUARE METER");

	}

}
