import java.util.Scanner;
public class Loops {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number (> 2) ");
		int num = scan.nextInt();
		boolean prime = true;
		for (int i = 2; i < num; i++)
		{
			if (num%i==0)
				prime = false;
		}
		if (prime == true)
			System.out.println("It is a prime number");
		else
			System.out.println("It is not a prime number");
			// 11 2 3 4 5 6 7 8 9 10
	}

}
