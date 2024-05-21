import java.util.Scanner;
public class StringMethods2 {
	public static void main(String[] args) {
		String str = "Computer Science";
		System.out.println(str.substring(3,6)); // e is not included 
		System.out.println(str.substring(3)); // Doesn't end
		System.out.println(str.substring(10, 12));
		// indexOf() searches for a specific character or string and returns the location
		System.out.println(str.indexOf('e')); // Locates the first 'e'
		System.out.println(str.indexOf(' '));
		int space = str.indexOf('e');
		System.out.println(str.indexOf('e',space + 1)); // Specifies starting from first e
		System.out.println(str.indexOf("put")); // -1 means 'not found'
		
	}
}
