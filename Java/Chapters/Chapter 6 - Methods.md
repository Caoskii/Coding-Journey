## OBJECTIVES

- To define methods with formal parameters (6.2)
- To invoke methods with actual parameters (i.e., arguments) (6.2)
- To define methods with a return value (6.3)
- To define methods without a return value (6.4)
- To pass arguments by value (6.5)
- To develop reusable code that is modular, easy to read, easy to debug, and easy to maintain (6.6)
- To write a method that converts hexadecimals to decimals (6.7)
- To use method overloading and understand ambiguous overloading (6.8)
- To determine the scope of variables (6.9)
- To apply the concept of method abstraction in software development (6.10)
- To design and implement methods using stepwise refinement (6.10)

## Defining Methods

— A method is a collection of statements that are grouped together to perform an operation

<img width="852" alt="Chapter 6 (1)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/6f0c2403-a549-4793-afac-d40e3a341d57">

<img width="843" alt="Chapter 6 (2)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/7058ecde-93ce-4e99-aac7-53dcd675ac4b">

## Method Signature

— Method signature is the combination of the method name and the parameter list.

<img width="847" alt="Chapter 6 (3)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/5aaa1879-2a7f-4dce-ac3b-7b1c526135cb">

## Formal Parameters

— The variables define in the method header are known as formal parameters.

<img width="848" alt="Chapter 6 (4)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/d7797468-b458-437e-8d35-e39b894b0827">

## Actual Parameters

— When a method is invoked, you pass a value to the parameter. This value is referred to as actual parameter or argument.

<img width="817" alt="Chapter 6 (5)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/b0683f79-13b0-4160-8d63-e0fa7ac49968">

## Return Value Type

— A method may return a value. The returnValueType is the data type of the value the method returns. If the method does not return a value, the returnValueType is the keyword void. For example, the returnValueType in the main method is void

<img width="823" alt="Chapter 6 (6)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/4dc7ab40-c14e-4da9-b906-825b16e7f7f9">

## Calling Methods

— Demonstrates calling a method max to return the largest of the int values.

<img width="829" alt="Chapter 6 (7)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/11e48547-948b-45e9-a95a-f779f4dcfd40">

## Trace Method Invocation

<img width="833" alt="Chapter 6 (8)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/7a4fffc5-7fa8-40c5-ba88-4ff0313d7359">

<img width="824" alt="Chapter 6 (9)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/6f182b6d-6435-418d-b644-c1ee8ebaf74f">

<img width="821" alt="Chapter 6 (10)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/6a619887-1e95-4b9c-8d51-a109d3a5bcaa">

<img width="819" alt="Chapter 6 (11)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/ab97690f-2e15-4599-84a1-9627a302f9b9">

<img width="818" alt="Chapter 6 (12)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/405fc512-7d86-4f87-ad9b-bc2fd2704aa7">

<img width="819" alt="Chapter 6 (13)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/8dfe19d8-0930-407b-a27b-f7c2ee2811bd">

<img width="814" alt="Chapter 6 (14)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/c864617d-9818-4dec-8a3d-b8ba3dc1f4b8">

<img width="820" alt="Chapter 6 (15)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/f07bdbd5-eba4-4b76-a1f8-9345a296b9f2">

<img width="816" alt="Chapter 6 (16)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/9f95f2bb-3894-459e-9957-f302a5ea013d">

<img width="828" alt="Chapter 6 (17)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/90e64d53-53f7-4be1-b523-4f1d3df5a79c">

## CAUTION

— A return statement is required for a value-returning method. The method shown below in (a) is logically correct, but it has a compilation error because the Java compiler thinks its possible that this method does not return any value.

<img width="820" alt="Chapter 6 (18)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/c66029ce-7502-4be9-9fcc-b21af28cffbc">

— To fix this problem, delete if (n < 0) in (a), so that the compiler will see a return statement to be reached regardless of how the if statement is evaluated.

## Reuse Methods from Other Classes

— NOTE: One of the benefits of method is for reuse. The max method can be invoked from any class besides TestMax. If you create a new class Test, you can invoke the max method using ClassName.methodName (e.g., TestMax.max)

## Call Stacks

<img width="871" alt="Chapter 6 (19)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/c94b4be6-f2d5-4a06-b948-ac84b71eec2b">

## Trace Call Stack

<img width="797" alt="Chapter 6 (20)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/37f673ad-c613-4537-ad25-1b9e3073b3db">

<img width="764" alt="Chapter 6 (21)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/6f923c17-0961-43ba-9831-eb1bd7edfe66">

<img width="769" alt="Chapter 6 (22)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/c3b04cfe-63fd-4997-97d7-6472b16a9c6e">

<img width="763" alt="Chapter 6 (23)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/86e2ec29-d9bc-4a5d-8a0a-c824c97cc6ec">

<img width="796" alt="Chapter 6 (24)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/f1c6fa04-2940-4ee9-b508-d73062b7ce49">

<img width="801" alt="Chapter 6 (25)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/01652a39-9fa7-41d4-9c7e-7e7e6bcc70e5">

<img width="799" alt="Chapter 6 (26)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/47d49650-58cc-4635-ad62-8bf8309dbdcf">

<img width="790" alt="Chapter 6 (27)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/8c94adc7-1dcc-42b8-b356-f680e18b932e">

<img width="790" alt="Chapter 6 (28)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/702a874b-9348-48a7-b48a-f3449191ac7e">

<img width="775" alt="Chapter 6 (29)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/96ddff7d-e2bc-429c-97ac-4ab265b4ca07">

## Passing Parameters

```java
public static void nPrintln (String message, int n) {
	for (int i = 0; i < n; i++)
		System.out.println(message);
}
	// Suppose you invoke the method using
			nPrintln("Welcome to Java'',5);
	// What is the output?

	// Suppose you invoke the method using
			nPrintln("Computer Science", 15);
	// What is the output?

	// Can you invoke the method using
			nPrintln(15, "Computer Science");
```

## Pass by Value

— Demonstrates passing values to the methods

<img width="857" alt="Chapter 6 (30)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/b24de511-27d8-4248-8f8a-c4007c395cfd">

## Modularizing Code

— Methods can be used to reduce redundant coding and enable code reuse. Methods can also be used to modularize code and improve the quality of the program.

## Case Study: Converting Hexadecimals to Decimals

— Write a method that converts a hexadecimal number into a decimal number

— ABCD ⇒

- A*16^3 + B*16^2 + C*16^1 + D*16^0
    
    = ((A*16 + B)*16 + C) *16 + D
    
    = ((10*16+11)*16+12)*16+13 = ?
    

## Overloading Methods

— Overloading the max Method

```java
public static double max (double num1, double num2) {
	if (num1 > num2)
		return num1;
	else
		return num 2;
}
```

## Ambiguous Invocation

— Sometimes there may be two or more possible matches for an invocation of a method, but the compiler cannot determine the most specific match. This is referred to as ambiguous invocation. Ambiguous invocation is a compiler error.

```java
public class AmbiguousOverloading {
	public static void main (String[] args) {
		System.out.println(max(1, 2));
}

	public static double max(int num1, double num2) {
		if (num1 > num2)
			return num1;
		else
			return num2;
	}

	public static double max(double num1, int num2) {
		if (num1 > num2)
			return num1;
		else
			return num2;
	}
}
```

## Scope of Local Variables

— A local variable: a variable defined inside a method.

— Scope: The part of the program where the variable can be referenced

— The scope of a local variable starts from its declaration and continues to the end of the block that contains the variable. A local variable must be declared before it can be used.

— You can declare a local variable with the same name multiple times in different non-nesting blocks in a method, but you cannot declare a local variable twice in nested blocks

— A variable declared in the initial action part of a for loop header has its scope in the entire loop, but a variable declared inside a for loop body has its scope limited in the loop body from its declaration and to the end of the block that contains the variable.

<img width="655" alt="Chapter 6 (31)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/10988d6b-15f8-418f-be3b-d5f2b6fe541f">

<img width="838" alt="Chapter 6 (32)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/0f5c410b-0cfc-408a-8250-270cf8bab981">

```java
// Fine with no errors
public static void correctMethod() {
	int x = 1;
	int y = 1;
	// i is declared
	for (int i = 1; i < 10; i++) {
		x += i;
	}
	// i is declared again
	for (int i = 1; i <10; i++) {
		y += i;
	}
}

// With errors
public static void incorrectMethod() {
	int x = 1;
	int y = 1;
	for (int i = 1; i <10; i++) {
		int x = 0;
		x += i;
	}
}
```

## Method Abstraction

— You can think of the method body as a black box that contains the detailed implementation for the method

<img width="550" alt="Chapter 6 (33)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/7453ac7b-9d97-427f-96e4-00cca5e2cdb7">

## Benefits of Methods

- Write a method once and reuse it anywhere
- Information hiding. Hide the implementation from the user
- Reduce complexity

## The RandomCharacter Class

```java
// RandomCharacter.java: Generate random characters
public class RandomCharacter {
	/** Generate a random character between ch1 and ch2 */
	public static char getRandomCharacter(char ch1, char ch2) {
		return (char)(ch1 + Math.random() * (ch2 - ch1 + 1));
	}

	/** Generate a random lowercase letter */
	public static char getRandomLowerCaseLetter() {
		return getRandomCharacter('a', 'z');
	}

	/** Generate a random uppercase letter */
	public static char getRandomUpperCaseLetter() {
		return getRandomCharacter('A', 'Z');
	}

	/** Generate a random digit character */
	public static char getRandomDigitCharacter() {
		return getRandomDigitCharacter('0', '9');
	}

	/** Generate a random character */
	public static char getRandomCharacter() {
		return getRandomCharacter('/u0000', '/uFFFF');
	}
}
```

## Stepwise Refinement (Optional)

— The concept of method abstraction can be applied to the process of developing programs. When writing a large program, you can use the ‘’divide and conquer’’ strategy, also known as stepwise refinement, to decompose it into subproblems. The subproblems can be further decomposed into smaller, more manageable problems.

## Design Diagram

<img width="716" alt="Chapter 6 (34)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/86a02595-ec0a-4a8e-a771-8535ffa75ce2">

## Implementation: Top-Down

— Top-down approach is to implement one method in the structure chart at a time from the top to the bottom. Stubs can be used for the methods waiting to be implemented. A stub is a simple but incomplete version of a method. The use of stubs enables you to test invoking the method from a caller. Implement the main method first and then use a stub for the printMonth method. For example, let printMonth display the year and the month in the stub. 

## Implementation: Bottom-Up

— Bottom-up approach is to implement one method in the structure chart at a time from the bottom to the top. For each method implemented, write a test program to test it. Both top-down and bottom-up methods are fine. Both approaches implement the method incrementally and help to isolate programming errors and makes debugging easy. Sometimes, they can be used together.

## Benefits of Stepwise Refinement

- Simpler Program
- Reusing Methods
- Easier Developing, Debugging, and Testing
- Better Facilitating Teamwork
