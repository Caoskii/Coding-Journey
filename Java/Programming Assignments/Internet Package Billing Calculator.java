import java.util.*;
public class Program_02 {
	public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the letter of the package: ");
	String packageType = scan.next();
	
	System.out.println("Enter the number of hours used: ");
	int hoursUsed = scan.nextInt();
	double monthlyBill = 0.0; 
	
	switch(packageType)
	{
	case "A":
		monthlyBill = 9.95; 
		if(hoursUsed > 10) {
			monthlyBill += (hoursUsed - 10) * 2;
		}
		break;
	case "B":
		monthlyBill = 13.95;
			if(hoursUsed > 20) {
				monthlyBill += (hoursUsed - 20);
			}
			break;
	case "C":
		monthlyBill = 19.95;
		break;
	default:
		System.out.println("Invalid Package Bro");
	}
	System.out.println("Your monthly bill is: $" + (double)monthlyBill);
	}
}
