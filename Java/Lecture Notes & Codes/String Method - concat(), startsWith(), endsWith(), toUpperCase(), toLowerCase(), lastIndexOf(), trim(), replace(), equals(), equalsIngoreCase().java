import java.util.Scanner;
public class StringMethods3 {
	public static void main(String[] args) {
		String str = "Computer Science";
		String str1 = "Computer";
		String str2 = "Science";
		String str3 = "computer";
		//	concat() concatenates two strings
		System.out.println(str1 + " " + str2);
		System.out.println(str1.concat(str2)); // concat() method
		// startsWith and endsWith using true or false
		System.out.println(str.startsWith("com")); // Case sensitive (false)
		System.out.println(str.endsWith("Science")); // True
		// toUpperCase() and toLowerCase()
		System.out.println(str.toUpperCase()); // All uppercase	
		System.out.println(str.toLowerCase()); // All lowercase
		String big = str.toUpperCase();
		System.out.println(big);
		System.out.println(str);
		String lower = str.toLowerCase();
		System.out.println(lower);
		// lastIndexOf() returns the last occurrence of a string
		System.out.println(str.indexOf('e'));
		System.out.println(str.lastIndexOf('e'));
		// trim() removes any beginning and trailing spaces
		System.out.println(str.trim());
		// replace() replaces a character or substring with another character or substring
		System.out.println(str.replace('e', 'a'));
		//equals() compares two strings and returns true if they match
		System.out.println(str1.equals(str3)); // case sensitive
		System.out.println(str1.equalsIgnoreCase(str3));; // ignores case
		
				
	}
}
