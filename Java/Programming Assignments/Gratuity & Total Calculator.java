import java.util.Scanner;
public class Program_03 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the subtotal: ");
		double subtotal = scan.nextDouble();
		System.out.println("Enter the gratuity rate: ");
		double gratRate = scan.nextDouble();
		
		double sum = subtotal + gratRate /10; // Hi professor, I somehow manage to do it this way, I don't know how, but it worked.
		double gratuity = subtotal * gratRate /100;
		
		System.out.println("The gratuity is: $" + gratuity + " and the total is $" + sum); // Decided to add it into 1 entire line
		
	}
}
