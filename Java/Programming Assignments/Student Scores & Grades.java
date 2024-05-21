import java.util.*;
public class Program_01 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	
	int [] scores = {40, 55, 70, 58}; // Assigned to store all scores
	int [] students = {1, 2, 3, 4}; // Assigned to store how many students
	char [] grades = {'A', 'B', 'C', 'D', 'F'}; // Assigned to store grades
	
	System.out.println("Enter the number of students: ");
	int numStudents = scan.nextInt();
	
	System.out.println("Enter " + numStudents + " scores: ");
	for (int i = 0; i < numStudents; i++) {
		scores[i] = scan.nextInt();
	}
	int highest = scores[0];
	int index = -1; // Saves index
	for (int i = 0; i < scores.length; i++) {
		if(grades[i]>highest) {
			index = i;
			highest = scores[i];
		}
			
	}
	System.out.println("The highest score is: " + highest); // Displays the highest score
	System.out.println("The student with the highest score is: " + "Student " + students[index]); // Displays which student has the highest score
	
	// Used if & else if statement
	
	System.out.println();
	for (int i = 0; i < numStudents; i++ ) {
		char grade;
		if (scores[i] >= highest - 10) {
			grade = 'A';
		} else if (scores[i] >= highest - 20) {
			grade = 'B';
		} else if (scores[i] >= highest - 30) {
			grade = 'C';
		} else if (scores[i] >= highest - 40) {
			grade = 'D';
		} else {
			grade = 'F';
		}
			System.out.println("Student " + i + " score is " + scores[i] + " and grade is " + grade);
	}
	
	}
}
