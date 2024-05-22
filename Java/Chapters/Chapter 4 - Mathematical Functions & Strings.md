## Motivations

— Suppose you need to estimate the area enclosed by four cities, given the GPS locations (latitude and longitude) of these cities, as shown in the following diagram. How would you write a program to solve this problem? You will be able to write such a program after completing this chapter

## OBJECTIVES

- To solve mathematics problems by using the methods in the Math class (4.2)
- To represent characters using the char type (4.3)
- To encode characters using ASCII and Unicode (4.3.1)
- To cast a numeric value to a character and cast a character to an integer (4.4.2)
- To compare and test characters using the static methods in the Character class (4.3.4)
- To introduce objects and instance methods (4.4)
- To represent strings using the String objects (4.4)
- To return the string length using the length() method (4.4.1)
- To return a character in the string using the charAt(i) method (4.4.2)
- To use the + operator to concatenate strings (4.4.3)
- To read strings from the console (4.4.4)
- To read a character from the console (4.4.5)
- To compare strings using the equals method and the compareTo methods (4.4.6)
- To obtain substrings (4.4.7)
- To find a character or a substring in a string using the indexOf method (4.4.8)
- To program using characters and strings (GuessBirthday) (4.5.1)
- To convert a hexadecimal character to a decimal value (HexDigit2Dec) (4.5.2)
- To revise the lottery program using strings (LotteryUsingStrings) (4.5.3)
- To format output using the System.out.printf method (4.6)

## Mathematical Functions

— Java provides many useful methods in the Math class for performing common mathematical functions

## The Math Class

— Class constants:

- PI
- E

— Class methods:

- Trigonometric Methods
- Exponent Methods
- Rounding Methods
- min, max, abs, and random Methods

## Trigonometric Methods

- sin (double a)
- cos (double a)
- tan (double a)
- acos (double a)
- asin (double a)
- atan (double a)

```java
// Examples:

Math.sin(0) returns 0.0
Math.sin(Math.PI / 6)
	returns 0.5
Math.sin(Math.PI / 2)
	returns 1.0
Math.cos(0) returns 1.0
Math.cos(Math.PI / 6)
	returns 0.866
Math.cos(Math.PI / 2)
	returns 0
```

## Exponent Methods

- exp (double a)
    - Returns *e* raised to the power of *a*
- log (double a)
    - Returns the natural logarithm of a
- log10 (double a)
    - Returns the 10-based logarithm of a
- pow (double a, double b)
    - Returns a raised to the power of b
- sqrt (double a)
    - Returns the square root of a

## Rounding Methods

- double ceil (double x)
    - x rounded up to its nearest integer. This integer is returned as a double value
- double floor (double x)
    - x is rounded down to its nearest integer. This integer is returned as a double value
- double rint (double x)
    - x is rounded to its nearest integer. If x is equally close to two integers, the even one is returned as a double
- int round (float x)
    
    ```java
    Return (int)Math.floor(x+0.5)
    ```
    
- long round (double x)
    
    ```java
    Return (long)Math.floor(x+0.5)
    ```
    

## Rounding Methods Examples

```java
Math.ceil(2.1) // returns 3.0
Math.ceil(2.0) // returns 2.0
Math.ceil(-2.0) // returns -2.0
Math.ceil(-2.1) // returns -2.0
Math.floor(2.1) // returns 2.0
Math.floor(2.0) // returns 2.0
Math.floor(-2.0) // returns –2.0
Math.floor(-2.1) // returns -3.0
Math.rint(2.1) // returns 2.0
Math.rint(2.0) // returns 2.0
Math.rint(-2.0) // returns –2.0
Math.rint(-2.1) // returns -2.0
Math.rint(2.5) // returns 2.0
Math.rint(-2.5) // returns -2.0
Math.round(2.6f) // returns 3
Math.round(2.0) // returns 2
Math.round(-2.0f) // returns -2
Math.round(-2.6) // returns -3
```

## min, max, and abs

- max (a, b) and min(a, b)
    - Returns the maximum or minimum of two parameters
- abs (a)
    - Returns the absolute value of the parameter
- random()
    - Returns a random double value in the range [0.0, 1.0)

```java
// Examples:

Math.max(2, 3) // returns 3
Math.max(2.5, 3) // returns 3.0
Math.min(2.5, 3.6) // returns 2.5
Math.abs(-2) // returns 2
Math.abs(-2.1) // returns 2.1
```

## The random Method

== Generates a random double value greater than or equal to 0.0 and less than 1.0 (0 <= Math.random() < 1.0)

- Example:

```java
(int) (Math.random() * 10) // returns a random integer between 0 and 9

50 + (int) (Math.random() * 50) // Returns a random integer between 50 and 99

// In general

a + Math.random() * b // Returns a random number between a and a + b, excluding a + b.
```

## Character Data Type

```java
char letter ='A'; (ASCII)
char numChar ='4'; (ASCII)
char letter = '\u0041'; (Unicode)
char numChar = '\u0034'; (Unicode)
```

— Note: The increment and decrement operators can also be used on char variables to get the next or preceding Unicode charafcter. For example, the following statements display character b.

```java
char ch = 'a';
System.out.println(++ch);
```

## Unicode Format

— Java characters use Unicode, a 16-bit encoding scheme established by the Unicode Consortium to support the interchange, processing, and display of written texts in the world’s diverse languages. Unicode takes two bytes, preceded by \u, expressed in four hexadecimal numbers that run from ‘\u0000’ to ‘\uFFFF’ So, Unicode can represent 65535 + 1 characters

!<img width="643" alt="Chapter 4 (1)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/3a01154a-701f-48c6-8073-4a56b2e2e3f2">

## ASCII Code for Commonly Used Characters

| Characters | Code Value in Decimal | Unicode Value |
| --- | --- | --- |
| ‘0’ to ‘9’ | 48 to 57 | \u0030 to \u0039 |
| ‘A’ to ‘Z’ | 65 to 90 | \u0041 to \u005A |
| ‘a’ to ‘z’ | 97 to 122 | \u0061 to \u007A |

## Escape Sequences for Special Characters

| Escape Sequence | Name | Unicode Code | Decimal Value |
| --- | --- | --- | --- |
| \b | Backspace | \u0008 | 8 |
| \t | Tab | \u0009 | 9 |
| \n | Linefeed | \u000A | 10 |
| \f | Formfeed | \u000C | 12 |
| \r | Carriage Return | \u000D | 13 |
| \\ | Blackslash | \u005C | 92 |
| \” | Double Quote | \u0022 | 34 |

## Appendix B: ASCII Character Set

— ASCII Character Set is a subset of the Unicode from \u0000 to \u007f

|  | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| 0 | nul | soh | stx | etx | eot | enq | ack | bel | bs | ht |
| 1 | nl | vt | ff | cr | so | si | dle | dcl | dc2 | dc3 |
| 2 | dc4 | nak | syn | etb | can | em | sub | esc | fs | gs |
| 3 | rs | us | sp | ! | “ | # | $ | % | & | ‘ |
| 4 | ( | ) | * | + | , | - | . | / | 0 | 1 |
| 5 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | : | ; |
| 6 | < | = | > | ? | @ | A | B | C | D | E |
| 7 | F | G | H | I | J | K | L | M | N | O |
| 8 | P | Q | R | S | T | U | V | W | X | Y |
| 9 | Z | [ | \ | ] | ^ | _ | ` | a | b | c |
| 10 | d | e | f | g | h | i | j | k | l | m |
| 11 | n | o | p | q | r | s | t | u | v | w |
| 12 | x | y | z | { | | | } | ~ | del |  |  |

## Casting Between char and Numeric Types

```java
int i = 'a'; // Same as int i = (int) 'a';
char c = 97; // Same as char c = (char) 97;
```

## Comparing and Testing Characters

```java
if (ch >= 'A' && ch <= 'Z')
	System.out.println(ch + " is an uppercase letter");
else if (ch >= 'a' && ch <= 'z')
	System.out.println(ch + " is a lowercase letter");
else if (ch >= '0' && ch <= '9')
	System.out.println(ch + " is a numeric character");
```

## Methods in the Character Class

| Methods | Description |
| --- | --- |
| isDigit (ch) | Returns true if the specified character is a digit |
| isLetter (ch) | Returns true if the specified character is a letter |
| isLetterOfDigit (ch) | Returns true if the specified character is a letter or digit |
| isLowerCase (ch) | Returns true if the specified character is a lowercase letter |
| isUpperCase (ch) | Returns true if the specified character is an uppercase letter |
| toLowerCase (ch) | Returns the lowercase of the specified character |
| toUpperCase (ch) | Returns the uppercase of the specified character |

## The String Type

— The char type only represents one character. To represent a string of characters, use the data type called String. Ex:

```jsx
String message = "Welcome to Java";
```

— String is actually a predefined class in the Java library just like the System class and Scanner class. The String type is not a primitive type. It is known as a reference type. Any Java class can be used as a reference type for a variable. Reference data types will be thoroughly discussed in Chapter 9, “Objects and Classes.”

— For the time being, you just need to know how to declare a String variable, how to assign a string to the variable, how to concatenate strings, and to perform simple operations for strings.

## Simple Methods for String Objects

| Method | Description |
| --- | --- |
| length () | Returns the number of characters in this string |
| charAt (index) | Returns the character at the specified index from this string |
| concat (s1) | Returns a new string that concatenates this string with string s1 |
| toUpperCase () | Returns a new string with all letters in uppercase |
| toLowerCase () | Returns a new string with all letters in lowercase |
| trim () | Returns a new string with whitespace characters trimmed on both sides |

— Strings are objects in Java. The methods in the preceding table can only be invoked from a specific string instance.

- For this reason, these methods are called instance methods.

— A non-instance method is called a static method.

- A static method can be invoked without using an object.

— All the methods defined in the Math class are static methods. They are not tied to a specific object instance. The syntax to invoke an instance method is

```java
referenceVariable.methodName(arguments)
```

## Getting String Length

```java
String message = "Welcome to Java";
System.out.println("The length of " + message + " is " + message.length());
```

## Getting Characters from a String

— Indices message

| 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 |
| --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- | --- |
| W | e | l | c | o | m | e |  | t | o |  | J | a | v | a |

^ — message.charAt(0), - message.length() is 15 , - message.charAt(14)

```java
String message = "Welcome to Java";
System.out.println("The first character in message is " + message.charAt(0));
```

## Converting Strings

```java
"Welcome".toLowerCase() // Returns a new string, welcome
"Welcome".toUpperCase() // Returns a new string, WELCOME
" Welcome ".trim() // Returns a new string, Welcome
```

## String Concatenation

```java
String s3 = s1.concat(s2); /* or */ String s3 = s1 + s2;

// Three Strings are concatenated
String message = "Welcome " + "to " + "Java";

// String Chapter is concatenated with number 2
String s = "Chapter" + 2; // s becomes Chapter2

// String Supplement is concatenated with character B
String s1 = "Supplement" + 'B'; // s1 becomes SupplementB
```

## Reading a String from the Console

```java
Scanner input = new Scanner(System.in);
System.out.print("Enter three words separated by spaces: ");
String s1 = input.next();
String s2 = input.next();
String s3 = input.next();
System.out.println("s1 is " + s1);
System.out.println("s2 is " + s2);
System.out.println("s3 is " + s3);
```

## Reading a Character from the Console

```java
Scanner input = new Scanner(System.in);
System.out.print("Enter a character: ");
String s = input.nextLine();
char ch = s.charAt(0);
System.out.println("The character entered is " + ch);
```

## Comparing Strings

| Method | Description |
| --- | --- |
| equals (s1) | Returns true if this string is equal to string s1 |
| equalsIgnoreCase (s1) | Returns true if this string is equal to string s1; it is case insensitive |
| compareTo (s1) | Returns an integer greater than 0, equal to 0, or less than 0 to indicate whether this string is greater than, equal to, or less than s1 |
| compareToIgnoreCase (s1) | Same as compareTo except that the comparison is case insensitive |
| startsWith (prefix) | Returns true if this string starts with the specified prefix |
| endsWith (suffix) | Returns true if this string ends with the specified suffix |

## Obtaining Substrings

| Method | Description |
| --- | --- |
| substring (beginIndex) | Returns this string’s substring that begins with the character at the specified beginIndex and extends to the end of the string |
| substring (beginIndex, endIndex) | Returns this string’s substring that begins at the specified beginIndex and extends to the character at index endIndex - 1. Note that the character at endIndex is not part of the substring. |

!<img width="779" alt="Chapter 4 (2)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/95548f7f-8362-4a0e-84f6-55532f200d32">

## Finding a Character or a Substring in a String

| Method | Description |
| --- | --- |
| indexOf (ch) | Returns the index of the first occurrence of ch in the string. Returns -1 if not matched |
| indexOf (ch, fromIndex) | Returns the index of the first occurrence of ch after fromIndex in the string. Returns -1 if not matched |
| indexOf (s) | Returns the index of the first occurrence of string s in this string. Returns -1 if not matched |
| indexOf (s, fromIndex) | Returns the index of the first occurrence of string s in this string after fromIndex. Returns -1 if not matched |
| lastIndexOf (ch) | Returns the index of the last occurrence of ch in the string. Returns -1 if not matched |
| lastIndexOf (ch, fromIndex) | Returns the index of the last occurrence of ch before FromIndex in this string. Returns -1 if not matched |
| lastIndexOf (s) | Returns the index of the last occurrence of string s. Returns -1 if not matched |
| lastIndexOf (s, fromIndex) | Returns the index of the last occurrence of string s before fromIndex. Returns -1 if not matched |

```java
		int k = s.indexOf('');
String firstName = s.substring(0,k);
String lastName = s.substring(k+1);
```

!<img width="629" alt="Chapter 4 (3)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/3f3e2180-4f8f-413e-ad28-b310ab8a76a7">

## Conversion between Strings and Numbers

```java
int intValue = Integer.parseInt(intString);
double doubleValue = Double.parseDouble(doubleString);

String s = number + "";
```

## Mathematics Basis for the Game

— 19 is 10011 in binary. 7 is 111 in binary. 23 is 11101 in binary

!<img width="800" alt="Chapter 4 (4)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/04239449-c937-4e6b-b81a-00cc1588b87a">

## Formatting Output

— Use the printf statement

```java
System.out.printf(format, items);
```

— Where format is a string that may consist of substrings and format specifiers. A format specifier specifies how an item should be displayed. An item may be a numeric value, character, boolean value, or a string. Each specifier begins with a percent sign.

## Frequently-Used Specifiers

| Specifier Output |  | Example |
| --- | --- | --- |
| %b | a boolean value | true or false |
| %c | a character | ‘a’ |
| %d | a decimal integer | 200 |
| %f | a floating-point number | 45.460000 |
| %e | a number in standard scientific notation | 4.556000e+01 |
| %s | a string | “Java is cool” |

```java
	int count = 5;
double amount = 45.56;
System.out.printf("count is %d and amount is %f", count, amount);

// %d is count and %f is amount. count is 5 and amount is 45.560000
```
