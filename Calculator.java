import java.text.DecimalFormat;
import java.util.Scanner;

public class Calculator {
	public void SquareFeet() {
		Scanner scan_length = new Scanner(System.in);
		System.out.println("Please enter the length in feet (in numeric format) to calculate the area in square feet:");
		double length = scan_length.nextDouble();

		Scanner scan_width = new Scanner(System.in);
		System.out.println("Please enter the width in feet (in numeric format) to calculate the area in square feet:");

		double width = scan_width.nextDouble();
		DecimalFormat df = new DecimalFormat("###.##");
		double s_feet = (length * width);
		System.out.println("The area in square feet is:" + df.format(s_feet) + " SQAURE FEET");

	}

	public void SquareMeter() {
		Scanner scan_length = new Scanner(System.in);
		System.out.println("Please enter the length in feet (in numeric format) to calculate the area in square meter:");
		double length = scan_length.nextDouble();

		Scanner scan_width = new Scanner(System.in);
		System.out.println("Please enter the width in feet (in numeric format) to calculate the area in square meter:");
		double width = scan_width.nextDouble();
		DecimalFormat df = new DecimalFormat("###.##");
		double s_feet = length * width;
		double s_meter = (s_feet * 0.09290304);
		System.out.println("The area in square meters is:" + df.format(s_meter) + " SQUARE METER");

	}

}
