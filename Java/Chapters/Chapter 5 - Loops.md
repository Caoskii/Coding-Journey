## Motivations

— Suppose that you need to print a string )e.g., “Welcome to Java!”) a hundred times. It would be tedious to have to write the following statement a hundred times:

```java
System.out.println("Welcome to Java!");
```

— So, how do you solve this problem?

## Introducing while Loops

```java
int count = 0;
while (count < 100) {
	System.out.println("Welcome to Java");
	count++;
}
```

## OBJECTIVES

- To write programs for executing statements repeatedly using a while loop (5.2)
- To follow the loop design strategy to develop loops (5.2.1 - 5.2.3)
- To control a loop with a sentinel value (5.2.4)
- To obtain large input from a file using input redirection rather than typing from the keyboard (5.2.5)
- To write loops using do-while statements (5.3)
- To write loops using for statements (5.4)
- To discover the similarities and differences of three types of loop statements (5.5)
- To write nested loops (5.6)
- To learn the techniques for minimizing numerical errors (5.7)
- To learn loops from a variety of examples (GCD, FutureTuition, Dec2Hex) (5.8)
- To implement program control with break and continue (5.9)
- To write a program that displays prime numbers (5.11)

## while Loop Flow Chart

!<img width="983" alt="Chapter 5 (1)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/5c4d443b-d9d0-4fe9-bc4a-a1cbcf087b21">

## Trace while Loop

```java
int count = 0; // <- Initialize count
while (count < 2) {
	System.out.println("Welcome to Java!");
	count++;
}
```

```java
int count = 0;
while (count < 2) { // <- (count < 2) is true. still true since count is 1
	System.out.println("Welcome to Java!"); // <- Print Welcome to Java
	count++; // <- Increase count by 1, count is 1 now.
}
// Loop exits. Execute the next statement after the loop
```

## Caution

— Don’t use floating-point values for equality checking in a loop control. Since floating-point values are approximations for some values, using them could result in imprecise counter values and inaccurate results. Consider the following code for computing 1 + 0.9 + 0.8 + … + 0.1:

```java
double item = 1; double sum = 0;
while (item != 0) { // No guarantee item will be 0
	sum += item;
	item -= 0.1;
}
System.out.println(sum);
```

## do-while Loop

```java
do {
	// Loop body;
	Statement(s);
} while (loop-continuation-condition);
```

!<img width="359" alt="Chapter 5 (2)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/5cf19227-57bc-46f1-a8ab-9f830064072e">

## for Loops

```java
for (initial-action; loop-continuation-condition; action-after-each-iteration) { // loop body;
Statement(s);
}
```

!<img width="306" alt="Chapter 5 (3)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/40b39795-4a81-4f3f-aa05-a2739e6bf5b7">

```java
int i; for (i = 0; i < 100; i++) {
	System.out.println("Welcome to Java!");
}
```

!<img width="254" alt="Chapter 5 (4)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/31db92e1-5f3e-4081-b902-ab0834d67aaf">

## Trace for Loop

```java
int i; // <- Declare i
for (i = 0; i < 2; i++) { // <- Execute initializer i is now 0, (i < 2) is true since i is 0
	System.out.println("Welcome to Java!"); // <- Prints Welcome to Java
}
```

## Note

— The initial-action in a for loop can be a list of zero or more comma-separated expressions. The action-after-each-iteration in a for loop can be a list of zero or more comma-separated statements. Therefore, the following two for loop are correct. They are rarely used in practice, however.

```java
for (int i = 1; i < 100; System.out.println(i++));
```

```java
for (int i = 0, j = 0; (i + j < 10); i++, j++) {
 // Do something
}
```

— If the loop-continuation-condition in a for loop is omitted, it is implicitly true. Thus the statement given below in (a), which is an infinite loop, is correct. Nevertheless, it is better to use the equivalent loop in (b) to avoid confusion: 

- (a)

```java
for ( ; ; ) {
	// Do something
}
```

- EQUIVALENT TO
    - (b)

```java
while (true) {
	// Do something
}
```

## Caution

— Adding a semicolon at the end of the for clause before the loop body is a common mistake, as shown below:

```java
for (int i = 0; i < 10; i++); // <- Logic Error
{
	System.out.println("i is " + i);
}
```

— Similarly, the following loop is also wrong:

```java
int i = 0;
while (i < 10); // <- Logic Error
{
	System.out.println("i is " + i);
	i++;
}
```

— In the case of the do loop, the following semicolon is needed to end the loop.

```java
int i = 0;
do {
	System.out.println("i is " + i);
	i++;
} while (i < 10); // <- Correct
```

## Which Loop to Use?

— The three forms of loop statements, while, do-while, and for, are expressively equivalent; that is, you can write a loop in any of these three forms. For example, a while loop in (a) in the following figure can always be converted into the following for loop in (b):

- (a)

```java
while (loop-continuation-condition) {
	// Loop body
}
```

- EQUIVALENT TO
    - (b)

```java
for ( ; loop-continuation-condition; ) {
 // Loop body
}
```

— A for loop in (a) in the following figure can generally be converted into the following while loop in (b) except in certain special cases

- (a)

```java
for (initial-action; loop-continuation-condition; action-after-each-iteration) {
	// Loop body;
}
```

- EQUIVALENT TO
    - (b)

```java
initial-action; 
while (loop-continuation-condition) {
	// Loop body;
	action-after-each-iteration;
}
```

## Recommendations

— Use the one that is most intuitive and comfortable for you. In general, a for loop may be used if the number of repetition is known, as, for example, when you need to print a message 100 times. A while loop may be used if the number of repetitions is not known, as in the case of reading the numbers until the input is 0. A do-while loop can be used to replace a while loop if the loop body has to be executed before testing the continuation condition.

## Minimizing Numerical Errors

— Numeric errors involving floating-point numbers are inevitable. This section discusses how to minimize such errors through an example.

## Case Study: Converting Decimals to Hexadecimals

— Hexadecimals are often used in computer systems programming. How do you convert a decimal number to a hexadecimal number? To convert a decimal number d to a hexadecimal number is to find the hexadecimal digits h(n), h(n-1), h(n-2), … , h(2), h(1), and h(0) such that

- d = h(n) x 16(n) + h(n - 1) x 16(n-1) + h(n - 2) x 16(n - 2) + … + h(2) x 16(2) + h(1) x 16(1) + h(0) x 16(0)

— These hexadecimal digits can be found by successively dividing d by 16 until the quotient is 0. The remainders are h0, h1, h2, … , h(n-2), h(n-1), and h(n)

## break

```java
public class TestBreak {
	public static void main(String[] args) {
		int sum = 0;
		int number = 0;

		while (number < 20) {
			number++;
			sum += number;
			if (sum >= 100)
				break;
		}
		
		System.out.println("The number is " + number);
		System.out.println("The sum is " + sum);
	}
}
```
