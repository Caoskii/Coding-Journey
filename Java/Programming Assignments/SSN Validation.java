import java.util.Scanner;
public class Program_02 {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your social security number: ");
		String ssn = scan.nextLine();
		if(ssn.length() == 11)
		{
			if(ssn.charAt(3) == '-' && ssn.charAt(6) == '-') {
				System.out.println("Thank you, the social security number you entered is valid");
			}
			else {
				System.out.println("Sorry, the social security number you entered is invalid");
			}	
		}
		else {
			System.out.println("Please enter a valid social security number");
		}
		
	}
}
