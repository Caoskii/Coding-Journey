import java.util.Scanner;
public class JavaBasics {
	public static void main(String[] args) {
		// Declaration
		double length = 8.5;
		double width = 6.4;
		double perimeter = length*2 + width*2;
		System.out.println("The perimeter is: " + perimeter);
		double area = length * width;
		System.out.println("The area is: " + area);
		char letter = 'A';
		System.out.println(letter);
		boolean pass = true; // true or false
		String name = "John Doe"; 
		System.out.println (name);
		// Final means it can never be changed
		final double TAX_RATE = 0.08;
		System.out.println(TAX_RATE);
		
		// Declaration
		// Operations with Variables
		int x = 5;
		int y = 6;
		int z = (6 + 5) * 3 - 18 / 3; // Follow the order of operations (PEMDAS)
		// 6 + 15 - 6
		System.out.println(z);
		int a = 34%10; // Modulus or Mod or Remainder
		System.out.println(a);
		int b = 9%4 + 12/4 - 3*5; // 1 + 3 - 15
		System.out.println(b);
		double c = 5.0/2.0; // Change to double because its a decimal number
		System.out.println(c);
		
		x++; // Add one to x
		x+= 1; // Add one to x
		x = x + 1;
		System.out.println(x);
		
		y = y+2;
		System.out.println(y);
		y+=5;
		System.out.println(y);
		
		int w = 10;
		w--; // Subtract one from w
		w-=3; 
		System.out.println(w);
		
		int p = 2;
		p*=3; // Multiply p by 2 and save it in p variable
		System.out.println(p);
		p = p * 4;
		System.out.println(p);
		
		int s = 64;
		s = s / 2;
		System.out.println(s);
		s/=4;
		System.out.println(s);
		int d = 7;
		System.out.println(d++); // Postincrement / (++d) Preincrement
		
		System.out.println(d);
		int g = (int)4.5;
		System.out.println(g); // Casting
		int radius = 5;
		// Area of the circle is Pi R ^2
		double areaTriangle = Math.pow(radius, 2) * 3.14; // Math.pow = Math Power (Base , Exponent)
		
		// Scanner and Importing
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name: "); // Start with String not Integer
		String names = scan.nextLine();
		System.out.println("Enter the first number: ");
		int num1 = scan.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = scan.nextInt();
		int sum = num1 + num2;
		System.out.println("The sum of these two numbers is: " + sum);
		System.out.println("Thank you " + names);
	}
}
