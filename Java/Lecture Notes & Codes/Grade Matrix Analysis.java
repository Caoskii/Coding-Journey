import java.util.*;
public class MatrixReview {

	public static void main(String[] args) {
		int [][] grades = {{70, 89, 100, 50, 74, 82},
						   {65, 90, 45, 87, 70, 80},
						   {98, 35, 86, 72, 90, 100}};
		// Display the number of rows or arrays
		System.out.println(grades.length);
		
		// Display the number of columns
		System.out.println(grades[0].length);
		System.out.println(Arrays.toString(grades[0]));
		
		// Display the matrix or 2D array
		for (int r = 0; r < grades.length; r++) {
			for (int c = 0; c < grades[0].length; c++) {
				System.out.print(grades[r][c] + " "); // Leaves space " "
			}
			System.out.println();
		}
		
		// Display the matrix by printing the individual arrays
		for (int r = 0; r < grades.length; r++) {
			System.out.println(Arrays.toString(grades[r]));
		}
		
		// Display the grade average for all classes combined
		double sum = 0;
		double count = 0;
		for (int r = 0; r < grades.length; r++) {
			for (int c = 0; c < grades[0].length; c++) {
				sum += grades[r][c];
				count++;
			}
		}
		System.out.println("The average grade is: " + sum/count);
		
		// Display the highest grade
		int highest = 0;
		for (int r = 0; r < grades.length; r++) {
			for (int c = 0; c < grades[0].length; c++) {
				if (grades[r][c] > highest)
					highest = grades[r][c];
			}
		}
		System.out.println("The highest grade is: " + highest);
		
		// Find the number of failing students
		int failing = 0;
		for (int r = 0; r < grades.length; r++) {
			for (int c = 0; c < grades[0].length; c++) {
				if (grades[r][c] < 70)
					failing++;
			}
		}
		System.out.println("The number of failing students is: " + failing);
		
		// Display the average grade for each class
		double total = 0;
		int ct = 0;
		for (int r = 0; r < grades.length; r++) {
			for (int c = 0; c < grades[0].length; c++) {
				total += grades[r][c];
				ct++; // How many students total
			}
			System.out.println("The average grade for this class: " +total/ct);
			// Start on 2nd Row
			total = 0;
			ct = 0;
			
		}
		
		// Calculate the sum by column (up and down) (start by switching the loop) 
		int t = 0;
		for (int c = 0; c < grades[0].length; c++) {
			for (int r = 0; r < grades.length; r++) {
				t += grades[r][c];
			}
			System.out.println("The sum of this column is: " + t);
			t = 0;
		}
	}

}
