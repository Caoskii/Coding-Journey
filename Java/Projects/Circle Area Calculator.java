import java.util.Scanner;

public class ComputeArea {
	public static void main(String[] args) {
		// Steps 1: Read in radius
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a radius");
		double radius = input.nextDouble();
		double area;
		
		// Step 2: Compute area
		area = radius * radius * 3.1415;
		
		// Step 3: Display the area
		System.out.println("The area is " + area);
	}
}
