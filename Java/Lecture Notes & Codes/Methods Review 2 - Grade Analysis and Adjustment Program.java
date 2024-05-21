import java.util.Arrays;
public class MethodsReview {

	public static void main(String[] args) {
		// One way of declaring Arrays
		
	/* 	int [] grades = new int[6]; 
		grades[0] = 80;
		grades[4] = 90;
		grades[grades.length-1] = 100;
	*/
		
		String [] names = {"John", "Steve", "Bob", "Jack", "Maria", "Kevin"};
		
		// Second way of declaring Arrays
		
		int [] grades = {50, 90, 100, 90, 85, 92};
		
		System.out.println(Arrays.toString(grades)); // Shows all of the grades
		System.out.println(grades[grades.length-1]); // Last grade of the Array
		System.out.println(grades.length); // Total of grades
		
		int sum = 0;
		int count = 0;
	
		for(int i = 0; i < grades.length; i++) { // If add '=' sign, make sure to put grades.length-1
			if (grades[i] !=0) {
				sum+=grades[i];
				count++;
			}
			
		}
		System.out.println ("The sum is: " + sum); // Adds all the grades
		System.out.println ("The average grade is: " + sum/count); // Finds the average.
		
		int lowest = grades[0];
		for (int i = 0; i < grades.length; i++) {
			if(grades[i] < lowest) // Highest = 100, Lowest = 50. Switch signs '<' , '>'
				lowest = grades[i];
		}
		System.out.println("The lowest grade is: " + lowest);
		
		int failing = 0;
		 for (int i = 0; i < grades.length; i++) {
			 if(grades[i] < 70)
				 failing++;
		 }
		 System.out.println("The number of failing grades is: " + failing);
		 
		 for(int i = grades.length-1; i >= 0; i--) { // Going backwards
			 System.out.println(grades[i] + " ");
		 }
		 int index = -1;
		 int highest = grades[0];
		 for (int i = 0; i < grades.length; i++) {
			 if(grades[i] > highest) {
				 index = i;
				 highest = grades[i];
			 }
			 System.out.print("The student with the highest grade is: " + names[index]); // Output would be 'Bob'
		 }
		 System.out.println();
		 // Another loop is called 'Enhanced loop' or 'for each loop'
		 for(int gr:grades) {
			 System.out.print(gr+" ");
		 }
		 double total = 0;
		 for(int g:grades) {
			 total += g; // Every single grade
		 }
		 System.out.println("The total is: " + total/count); // Gives average
		 int greatest = 0;
		 for(int i = 0; i < grades.length; i++) {
			 if(grades[i] < 70)
				 grades[i] = 70;
		 }
		 System.out.println(Arrays.toString(grades));
		 
	}

}
