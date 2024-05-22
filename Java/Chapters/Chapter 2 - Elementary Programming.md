## Motivations

— In the preceding chapter, you learned how to create, compile, and run a Java program. Starting from this chapter, you will learn how to solve practical problems programmatically. Through these problems, you will learn Java primitive data types and related subjects, such as variables, constants, data types, operators, expressions, and input and output

## OBJECTIVES

- To write Java programs to perform simple computations (2.2)
- To obtain input from the console using the Scanner class (2.3)
- To use identifiers to name variables, constants, methods, and classes (2.4)
- To use variables to store data (2.5 - 2.6)
- To program with assignment statements and assignment expressions (2.6)
- To use constants to store permanent data (2.7)
- To name classes, methods, variables, and constants by following their naming conventions (2.8)
- To explore Java numeric primitive data types: **byte, short, int, long, float,** and **double (2.9)**
- To read a **byte, short, int, long, float,** or **double** value from the keyboard (2.9.1)
- To perform operations using operators +, -, /, and % (2.9.2)
- To perform operations using Math.pow (2.9.3)
- To write integer literals, floating-point literals, and literals in scientific notation (2.10)
- To use JShell to quickly test Java code (2.11)
- To write and evaluate numeric expressions (2.12)
- To obtain the current system time using System.currentTimeMillis() (2.13)
- To use augmented assignment operators (2.14)
- To distinguish between postincrement and preincrement and between postdecrement and predecrement (2.15)
- To cast the value of one type to another type (2.16)
- To describe the software development process and apply it to develop the loan payment program (2.17)
- To write a program that converts a large amount of money into smaller units (2.18)
- To avoid common errors and pitfalls in elementary programming (2.19)

## Introducing Programming with an Example

— Listing 2.1 Computing the Area of a Circle

— This program computes the area of the circle

## Pseudocode Algorithm

— An algorithm lists the steps you can follow to solve a problem

— Pseudocode: Natural language mixed with some programming code

1. Read in the circle’s radius
2. Compute the area using the following formula:
    1. area = radius * radius * PI
        1. Display the result

## Trace a Program Execution

```jsx
public class ComputeArea {
	/** Main method */
	public static void main(String[] args) {
		double radius;  // radius = no value (allocate memory for radius)
		double area;

		// Assign a radius
		radius = 20;
		
		// Compute area
		area = radius* radius* 3.14159;

		// Display results
		System.out.println("The area for the circle of radius" + radius + " is " + area);
	}
}
```

```jsx
public class ComputeArea {
	/** Main method */
	public static void main(String[] args) {
		double radius;   // radius = no value (allocate memory for radius)
		double area;   // area = no value (allocate memory for area)

		// Assign a radius
		radius = 20;
	
		// Compute area
		area = radius * radius * 3.14159;

		// Display results
		System.out.println("The area for the circle of radius" + radius + "is" + area);
	}
}
```

```jsx
public class ComputeArea {
	/** Main method */
	public static void main(String[] args) {
		double radius;  // radius = 20 (assign 20 to radius)
		double area;

		// Assign a radius
		radius = 20;

		// Compute area
		area = radius * radius * 3.14159;

		// Display results
		System.out.println("The area for the circle of radius" + radius + "is" + area);
	}
}
```

```jsx
public class ComputeArea {
	/** Main method */
	public static void main(String[] args) {
		double radius;  // radius = 20 (assign 20 to radius)
		double area;  // area = 1256.626 (compute area and assign it to variable area)

		// Assign a radius
		radius = 20;

		// Compute area
		area = radius * radius * 3.14159;

		// Display results
		System.out.println("The area for the circle of radius" + radius + "is" + area);
	}
}
```

```jsx
public class ComputeArea {
	/** Main method */
	public static void main(String[] args) {
		double radius;  // radius = 20 (assign 20 to radius)
		double area;  // area = 1256.626 (compute area and assign it to variable area)

		// Assign a radius
		radius = 20;

		// Compute area
		area = radius * radius * 3.14159; 

		// Display results
		System.out.println("The area for the circle of radius" + radius + "is" + area);  // print a message to the console
	}
}
```

## Implicit Import and Explicit Import

- java.util.* ; // Implicit import
- java.util.Scanner; // Explicit import

— No performance difference

## Identifiers

— An identifier is a sequence of characters that consist of letters, digits, underscores (_), and dollar signs ($).

— An identifier must start with a letter, an underscore (_), or a dollar sign ($). It cannot start with a digit

— Cannot be reserved word. (See Appendix A, “Java Keywords,” for a list of reserved words.)

— Cannot be true, false, or null.

— Can be of any length

## Variables

```jsx
// Compute the first area
radius = 1.0;
area = radius * radius * 3.14159;
System.out.println("The area is" + area + "for radius " + radius);

// Compute the second area
radius = 2.0;
area = radius * radius * 3.14159;
System.out.println("The area is " + area + "for radius " + radius);
```

## Declaring Variables

— int x;

- // Declare x to be an
- // integer variable;

— double radius; 

- // Declare radius to
- // be a double variable;

— char a;

- Declare a to be a
- // character variable;

## Assignment Statements

— x = 1;

- // Assign 1 to x;

— radius = 1.0;

- // Assign 1.0 to radius;

— a = ‘A’;

- // Assign ‘A’ to a;

## Declaring and Initializing in One Step

- int x = 1;
- double d = 1.4;

## Named Constants

- final datatype CONSTANTNAME = VALUE;
- final double PI = 3.14159;
- final int SIZE = 3;

## Naming Conventions

— Choose meaningful and descriptive names

— Variables and method names;

- Use lowercase. If the name consists of serval words, concatenate all in one, use lowercase for the first word, and capitalize the first letter of each subsequent word in the name. For example; the variables *radius* and *area*, and the method *computeArea*

— Class names:

- Capitalize the first letter of each word in the class name: ComputeArea

— Constants:

- Capitalize all the letters in constants, and use underscores () to connect words*: PI* and *MAX_VALUE*

## Numerical Data Types

— byte

- -2^7 to 2^7 - 1 (-128 to 127)
    - 8-bit signed

— short

- -2^15 to 2^15 - 1 (-32768 to 32767)
    - 16-bit signed

— int

- -2^31 to 2^31 - 1 (-2147483648 to 2147483647)
    - 32-bit signed

— long 

- -2^63 to 2^63 - 1 (i.e., -9223372036854775808 to 9223372036854775807)
    - 64-bit signed

— float 

- negative range:
    - 3.4028235E+38 to -1.4E-45
- positive range:
    - 1.4E-45 to 3.4028235E+38
        - 32-bit IEEE 754

— double 

- negative range:
    - 1.7976931348623157E+308 to -4.9E-324
- positive range:
    - 4.9E-324 to 1.7976931348623157E+308
        - 64-bit IEEE 754

## Reading Numbers from the Keyboard

— Scanner input = new Scanner(System.in);

— int value = input.nextInt();

— Method:

- nextByte()
    - reads an integer of the byte type
- nextShort()
    - reads an integer of the short type
- nextInt()
    - reads an integer of the int type
- nextLong()
    - reads an integer of the long type
- nextFloat()
    - reads a number of the float type
- nextDouble()
    - reads a number of the double type

## Numeric Operators

— Name

- +
    - Addition
        - 34 + 1
            - 35
- -
    - Subtraction
        - 34.0 - 0.1
            - 33.9
- *
    - Multiplication
        - 300 * 30
            - 9000
- /
    - Division
        - 1.0 / 2.0
            - 0.5
- %
    - Remainder
        - 20 % 3
            - 2

## Integer Division

— +, -, *, and %

— 5 / 2 yields an integer 2.

— 5.0 / 2 yields a double value 2.5

— 5 % 2 yields 1 (the remainder of the division)

## Remainder Operator

— Remainder is very useful in programming. 

— For ex: An even number % 2 is always 0 and an odd number % 2 is always 1. So you can use this property to determine whether a number is even or odd. Suppose today is Saturday and you and your friends are going to meet in 10 days. What day is in 10 days? You can find that day in Tuesday using the following expression:

- (6 + 10) % 7 is 2
    - 6 = Saturday is the 6th day in a week
    - 10 = After 10 days
    - 7 = A week has 7 days
    - 2 = The 2nd day in a week is Tuesday

## Note

— Calculations involving floating-point numbers are approximated because these numbers are not stored with complete accuracy:

- System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);
    - Displays 0.500000000001, not 0.5
- System.out.println (1.0 - 0.9);
    - Displays 0.99999999998, not 0.1. Integers are stored precisely. Therefore, calculations with integers yield a precise integer result.

## Exponent Operations

```jsx
System.out.println(Math.powe(2, 3));
// Displays 8.0
System.out.println(Math.pow(4, 0.5));
// Displays 2.0
System.out.println(Math.pow(2.5, 2));
// Displays 6.25
System.out.println(Math.pow(2.5, -2));
// Displays 0.16
```

## Number Literals

— A literal is a constant value that appears directly in the program. For ex:

- 34, 1,000,000, and 5.0 are literals in the following statements:
    - int i = 34;
    - long x = 100000;
    - double d = 5.0;

## Integer Literals

— An integer literal can be assigned to an integer variable as long as it can fit into the variable. A compilation error would occur if the literal were too large for the variable to hold. For example:

- The statement byte b = 1000 would cause a compilation error, because 1000 cannot be stored in a variable of the byte type

— An integer literal is assumed to be part of the int type, whose value is between -2^31 (-2147483648) to 2^31-1 (2147483547). To denote the integer literal of the long type, append it with the letter L or l. L is preferred because l (lowercase L) can easily be confused with 1 (the digit one)

## Floating-Point Literals

— Floating-point literals are written with a decimal point. By default, a floating-point literal is treated as a double type value. For example:

- 5.0 is considered a double value, not a float value. You can make a number a float by appending the letter f or F, and make a number a double by appending the letter d or D. For example:
    - You can use 100.2f or 100.2F for a float number, and 100.2d or 100.2D for a double number

## Double vs. Float

— The double type values are more accurate than the float type values. For example:

- 

```jsx
System.out.println("1.0 / 3.0 is " + 1.0 / 3.0);
// Displays 1.0 / 3.0 is 0.3333333333333333 (16 digits)

System.out.println("1.0F / 3.0F is " + 1.0F / 3.0F);
// Displays 1.0F / 3.0F is 0.3333334 (7 digits)
```

## Scientific Notation

— Floating-point literals can also be specified in scientific notation, for example:

- 1.23456e+2, same as 1.23456e2, is equivalent to 123.456, and 1.23456e-2 is equivalent to 0.0123456.

— E (or e) represents an exponent and it can be either in lowercase or uppercase

## JShell

— JShell is a common line interactive tool introduced in Java 0. JShell enables you to type a single Java statement and get it executed to see the result right away without having to write a complete class. This feature is commonly known as REPL (Read-Evaluate-Print Loop), which evaluates expressions and executes statements as they are entered and show the results immediately

## Arithmetic Expressions

— 3+4x / 5 - 10(y-5)(a + b + c) / x + 9( 4/x + 9+x/y) is translated to

- (3 + 4*x)/5 - 10*(y - 5)*(a + b + c)/x + 9*(4/x + (9 + x)/y)

## How to Evaluated an Expression

— Though Java has its own way to evaluate an expression behind the scene, the result of a Java expression and its corresponding arithmetic expression are the same. Therefore, you can safely apply the arithmetic rule for evaluating a Java expression

- 3 + 4 * 4 + 5 * (4 + 3) - 1
    1. Inside parentheses first
- 3 + 4 * 4 + 5 * 7 - 1
    1. Multiplication
- 3 + 16 + 5 * 7 - 1
    1. Multiplication
- 3 + 16 + 35 - 1
    1. Addition
- 19 + 35 - 1
    1. Addition
- 54 - 1
    1. Subtraction
- 53

## Problem: Converting Temperatures

— Write a program that converts a Fahrenheit degree to Celsius using the formula:

- celsius = (5/9)(fahrenheit - 32)
    - Must write: celsius = (5.0 / 9)*(fahrenheit - 32)

## Problem: Displaying Current Time

— Write a program that displays current time in GMT in the format hour:minute:second such as 1:45:19

— This currentTimeMillis method in the system class returns the current time in milliseconds since the midnight, January 1, 1970 GMT. (1970 was the year when the Unix operating system was formally introduced.) You can use this method to obtain the current time, and then compute the current second, minute, and hour as follows

## Augmented Assignment Operators

— Operator

- +=
    - Addition Assignment
        - i += 8
            - i = i + 8
- -=
    - Subtraction Assignment
        - i -= 8
            - i = i - 8
- *=
    - Multiplication Assignment
        - i *= 8
            - i = i * 8
- /=
    - Division Assignment
        - i /= 8
            - i = i / 8
- %=
    - Remainder Assignment
        - i %= 8
            - i = i % 8

## Increment and Decrement Operators

— Operator

- ++var
    - Preincrement
        - Increment var by 1, and uses the new var value in the statement
            - Example:
            
            ```jsx
            int j = ++i;
            // j is 2, i is 2
            ```
            
- var++
    - Postincrement
        - Increment var by 1, but use the original var value in the statement
            - Example:
            
            ```jsx
            int j = i++;
            // j is 1, i is 2
            ```
            
- —var
    - Predecrement
        - Decrement var by 1, and use the new var value in the statement
            
            ```jsx
            int j = --i;
            // j is 0, i is 0
            ```
            
- var—
    - Postdecrement
        - Decrement var by 1, and use the original var value in the statement
            
            ```jsx
            int j = i--;
            // j is 1, i is 0
            ```
            

```jsx
int i = 10;
int newNum = 10 * i++; // Same effect as ( int newNum = 10 * i; ) (i = i + i;)

int i = 10;
int newNum = 10 * (++i); // Same effect as ( i = i + i; ) (int newNum = 10 * i;)
```

— Using increment and decrement operators makes expressions short, but it also makes them complex and difficult to read. Avoid using these operators in expressions that modify multiple variables, or the same variable for multiple times such as this: 

- int k = ++i + i.

## Assignment Expressions and Assignment Statements

— Prior to Java 2, all the expressions can be used as statements. Since Java 2, only the following types of expressions can be statements:

```jsx
variable op= expression: // Where op is +, -, *, or %
++variable;
variable++;
--variable;
variable--
```

# Numeric Type Conversion

— Consider the following statements:

- byte i = 100;
- long k = i * 3 + 4;
- double d = i * 3.1 + k / 2;

## Conversion Rules

— When performing a binary operation involving two operands of different types, Java automatically converts the operand based on the following rules:

1. If one of the operands is double, the other is converted into double.
2. Otherwise, if one of the operands is float, the other is converted into float.
3. Otherwise, if one of the operands is long, the other is converted into long.
4. Otherwise, both operands are converted into int.

## Type Casting

— Implicit casting

- double d = 3; (type widening)

— Explicit casting

- int i = (int)3.0; (type narrowing)
- int i = (int)3.9; (Fraction part is truncated/short)

What is wrong? 

- int x = 5/2.0;

— Range increases

-——————————————————-→

- byte, short, int, long, float, double

## Problem: Keeping Two Digits After Decimal Points

— Write a program that displays the sales tax with two digits after the decimal point

## Casting in an Augmented Expression

— In Java, an augmented expression of the form x1 op=x2 is implemented as x1 = (T)(x1 op x2), where T is the type for x1. Therefore, the following code is correct

```jsx
int sum =0;
sum += 4.5; // sum becomes 4 after this statement

sum += 4.5 is equivalent to sum = (int)(sum + 4.5)
```

## Software Development Process

1. Requirements Specification
2. System Analysis
3. System Design
4. Implementation
5. Testing
6. Deployment
7. Maintenance

## Requirement Specification

— A formal process that seeks to understand the problem and document in detail what the software system needs to do. This phase involves close interaction between users and designers

— Most of the examples are simple, and their requirements are clearly stated. In the real world, however, problems are not well defined. You will need to study a problem carefully to identify its requirements

## System Analysis

— Seeks to analyze the business process in terms of data flow, and to identify the system’s input and output

— Part of the analysis entails modeling the system’s behavior. The model is intended to capture the essential elements of the system and to define services to the system

## System Design

— The process of designing the system’s components

— This phase involves the use of many levels of abstraction to decompose the problem into manageable components, identify classes and interfaces, and establish relationships among the classes and interfaces.

## IPO (Input, Process, Output)

— The essence of system analysis and design is input, process, and output or IPO

## Implementation

— The process of translating the system design into programs. Separate programs are written for each component and put to work together.

— This phase requires the use of a programming language like Java. The implementation involves coding, testing, and debugging.

## Testing

— Ensures that the code meets the requirements specification and weeds out bugs.

— An independent team of software engineers not involved in the design and implementation of the project usually conducts such testing.

## Deployment

— Deployment makes the project available for use

— For a Java program, this means installing it on a desktop or on the Web.

## Maintenance

— Maintenance is concerned with changing and improving the product.

— A software product must continue to perform and improve in a changing environment. This requires periodic upgrades of the product to fix newly discovered bugs and incorporate changes.

## Problem: Computing Loan Payments

—This program lets the user enter the interest rate, number of years, and loan amount, and computes monthly payment and total payment.

```jsx
monthlyPayment = loanAmountxmonthlyInterestRate / 1 - 1 (1 + monthlyInterestRate)^numberOfYearsx12
```

## Problem: Monetary Units

— This program lets the user enter the amount in decimal representing dollars and cents and output a port listing the monetary equivalent in single dollars, quarters, dimes, nickels, and pennies. Your program should report maximum number of dollars, then the maximum number of quarters, and so on, in this order.

## Common Errors and Pitfalls

- Common Error 1: Undeclared/Uninitialized Variables and Unused Variables
    - double interestRate = 0.05;
    - double interest = interestrate * 45;
- Common Error 2: Integer Overflow
    
    ```jsx
    int value = 2147483647 + 1;
    // Value will actually be -214748648
    ```
    
- Common Error 3: Round-off Errors
    
    ```jsx
    System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);
    
    System.out.println(1.0 - 0.9)
    ```
    
- Common Error 4: Unintended Integer Division
    
    ```jsx
    int number1 = 1;
    int number2 = 2;
    double average = (number1 + number2) / 2;
    System.out.println (average);
    ```
    
    ```jsx
    int number1 = 1;
    int number2 = 2;
    double average = (number1 + number2) / 2.0;
    System.out.println(average);
    ```
    
- Common Error 5: Redundant Input Objects
- Common Pitfall 1: Redundant Input Objects
    
    ```jsx
    Scanner input = newScanner(System.in);
    System.out.print("Enter an integer:");
    int v1 = input.nextInt();
    ```
    
    ```jsx
    Scanner input1 = new Scanner(System.in);
    System.out.print("Enter a double value:");
    double v2 = input1.nextDouble();
    ```
