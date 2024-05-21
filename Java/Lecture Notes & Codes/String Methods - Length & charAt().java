import java.util.Scanner;
public class StringMethods {
	public static void main(String[] args) {
		String str = "Computer Science"; // 0-16 characters including space
		System.out.println(str);
		System.out.println(str.length());
		// charAt() returns the character located at index
		System.out.println(str.charAt(5));
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(15)); // Same as bottom print
		System.out.println(str.charAt(str.length() - 1));
	}
}
