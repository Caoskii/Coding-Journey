import java.util.*;

public class Program_01 {
	
	// The method that returns the perimeter given a length and width
	public static int getPerimeter(int len, int width) {
		int p = 2*len+2*width;
		return p;
	}
	
	// The method that returns the area given a length and width formula area = len * width
	public static int getArea(int len2, int width2) {
		int area = len2 * width2;
		return area;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
				// 1st Method for finding perimeter
				System.out.println("Enter the length:");
				int len = scan.nextInt();
				System.out.println("Enter the width:");
				int width = scan.nextInt();
				System.out.println("The perimeter is: " + getPerimeter(len, width));
				
				// 2nd Method for finding area
				
				System.out.println();
				System.out.println("Enter the length:");
				int len2 = scan.nextInt();
				System.out.println("Enter the width:");
				int width2 = scan.nextInt();
				System.out.println("The area is: " + getArea(len, width));
	}
}
