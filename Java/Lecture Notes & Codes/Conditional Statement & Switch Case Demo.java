import java.util.*;
public class ConditionalStatements {
	public static void main(String[] args) {
		/* This program shows how if statements work
		 * Statements work and different
		 * Types of nested if statements */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your final grade: ");
		int grade = scan.nextInt();
		if(grade >= 70) // Do not put ; after if. Only when statement is finished
		{
			System.out.println("Congratulations!! You Passed.");
			System.out.println("I am proud of you!!");
			if (grade >=90)
			{
				System.out.println("You got a free HW pass.");
			}
			else {
				System.out.println("You got a cookie");
			}
		}
		else
		{
			System.out.println("Sorry!! You Failed.");
			if(grade < 50)
			{
				System.out.println("Your parents will be notified.");
			}
			else
			{
				System.out.println("You may need help");
			}
		}
		
		
		
		
		
		{
			System.out.println("Enter your final grade letter: ");
			String letterGrade = scan.nextLine();
			if(letterGrade.equals("A")) // When comparing two strings equals
			{
				System.out.println("Excellent!! You got A.");
			}
			else if(letterGrade.equals("B") || letterGrade.equals("B"))
			{
				System.out.println("Good job!! You got B.");
			}
			else if(letterGrade.equals("C"))
			{
				System.out.println("You are doing OK!! you got B.");
			}
			else if(letterGrade.equals("C"))
			{
				System.out.println("You are doing OK!! You got C.");
			}
			else {
				System.out.println("Sorry! You got F. Try again.");
			}
		}
	}
}

{
	System.out.println("Enter the first number: ");
	int num1 = scan.nextInt();
	System.out.println("Enter the second number: ");
	int num2 = scan.nextInt();
	System.out.println("choose your operation: ");
	int operation = scan.nextInt();
	System.out.println("1-addition");
	System.out.println("2-subtraction");
	System.out.println("3-multiplication");
	System.out.println("4-division");
	switch(operation)
	{
	case 1: System.out.println("The sum is: " + (num1 + num2)); break;
	case 2: System.out.println("The difference is: " + (num1 - num2)); break;
	case 3: System.out.println("The product is: " + (num1 * num2)); break;
	case 4: System.out.println("The quotient is: " + ((double)num1 / num2));
	default: System.out.println("Invalid Entry. Try again!");
	}
}
