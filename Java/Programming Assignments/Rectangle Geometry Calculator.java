public class Program_01 {
	public static void main(String[] args) {
		// Declarations
		// Because number has decimals, use double
		double height = 7.9;
		double width = 4.5;
		double perimeter = 2*width + 2*height; // 2(4.5) * 2(7.9)
		System.out.println("The perimeter is: " + perimeter);
		
		double area = width * height;
		System.out.println("The area is: " + area);
	}
}
