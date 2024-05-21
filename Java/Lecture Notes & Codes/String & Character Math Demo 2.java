public class StringCharacterMath2 {
	public static void main(String[] args) {
		// int (integer), double (decimal), char (characters), boolean (true or false)
		char letter = 'A' + 4; // 'A' and A are different. // 65 and A are the same thing on ASCII table
		System.out.println((int)letter);
		int num = 72; // 72 and H are the same on ASCII table
		System.out.println((char)num);
		
		char letters = 'A';
		System.out.println(Character.toLowerCase(letters));
	}
}
