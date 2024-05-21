import java.util.*;

public class Program_02 {
	
	
	// The method that takes 4 coordinates and returns the slope (x1, y1) & (x2, y2)
	public static double slope(double x1, double y1, double x2, double y2) { // Returns the slope
		double s = (y2 - y1)/(x2 - x1);
		return s;
		
	}
	
	// The method that takes 4 coordinates and calculates the distance
	public static double distance(double x1s, double y1s, double x2s, double y2s) {
		double d = Math.pow((x2s - x1s), 2) + Math.pow((y2s - y1s), 2);
		return d;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Displays slope message
		System.out.println("Enter x1: ");
		double x1 = scan.nextDouble();
		System.out.println("Enter y1: ");
		double y1 = scan.nextDouble();
		System.out.println("Enter x2: ");
		double x2 = scan.nextDouble();
		System.out.println("Enter y2: ");
		double y2 = scan.nextDouble();
		
		// Calculates the total slope using the formula
		
		System.out.println("The slope is: " + slope(x1, y1, x2, y2));
		
		System.out.println();
		System.out.println("Enter x1: ");
		double x1s = scan.nextDouble();
		System.out.println("Enter y1: ");
		double y1s = scan.nextDouble();
		System.out.println("Enter x2: ");
		double x2s = scan.nextDouble();
		System.out.println("Enter y2: ");
		double y2s = scan.nextDouble();
		
		// Calculates the distance using the formula
		
		System.out.println("The distance is: " + distance(x1s, y1s, x2s, y2s));
		
		
	}

}
