## Motivations

— If you are assigned a negative value for radius in Listing 2.2, ComputeAreaWithConsoleInput.java, the program would print an invalid result. If the radius is negative, you don’t want the program to compute the area.

## OBJECTIVES

- To declare **Boolean** variables and write **Boolean** expressions using relational operators (3.2)
- To implement selection control using one-way if statements (3.3)
- To implement selection control using two-day **if-else** statements (3.4)
- To implement selection control using nested if and multi-way if statements (3.5)
- To avoid common errors and pitfalls in if statements (3.6)
- To generate random numbers using the Math.random() method (3.7)
- To program using selection statements for a variety of examples (SubtractionQuiz, BMI, ComputeTax) (3.7 - 3.9)
- To combine conditions using logical operators (&&, ||, and !) (3.10)
- To program using selection statements with combined conditions (LeapYear, Lottery) (3.11 - 3.12)
- To implement selection control using switch statements (3.13)
- To write expressions using the conditional expression (3.14)
- To examine the rules governing operator precedence and associativity (3.15)
- To apply common techniques to debug errors (3.16)

## The Boolean Type and Operators

— Often in a program you need to compare two values, such as whether i is greater than j. Java provides six comparison operators (also known as relational operators) that can be used to compare two values. The result of the comparison is a Boolean value : true or false.

```jsx
boolean b = (1 > 2);
```

## Relational Operators

— Java Operator

- <
    - <
        - Less than
            - Radius < 0
                - False
- <=
    - ≤
        - Less than or equal to
            - Radius ≤ 0
                - False
- >
    - >
        - Greater than
            - Radius > 0
                - True
- >=
    - ≥
        - Greater than or equal to
            - Radius ≥ 0
                - True
- ==
    - ==
        - Equal to
            - Radius == 0
                - False
- !=
    - ≠
        - Not equal to
            - Radius ≠ 0
                - True

## Problem: A Simple Math Learning Tool

— This example creates a problem to let a first grader practice additions. The program randomly generates two single-digit integers number1 and number2 and displays a question such as “What is 7+9?” to the student. After the student types the answer, the program displays a message to indicate whether the answer is true or false

## One-way if Statement

```jsx
if (radius >= 0) {
	area = radius * radius * PI;
	System.out.println("The area" + " for the circle of radius" _ radius + " is" + area);
}
```

```jsx
if (boolean-expression) {
	statement(s);
}
```

## Note

```jsx
if i > 0 {
	System.out.println("i is positive"); // Wrong
}

__________________________________________________

if (i > 0) { // Use ()
	System.out.println("i is positive"); // Correct
}

___________________________________________________

if (i > 0) {
	System.out.println ("i is positive"); // equivalent to

if (i > 0) 
	System.out.println("i is positive");
```

## The Two-way if Statement

```jsx
if (boolean-expression) {
	statement(s) -for-the-true-case;
}
else {
	statement(s) -for-the-false-case;
```

## If-Else Example:

```jsx
if (radius >=0) {
	area = radius * radius * 3.14159;

	System.out.println("The area for the " + "circle of radius " + radius + " is " + area);
}
else {
	System.out.println("Negative input");
}
```

## Multiple Alternative if Statements

```jsx
if (score >= 90.0)
	System.out.print("A");
else
	if (score >= 80.0)
		System.out.print("B");
	else
		if (score >= 70.0)
			System.out.print("C");
			else
				if (score >= 60.0);
					System.out.print("D");
					else
						System.out.print("F");

// OR

if (score >= 90.0)
	System.out.print("A");
else if (score >= 80.0)
	System.out.print("B");
else if (score >= 70.0)
	System.out.print("C");
else if (score >= 60.0)
	System.out.print("D");
else
	System.out.print("F");
```

## Multi-Way if-else Statements

![Screenshot 2024-02-05 at 10.58.29 AM.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/390e5f93-07cf-4492-a7f9-e9f8d32aa70c/c49775ef-d674-4087-af5d-35a10080d5df/Screenshot_2024-02-05_at_10.58.29_AM.png)

## Trace if-else Statement

```jsx
if (score >= 90.0) // Suppose score is 70, this condition would be flase
	System.out.print("A");
else if (score >= 80.0) // Suppose top score is 70, this condition would also be false
	System.out.print("B");
else if (score >= 70.0) // Suppose top score is 70, this condition would be true)
	System.out.print("C"); // Grade would be C
```

## Note

— The else clause matches the most recent if clause in the same block

```jsx
int i = 1, j = 2, k = 3;

if (i > j)
	if (i > k)
		System.out.println("A");
else
		System.out.println("B");

// Equivalent 

int i = 1, j = 2, k = 3;

if (i > j)
	if (i > k)
		System.out.println("A");
	else
		System.out.println("B");

// This is better with correct indentation ^
```

— Nothing is printed from the preceding statement. To force the else clause to match the first if clause, you must add a pair of braces:

```jsx
int i = 1;
int j = 2;
int k = 3;
if (i > k) {
	if (i > k)
		System.out.println("A");
}
else
	System.out.println("B");
// This statement prints B
```

## Common Errors

— Adding a semicolon at the end of an if clause is a common mistake.

```jsx
if (radius >= 0); // <- Wrong
{
	area = radius * radius * PI;
	System.out.println(
		"The area for the circle of radius " + radius + " is " + area);
}
// The mistake is hard to find, it is a logic error.
// This error often occurs when you use the next-line block style
```

## TIP

```jsx
if ()number % 2 == 0)
	even = true;
else
	even = false;

// Equivalent to

boolean even 
	= number % 2 == 0;
```

## CAUTION

```jsx
if (even == true)
	System.out.println(
		"It is even.");

// Equivalent to

if (even)
	System.out,println(
		"It is even.");
```

## Problem: An Improved Math Learning Tool

— This example creates a program to teach a first grade child how to learn subtractions. The program randomly generates two single-digit integers number1 and number2 with number1 ≥ number 2 and displays a question such as “What is 9 - 2?” to the student. After the student types the answer, the program displays whether the answer is correct

## Problem: Body Mass Index

— Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking your weight in kilograms and dividing by the square of your height in meters. The interpretation of BMI for people 16 years or older is as follows:

- BMI < 18.5
    - Underweight
- 18.5 ≤ BMI < 25.0
    - Normal
- 25.0 ≤ BMI < 30.0
    - Overweight
- 30.0 ≤ BMI
    - Obese

## Problem: Computing Taxes

— The US federal personal income tax is calculated based on the filing status and taxable income. There are four filing statuses: Single Filers, Married Filing Jointly, Married Filing Separately, and Head of Household. The tax rates for 2009 are shown below

![Screenshot 2024-02-05 at 2.21.02 PM.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/390e5f93-07cf-4492-a7f9-e9f8d32aa70c/16820f79-3fb6-41d2-a528-ce866c3f9ae2/Screenshot_2024-02-05_at_2.21.02_PM.png)

```jsx
if (status == 0) {
	// Compute tax for single filers
}
else if (status == 1) {
	// Compute tax for married file jointly
	// or qualifying widow(er)
}
else if (status == 2) {
	// Compute tax for married file separately
}
else if (status == 3) {
	// Compute tax for head of house hold
}
else {
	// Display wrong status
}
```

## Logical Operators

— Operator

- !
    - Name: Not
        - Description: Logical Negation
- &&
    - Name: And
        - Description: Logical Conjunction
- ||
    - Name: Or
        - Description: Logical Disjunction
- ^
    - Name: Exclusive Or
        - Logical Exclusion

## Truth Table for Operator !

— p

- True

— !p 

- False
    - !(age > 18) is false, because (age > 18) is true
    - !(weight == 150) is true, because (weight == 150) is false

## Truth Table for Operator &&

| P1 | P2 | P1 && P2 | Example (assume age = 24, weight = 140) |
| --- | --- | --- | --- |
| false | false | false | (age ≤ 18) && (weight < 140) is false, because both condition are both false |
| false | true | false |  |
| true | false | false | (age > 18) && (weight > 140) is false, because (weight > 140) is false |
| true | true | true | (age > 18) && (weight ≥ 140) is true, because both (age >18) and (weight ≥ 140) are true |

## Truth Table for Operator ||

| P1 | P2 | P1 || P2 | Example (assume age = 24, weight = 140) |
| --- | --- | --- | --- |
| false | false | false |  |
| false | true | true | (age > 34) || (weight ≤ 140) is true, because (age > 34) is false, but (weight ≤ 140) is true. |
| true | false | true | (age > 14) || (weight ≥ 150) is false, because (age > 14) is true |
| true | true | true |  |

## Truth Table for Operator ^

| P1 | P2 | P1 ^ P2 | Example (assume age = 24, weight = 140) |
| --- | --- | --- | --- |
| false | false | false | (age > 34) ^ (weight > 140) is true, because (age > 34) is false and (weight > 140) is false |
| false | true | true | (age > 34) ^ (weight ≥ 140) is true, because (age > 34) is false but (weight ≥ 140) is true |
| true | false | true | (age > 14) ^ (weight > 140) is true, because (age > 14) is true and (weight >140) is false |
| true | true | false |  |

## The & and | Operators

— Supplement [III.B](http://III.Bm) “The & and | Operators”

— If x is 1, what is x after this expression?

- (x > 1) & (x++ < 10)

— If x is 1, what is x after this expression?

- (1 > x) && (1 > x++)

— How about ( 1 == x) | (10 > x++)?

- (1 == x) || (10 > x++)?

## Switch Statements

```jsx
switch (status) {
	case 0: compute taxes for single filers;
		break;
	case 1: compute taxes for married file jointly;
		break;
	case 2: compute taxes for married file separately;
		break;
	case 3: compute taxes for head of household;
		break;
	default: System.out.println("Errors: invalid status");
		System.exit(1);
}
```

## Switch Statement Flow Chart

![Screenshot 2024-02-05 at 2.59.44 PM.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/390e5f93-07cf-4492-a7f9-e9f8d32aa70c/1a1dce25-f240-4325-bebb-750b5588e610/Screenshot_2024-02-05_at_2.59.44_PM.png)

## Switch Statement Rules

— The switch-expression must yield a value of char, byte, short, or int type and must always be enclosed in parentheses.

```jsx
switch (switch-expression) {
```

— The value1, …, and valueN must have the same data type as the value of the switch-expression. The resulting statements in the case statement are executed when the value in the case statement matches the value of the switch-expression. Note that value1, …, and valueN are constant expressions, meaning that they cannot contain variables in the expression, such as 1 + x.

```jsx
case value1: statement(s)1;
	break;
case value2: statement(s)2;
	break;

...
case valueN: statement(s)N;
	break;
default:statement(s)-for-default;
}
```

— The keyword break is optional, but it should be used at the end of each case in order to terminate the remainder of the switch statement. If the break statement is not present, the next case statement will be executed

```jsx
switch (switch-expression) {
	case value1: statement(s)1;
		break;
	case value2: statement(s)2;
		break;

	...
	case valueN: statement(s)N;
		break;
```

— The default case, which is optional, can be used to perform actions when none of the specified cases matches the switch-expression.

```jsx
default: statement(s)-for-default
}
```

— When the value in a case statement matches the value of the switch-expression, the statements starting from this case are executed until either a break statement or the end of the switch statement is reached.

## Trace Switch Statement

```jsx
switch (day) { // Suppose day is 2
	case 1:
	case 2:
	case 3:
	case 4:
	case 5: System.out,println("Weekday"); break;
	case 0:
	case 6: System.out.println("Weekend");
```

```jsx
switch (day) {
	case 1:
	case 2: // Match case 2
	case 3:
	case 4:
	case 5: System.out.println("Weekday"); break;
	case 0:
	case 6: System.out.println("Weekend");
}
```

```jsx
switch (day) {
	case 1:
	case 2:
	case 3: // Fall through case 3
	case 4:
	case 5: System.out.println("Weekday"); break;
	case 0:
	case 6: System.out.println("Weekend");
}
```

```jsx
switch (day) {
	case 1:
	case 2: 
	case 3:
	case 4: // Fall through case 4
	case 5: System.out.println("Weekday"); break;
	case 0:
	case 6: System.out.println("Weekend");
}
```

```jsx
switch (day) {
	case 1:
	case 2: 
	case 3:
	case 4:
	case 5: System.out.println("Weekday"); break; // Fall through case 5 & encounter break
	case 0:
	case 6: System.out.println("Weekend");
}
```

```jsx
switch (day) {
	case 1:
	case 2:
	case 3:
	case 4:
	case 5: System.out.println("Weekday"); break;
	case 0:
	case 6: System.out.println("Weekend");
}
// Exit the statement
```

## Conditional Operators

— if (x > 0) , y = 1 else y = -1;

is eqiuvalent to

- y = (x > 0) ? 1 : -1;
(boolean expression)? expression1 : expression 2

— Ternary operator

— Binary operator

— Unary operator

```jsx
if (num % 2 == 0)
	System.out.println(num + "is even");
else
	System.out.println(num + "is odd");

System.out.println(
	(num % 2 == 0)? num + "is even" : num + "is odd");

boolean-expression ? exp1 : exp2
```

## Operator Precedence

- var++, var—
- +, - (Unary plus and minus), ++var, —var
- (type) Casting
- ! (Not)
- *, -, % (Multiplication, division, and remainder)
- +, - (Binary addition and subtraction)
- <, ≤, >, ≥ (Relational operators)
- ==, ≠; (Equality)
- ^ (Exclusive OR)
- && (Conditional AND) Short-circuit AND
- || (Conditional OR) Short-circuit OR
- =, +=, -=, *=, /=, %= (Assignment operators)

## Operator Precedence and Associativity

— The expression in the parentheses is evaluated first. (Parentheses can be nested, in which case the expression in the inner parentheses is executed first.) When evaluating an expression without parentheses, the operators are applied according to the precedence rule and the associativity rule.

— If operators with the same precedence are next to each other, their associativity determines the order of evaluation. All binary operators except assignment operators are left-associative

## Operator Associativity

— When two operators with the same precedence are evaluated, the associativity of the operators determines the order of evaluation. All binary operators except assignment operators are left-associative.

- a - b + c - d is equivalent to ((a-b) + c) - d

— Assignment operators are right-associative. Therefore the expression

- a = b += c = 5 is equivalent to a = (b += (c = 5))

## Example

— Applying the operator precedence and associativity rule, the expression 3 + 4 * 4 > 5 * (4 + 3) - 1 is evaluated as :

![Screenshot 2024-02-05 at 3.31.35 PM.png](https://prod-files-secure.s3.us-west-2.amazonaws.com/390e5f93-07cf-4492-a7f9-e9f8d32aa70c/35c06382-80b8-4cb9-9859-69134e05023d/Screenshot_2024-02-05_at_3.31.35_PM.png)

## Debugging

— Logic errors are called bugs. The process of finding and correcting errors is called debugging. A common approach to debugging is to use a combination of methods to narrow down to the part of the program where the bug is located. You can hand-trace the problem (i.e., catch errors by reading the program), or you can insert print statement in order to show the values of the variable or the execution flow of the program. But for a large, complex program, the most effective approach for debugging is to use a debugger utility.

## Debugger

— Debugger is a program that facilitate debugging. You can use a debugger to:

- Execute a single statement at a time
- Trace into or stepping over a method
- Set breakpoints
- Display variables
- Display call stack
- Modify variables
