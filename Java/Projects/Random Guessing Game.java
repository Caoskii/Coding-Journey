import java.util.*;
public class Assignment_01_Sample {
	public static void main(String[] args) {
	// Generate a random number made of two digits
	// Any number between 10 - 99
	// Range - highest - low + 1
	Scanner scan = new Scanner(System.in);
	int comp = (int)(Math.random() * 90) + 10;
	System.out.println("Enter a two-digit number: ");
	int user = scan.nextInt();
	int leftComp = comp/10;
	int rightComp = comp%10;
	int rightUser = user/10;
	int leftUser = user%10;
	if(user == comp) {
		System.out.println("You earned $10,000" + comp);
	}
	else if (rightComp == leftUser && leftComp == rightUser) {
		System.out.println("You earned $3,000" + comp);
	}
	else if (leftComp == leftUser && rightComp != rightUser || rightComp == rightUser && leftComp != leftUser) {
		System.out.println("You earned $100" + comp);
	}	
	}
}
