import java.util.*;
public class ArrayPractice {

	public static void main(String[] args) {
		double [] salesAmount = new double[7]; // Declaration
		System.out.println(Arrays.toString(salesAmount));
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < salesAmount.length; i++) {
			System.out.println("Please enter the sales amount: ");
			salesAmount[i] = scan.nextDouble();
		}
		System.out.println(Arrays.toString(salesAmount));
		// Find the highest and lowest sales amount
		double highest = salesAmount[0];
		double lowest = salesAmount[0];
		for (int i = 0; i < salesAmount.length; i++) {
			if (salesAmount[i] > highest)
				highest = salesAmount[i];
			if (salesAmount[i] < lowest)
				lowest = salesAmount[i];
		}
		System.out.println("The highest sales amount is :" + highest);
		System.out.println("The lowest sales amount is : "+ lowest);
		// Find the average sales amount
		double sum = 0;
		for (double sa:salesAmount) {
			sum += sa; 
		}
		System.out.println("The average sales amount is :" + sum/salesAmount.length);
		// Example for Program Assignment 7
		
		for (int i = 0; i < salesAmount.length; i++) {
			if(salesAmount[i] > highest - 10)
				salesAmount[i] = salesAmount[i]*1.1;
			else if (salesAmount[i] > highest - 20)
				salesAmount[i] = salesAmount[i]*1.05;
		}
	}
	
}
