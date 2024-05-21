import java.util.Scanner;
public class Assignment_02_Sample {

	public static void main(String[] args) {
		String str = "Computer Science";
		// length will return the total number of digits
		System.out.println(str.length());
		// substring will return a part of the string
		System.out.println(str.substring(3,6));
		// indexOf() will return the location or position of index of
		// particular character or string
		System.out.println(str.indexOf("put"));
		// charAt() will return the character at a given index
		System.out.println (str.charAt(0));
	}
}
