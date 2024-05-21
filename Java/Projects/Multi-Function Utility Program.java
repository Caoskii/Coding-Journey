import java.util.Scanner;
public class Project_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1 - Ask a user for their age and determine whether the user was born in an odd or an even year.");
		System.out.println("2 - Calculate the rtax based on user's input for an item's price and tax rate.");
		System.out.println("3 - Convert Celsius to Fahrenheit.");
		System.out.println("4 - Quit the program.");
		System.out.println("Enter your choice (1-4): ");
		int choice = scan.nextInt();
		if (choice == 1)
		{
			scan.nextLine();
			System.out.println("Enter your name: ");
			String name = scan.nextLine();
			System.out.println("Enter your age: ");
			int age = scan.nextInt();
			int yearBorn = 2024 - age;
			
			// Printed results
			System.out.println("The year you were born is: " + yearBorn);
			if (yearBorn%2 == 0)
				System.out.println("The year is even.");
			else
				System.out.println("The year is odd.");
		}
		else if (choice == 2)
		{
			scan.nextLine();
			System.out.println("Enter your name: ");
			String name = scan.nextLine();
			System.out.println("Enter the price: ");
			double price = scan.nextDouble();
			System.out.println("Enter the tax rate: ");
			double taxRate = scan.nextDouble(); // Tax rate in percentage
			double taxAmount = price * (taxRate / 100); // Calculate the total price including tax
			double totalPrice = price + taxAmount;
			
			// Printed results
			System.out.println("Name : " + name); 
			System.out.println("Tax amount: " + taxAmount); 
			
			System.out.println("Total price (including tax): " + (int)totalPrice); // Added total price including tax
		}
		else if (choice == 3)
		{
			scan.nextLine();
			System.out.println("Enter your name: ");
			String name = scan.nextLine();
			System.out.println("Enter the degree (In Celsius): ");
			double celsius = scan.nextDouble();
			
			double fahrenheiht = (9.0 / 5.0) * celsius + 32; // Using given formula to convert Celsius to Fahrenheit
			
			//Printed results
			System.out.println("Name: " + name);
			System.out.println("Temperature in Fahrenheight is: " + fahrenheiht);
		}
		else if (choice == 4)
		{
			// Printed results
			System.out.println("This is the end of the program");
		}
		else
		{
			// Printed results
			System.out.println("Invalid entry! Please try again.");
		}
	}

}
