import java.util.Scanner;
public class Program_01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// range = high - low + 1
		
		int rand = (int)(Math.random() * 101); // 100 - 0 + 1. Generates a random number from 0 to 100
		System.out.println("Guess a magic number between 0 and 100: ");
		
		int guess = scan.nextInt();
		int count = 1;
		while (rand != guess)
		{
			if (guess > rand)
			{
				System.out.println("Your guess is too high");
			}
			else if (guess < rand)
			{
				System.out.println("Your guess is too low");
			}
			count++; // Increment count for each guess
			guess = scan.nextInt();
		}
		System.out.println("Yes, you got it!! The number is " + rand + ".");
		System.out.println("It took you " + count + " attempts to find the right number.");
	}

}
