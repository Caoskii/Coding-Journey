import java.util.Scanner;
public class Program_01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Generates a random number made of two digits between 10 - 99\
		// Range = high - low + 1
		int lotteryPick = (int)(Math.random() * 90) + 10;
		System.out.println("Enter the lottery pick (two digits): ");
		int guess = scan.nextInt();
		
		// Inserts a newline for the input
		scan.nextLine();
		
		// For the lottery pick
		int leftPick = lotteryPick/10; // Gets integer part of number
		int rightPick = lotteryPick%10; // Gets the remainder 
		
		// User's guess
		int rightGuess = guess/10;
		int leftGuess = guess%10;
		
		if (guess == lotteryPick) {
			System.out.println("You earned $10,000, The lottery number is: " + lotteryPick);
		}
		else if (rightGuess == leftPick && leftGuess == rightPick) {
			System.out.println("You earned $3,000, The lottery number is: " + lotteryPick);
		}
		// 4 Possibilities in this else if statement
		else if (rightGuess == leftPick && leftGuess != rightPick || leftGuess == leftPick && rightGuess != rightPick || rightGuess != leftPick && leftGuess != rightPick || rightPick != rightGuess && leftPick != leftGuess) {
			System.out.println("You earned $100, The lottery number is: " + lotteryPick);
		}
	}
}
