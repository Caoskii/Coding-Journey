import java.util.*;
public class Program_01 {
	// Method that takes a 2D array and returns true if it is positive markov
	public static boolean isMarkov(double [][] mat) {
		for(int r = 0; r < mat.length; r++)
		{
			double sum = 0;
			for(int c = 0; c < mat[r].length; c++)
			{
				if(mat[r][c] < 0)
					return false; // Exit loop automatically
				sum += mat[r][c];
			}
			if (sum != 1)
				return false;
		}
		
		// If passes all test, returns true
		return true;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Creates a 3x3 matrix
		double [][] mat = new double[3][3];
		
		// Prompts user to enter a 3x3 matrix row by row
		System.out.println("Enter a 3-by-3 matrix row by row:");
		for (int r = 0; r < 3; r++)
		{
			for (int c = 0; c < 3; c++)
			{
				mat[r][c] = scan.nextDouble();
			}
		}
		if (isMarkov(mat))
		{
			System.out.println("It is a Markov matrix.");
		}
		else {
			System.out.println("It is not a Markov matrix.");
		}
	}
		
}
