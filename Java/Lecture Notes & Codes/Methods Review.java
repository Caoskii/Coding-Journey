public class MethodsReview {
	static int value=0;
	public static void welcome(String name) {
		System.out.println("Hey " +name);
		System.out.println("Welcome to Compute Science class " +name);
		System.out.println("I hope you enjoy the class and find it useful!");
		System.out.println("Have a good day " +name);
	}
	// Method that prints the factors of a given integer
	public static void factors(int num) {
		for(int i=1; i<num; i++)
		{
			if(num%i==0)
				System.out.println(i+ " ");
		}
	}
	// Method that takes a word (String) and prints the first half
	// If the length is even, second half otherwise
	public static void halfString(String word) {
		if(word.length()%2==0)
			System.out.println(word.substring(0, word.length()/2));
		else
			System.out.println(word.substring(word.length()/2));
	}
	public static void increment() {
		value++;
		
	}
	// Method that adds two numbers and return the total
	public static int add(int a, int b) {
		return a+b;
	}
	// Calculating the average
	public static double average(int x, int y) {
		double total = x+y;
		return total/2;
	}
	public static double average2(int x, int y) {
		double sum = add(x,y);
		return sum/2.0;
	}
	// Method that takes a number and returns true if it is even
	// Returns false if otherwise
	public static boolean isEven(int num) {
		if(num%2==0)
			return true;
		else
			return false;
	}
	// Method that takes a string and returns the number of spaces
	// in the string
	public static int emptySpaces(String sentence) {
		int count=0;
		for(int i=0; i<sentence.length(); i++)
		{
			if(sentence.charAt(i)==' ')
				count++;
		}
		return count;
	}
	// Method that returns the last character in a string
	public static char lastChar(String word) {
		return word.charAt(word.length()-1); // Returns the last character
		
	}
	
	public static void main(String[] args) {
		welcome("Mike");
		System.out.println();
		welcome("Maria");
		System.out.println();
		factors(12);
		System.out.println();
		halfString("Science");
		System.out.println(value);
		increment();
		increment();
		System.out.println(value);
		int sum = add(10,20); // <- return type is 'int' and saves it
		System.out.println(average(10,20));
		System.out.println(average2(10,20));
		System.out.println(isEven(24)); // True or False Booelean method
		System.out.println(emptySpaces("Java is a cool program"));
		System.out.println("Last character is: " + lastChar("Computer"));
	}

}
