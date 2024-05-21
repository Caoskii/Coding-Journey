import java.util.*;
public class Program_01 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your income: ");
		int num1 = scan.nextInt();
		System.out.println("Enter your tax rate %: ");
		double taxRate = scan.nextDouble() / 100; //Because tax rate is a decimal value
		System.out.println("Choose your operation: ");
		int operation = scan.nextInt();
		
		{
		if (operation == 1) {
			System.out.println("Your tax is: " + (int)(num1 + taxRate)); // Set INT so that output is not a decimal and is rounded
		}
		else if (operation == 2) {
			System.out.println("Your tax is: " + (int)(num1 - taxRate));
		}
		else if (operation == 3) {
			System.out.println("Your tax is: " + (int)(num1 * taxRate));
		}
		else if (operation == 4) {
			System.out.println("Your tax is: " + ((double)num1 / taxRate));
		}
		else
			System.out.println("Invalid They Took All Your Money!");
		}
	}
}
