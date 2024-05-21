public class StringCharacterMath {
	public static void main(String[] args) {
		int a = 5, b = 9, c = 13, d = 7;
		int high1 = Math.max(a, b);
		int high2 = Math.max(c, d);
		System.out.println(Math.max(high1, high2));
		System.out.println(Math.pow(2, 5));
		int radius = 5;
		System.out.println("The area of the circle is: " + Math.pow(radius, 2) * Math.PI);
		System.out.println(Math.sqrt(36));
		double e = 14.38;
		System.out.println(Math.floor(e)); // Round-down
		System.out.println(Math.ceil(e)); // Round-up
		System.out.println(Math.round(e)); // To round-up or round-down base on decimal
		double t = -12.16;
		System.out.println(Math.abs(t)); // Changes from negative to positive
		int rand = (int)(Math.random() * 11) + -5; // Random from -5 - +5
		// range = high - low + 1
		// range = 5 - (-5) + 1
		System.out.println("Your random number is: " + rand);
	}
}
