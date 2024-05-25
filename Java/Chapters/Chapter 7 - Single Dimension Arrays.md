## Opening Problem

— Read one hundred numbers, compute their average, and find out how many numbers are above the average.

## OBJECTIVES

- To describe why arrays are necessary in programming (7.1)
- To declare array reference variables and create arrays (7.2.1 - 7.2.2)
- To obtain array size using arrayRefVar.length and know default values in an array (7.2.3)
- To access array elements using indexes (7.2.4)
- To declare, create, and initialize an array using an array initializer (7.2.5)
- To program common array operations (displaying arrays, summing all elements, finding the minimum and maximum elements, random shuffling, and shifting elements) (7.2.6)
- To simplify programming using the foreach loops (7.2.7)
- To apply arrays in application development (AnalyzeNumbers, DeckOfCards) (7.3 - 7.4)
- To copy contents from one array to another (7.5)
- To develop and invoke methods with array arguments and return values (7.6 - 7.8)
- To define a method with a variable-length argument list (7.9)
- To search elements using the linear (7.10.1) or binary (7.10.2) search algorithm
- To sort an array using the selection sort approach (7.11)
- To use the methods in the java.util.Arrays class (7.12)
- To pass arguments to the main method from the command line (7.13)

## Introducing Arrays

— Array is a data structure that represents a collection of the same types of data.

<img width="831" alt="Chapter 7 (1)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/2a44ca49-0077-4f68-bf6f-621b533810d6">

## Declaring Array Variables

```java
datatype[] arrayRefVar;

// Example:

double[] myList;

datatype[] arrayRefVar[]; // This style is allowed, but not preferred

// Example:

double myList[];
```

## Creating Arrays

```java
arrayRefVar = new datatype [arraySize];

// Example:

myList = new double[10];

myList[0] // references the first element in the array
myList[9] // references the last element in the array
```

## Declaring and Creating in One Step

```java
datatype[] arrayRefVar = new datatype[arraySize];
	double[] myList = new double[10];
	
datatype arrayRefVar[] = new datatype[arraySize];
	double myList[] = new double[10];
```

## The Length of an Array

— Once an array is created, its size is fixed. It cannot be changed. You can find its size using

- arrayRefVar.length

```java
// For example:
	myList.length returns 10
```

## Default Values

— When an array is created, its elements are assigned the default value of

- 0 for numeric primitive data types, ‘/u0000’ for char types, and false for boolean types

## Indexed Variables

— The array elements are accessed through the index. The array indices are 0-based, i.e., it starts from 0 to arrayRefVar.length-1. Each element in the array is represented using the following syntax, known as the indexed variable:

- arrayRefVar[index];

## Using Indexed Variables

— After an array is created, an indexed variable can be used in the same way as a regular variable. For example, the following code adds the value in myList[0] and myList[1] to myList[2]

```java
myList[2] = myList[0] + myList[1];
```

## Array Initializers

— Declaring, creating, initializing in one step:

```java
double[] myList = {1.9, 2.9, 3.4, 3.5};

// This shorthand syntax must be in one statement
```

## Declaring, creating, initializing Using the Shorthand Notation

```java
double[] myList = {1.9, 2.9, 3.4, 3.5};

// This shorthand notation is equivalent to the following statements:
double[] myList = new double[4];
myList[0] = 1.9;
myList[1] = 2.9;
myList[2] = 3.4;
myList[3] = 3.5;
```

## CAUTION

— Using the shorthand notation, you have to declare, create, and initialize the array all in one statement. Splitting it would cause a syntax error. For example, the following is wrong:

```java
double[] myList;
myList = {1.9, 2.9, 3.4, 3.5};
```

## Trace Program with Arrays

<img width="744" alt="Chapter 7 (2)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/1b7c883c-0ba9-44ae-b5db-d7f6855637bf">

<img width="743" alt="Chapter 7 (3)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/41a25b9d-7279-48cf-9952-62080a051b8c">

<img width="730" alt="Chapter 7 (4)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/b12f7ccc-a5d0-471e-99c8-3dc62ed79216">

<img width="727" alt="Chapter 7 (5)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/1819adab-0c47-4a25-829d-597694597bff">

<img width="787" alt="Chapter 7 (6)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/068dda39-f6cc-487f-ad2b-0125f14bbb03">

<img width="805" alt="Chapter 7 (7)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/05176595-93c9-47a5-bcd6-8f39db57f721">

<img width="731" alt="Chapter 7 (8)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/8a207974-d693-4adc-a027-f5e221dc4b88">

<img width="735" alt="Chapter 7 (9)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/5c4ad7b2-70e8-4be6-aa14-15f852437a6d">

<img width="790" alt="Chapter 7 (10)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/be6fd761-0b26-4b92-a11d-285c4f126a08">

<img width="839" alt="Chapter 7 (11)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/6ddcd9a2-1a02-46ee-9137-9d3180f3a013">

<img width="815" alt="Chapter 7 (12)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/c4cd43d0-9663-4e7c-8351-ed5af0015a4e">

<img width="827" alt="Chapter 7 (13)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/66839381-f562-45b5-afa3-5dff50332fd6">

<img width="727" alt="Chapter 7 (14)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/bc4220d5-45f0-4b7d-91c6-3832d3975c63">

<img width="804" alt="Chapter 7 (15)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/64a618ac-cb58-4221-8ec5-946f65397c7b">

<img width="663" alt="Chapter 7 (16)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/5e3f0814-e595-48c9-bed2-00bf064bf416">

<img width="718" alt="Chapter 7 (17)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/422a1390-8f5d-46c1-a78d-e5093844df90">

## Processing Arrays

— See the examples in the text.

1. (Initializing arrays with input values)
2. (Initializing arrays with random values)
3. (Printing arrays)
4. (Summing all elements)
5. (Finding the largest element)
6. (Finding the smallest index of the largest element)
7. (Random shuffling)
8. (Shifting elements)

## Initializing Arrays with Input Values

```java
java.util.Scanner input = new java.util.Scanner(System.in);
System.out.print("Enter " + myList.length + "values: ");
	for (int i = 0; i < myList.length; i++)
	myList[i] = input.nextDouble();
```

## Initializing Arrays with Random Values

```java
for (int i = 0; i < myList.length; i++) {
	myList[i] = Math.random() * 100;
}
```

## Printing Arrays

```java
for (int i = 0; i < myList.length; i++) {
	System.out.print(myList[i] + " ");
}
```

## Summing All Elements

```java
double total = 0;
for (int i = 0; i < myList.length; i++) {
	total += myList[i];
}
```

## Finding the Largest Element

```java
double max = myList[0];
for (int i = 1; i < myList.length; i++) {
	if (myList[i] > max) max = myList[i];
}
```

## Random Shuffling

<img width="841" alt="Chapter 7 (18)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/b347de9e-3507-4b20-9cef-4fbfee6ea480">

## Shifting Elements

<img width="870" alt="Chapter 7 (19)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/955c8570-69fd-4d9f-b397-98bf8d2668eb">

## Enhanced for Loop (for-each loop)

— JDK 1.5 introduced a new loop that enables you to traverse the complete array sequentially without using an index variable. For example, the following code displays all elements in the array myList:

```java
for (double value: myList)
	System.out.println(value);
```

— In general, the syntax is

```java
for (elementType value: arrayRefVar) {
	// Process the value
}
```

— You still have to use an index variable if you wish to traverse the array in a different order or change the elements in the array

## Copying Arrays

— Often, in a program, you need to duplicate an array or a part of an array. In such cases you could attempt to use the assignment statement (=), as follows:

- list2 = list1

<img width="814" alt="Chapter 7 (20)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/45e99403-af99-4db8-8b4a-b26e17ffff69">

— Using a loop:

```java
int[] sourceArray = {2, 3, 1, 5, 10};
int[] targetArray = new 
	int[sourceArray.length];

for (int i = 0; i < sourceArrays.length; i++)
	targetArray[i] = sourceArray[i];
```

## The arraycopy Utility

```java
arraycopy(sourceArray, src_pos, targetArray, tar_pos, length);

// Example:
System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);
```

## Passing Arrays to Methods

<img width="758" alt="Chapter 7 (21)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/a5af2809-1e4f-4341-99d9-09d4176dfd00">

## Anonymous Array

— The statement

```java
printArray(new int[]{3,1,2,6,4,2});
```

— Creates an array using the following syntax:

```java
new dataType[]{literal0, literal1, ..., literalk};
```

— There is no explicit reference variable for the array. Such array is called an anonymous array.

## Pass By Value

— Java uses pass by value to pass arguments to a method. There are important differences between passing a value of variables of primitive data types and passing arrays.

- For a parameter of a primitive type value, the actual value is passed. Changing the value of the local parameter inside the method does not affect the value of the variable outside the method.
- For a parameter of an array type, the value of the parameter contains a reference to an array; this reference is passed to the method. Any changes to the array that occur inside the method body will affect the original array that was passed as the argument.

## Simple Example

<img width="864" alt="Chapter 7 (22)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/6cecaa7d-7033-4502-8ad7-b00b11d372cd">

## Call Stack

<img width="871" alt="Chapter 7 (23)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/066496c7-0926-4c32-b2a2-cb52c733db1f">

— When invoking m(x, y), the values of x and y are passed to number and numbers. Since y contains the reference value to the array, numbers now contains the same reference value to the same array.

<img width="867" alt="Chapter 7 (24)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/39de6de6-8c15-4c60-a149-28a6a0895232">

## Heap

<img width="748" alt="Chapter 7 (25)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/7054887a-3d75-4aae-9bee-5d3fd9025e53">

— The JVM stores the array in an area of memory, called heap, which is used for dynamic memory allocation where blocks of memory are allocated and freed in an arbitrary order

<img width="834" alt="Chapter 7 (26)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/e6687924-c5eb-4356-b7f0-ed509ff99ec7">

## Returning an Array from a Method

<img width="801" alt="Chapter 7 (27)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/040162f0-1e61-4d1f-a6e1-3867e46085dd">

## Trace the Reverse Method

<img width="867" alt="Chapter 7 (28)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/836a1ddf-16e1-4821-ad59-b91d9bb60e91">

<img width="863" alt="Chapter 7 (29)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/adf40105-ca13-474e-b023-8a1174380234">

<img width="859" alt="Chapter 7 (30)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/011d45b9-6bbc-45a4-b8c6-05c19df1248f">

<img width="835" alt="Chapter 7 (31)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/322a75af-66bc-4e09-b757-c492f714c91a">

<img width="833" alt="Chapter 7 (32)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/40725f5c-bebe-47b1-b30f-e3e27b17003f">

<img width="834" alt="Chapter 7 (33)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/0544c22c-fccd-45d8-a590-6bca5962154b">

<img width="834" alt="Chapter 7 (34)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/9c534aa5-00af-4717-b2f1-1de268fe1836">

<img width="837" alt="Chapter 7 (35)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/c19799bf-eb99-4db8-8fd7-ce2f8ac1c27b">

<img width="833" alt="Chapter 7 (36)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/ea0c4228-80e0-4f8e-b896-4cba50bfc86c">

<img width="839" alt="Chapter 7 (37)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/8fcbf3e0-df41-48e9-9228-cd8f32f218e0">

<img width="835" alt="Chapter 7 (38)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/fb63ff26-cdd8-41cf-b425-c1184d218e18">

<img width="834" alt="Chapter 7 (39)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/1d6eef46-ff55-4bb0-b9c8-943637c7007c">

<img width="832" alt="Chapter 7 (40)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/fb28b83c-aa5e-4ea2-b7f0-ea313848bd5c">

<img width="836" alt="Chapter 7 (41)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/a77cf460-0790-4848-9547-e9d8e7ac8566">

<img width="838" alt="Chapter 7 (42)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/96c64633-aba0-4790-b300-a0fe54d56ce5">

<img width="832" alt="Chapter 7 (43)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/fdaaf791-9938-4bbe-b049-d2d2d6f1caa2">

<img width="833" alt="Chapter 7 (44)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/93c8dcf1-1849-4652-9048-0c3464aae8dc">

<img width="832" alt="Chapter 7 (45)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/e85adb34-f6ad-40af-af15-57aedc1f8c96">

<img width="834" alt="Chapter 7 (46)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/4583bde9-1e03-4c99-8982-e1899e6bd620">

<img width="837" alt="Chapter 7 (47)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/b9eae224-fe55-4018-8540-e5b6e0adc739">

<img width="841" alt="Chapter 7 (48)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/ad739bd6-e101-4ad1-9a61-4392365971c2">

<img width="836" alt="Chapter 7 (49)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/4cf0bead-10da-42c4-8e71-3d7f624d7d6a">

## Searching Arrays

— Searching is the process of looking for a specific element in an array; for example, discovering whether a certain score is included in a list of scores. Searching is a common task in computer programming. There are so many algorithms and data structures devoted to searching. In this section, two commonly used approaches are discussed, linear search and binary search.

<img width="862" alt="Chapter 7 (50)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/01138296-3a89-4589-924d-0d0f9fd9f75e">

## Linear Search

— The linear search approach compares the key element, key, sequentially with each element in the array list. The method continues to do so until the key matches an element in the list or the list is exhausted without a match being found. If a match is made, the linear search returns the index of the element in the array that matches the key. If no match is found, the search returns -1.

<img width="527" alt="Chapter 7 (51)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/98e29a16-cde4-4ff8-83ad-845426452b19">

## From Idea to Solution

<img width="780" alt="Chapter 7 (52)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/5af933a5-21eb-4cf9-9067-84e6bd6d9244">

<img width="709" alt="Chapter 7 (53)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/ccd64dc1-5043-4157-8139-7f09e49b29eb">

## Binary Search

— For binary search to work, the elements in the array must already be ordered. Without loss of generality, assume that the array is in ascending order.

- e.g., 2 4 7 10 11 45 50 59 60 66 69 70 79

— Consider the following three cases:

- If the key is less than the middle element, you only need to search the key in the first half of the array
- If the key is equal to the middle element, the search ends with a match
- If the key is greater than the middle element, you only need to search the key in the second half of the array.
    
<img width="520" alt="Chapter 7 (54)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/7f2432ce-fc96-4828-8d40-a753df8df658">
    

<img width="842" alt="Chapter 7 (55)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/0463e2a9-312b-43c4-848c-44128a1524bf">

<img width="816" alt="Chapter 7 (56)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/c27cbb30-d927-4705-b0f3-d283b84113ab">

— The binarySearch method returns the index of the element in the list that matches the search key if it is contained in the list. Otherwise it returns

```java
-insertion point - 1.
```

— The insertion point is the point at which the key would be inserted into the list

## The Arrays.binarySearch Method

— Since binary search is frequently used in programming, Java provides several overloaded binarySearch methods for searching a key in an array of int, double, char, short, long, and float in the java.util.Arrays class. For example, the following code searches the keys in an array of numbers and an array of characters

<img width="748" alt="Chapter 7 (57)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/3f91a881-1d58-4064-8298-42b81bd088ac">

— For the binarySearch method to work, the array must be pre-sorted in increasing order.

## Sorting Arrays

— Sorting, like searching, is also a common task in computer programming. Many different algorithms have been developed for sorting. This section introduces a simple, intuitive sorting algorithms: selection sort

## Selection Sort

— Selection sort finds the smallest number in the list and places it first. It then finds the smallest number remaining and places it second, and so on until the list contains only a single number

<img width="620" alt="Chapter 7 (58)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/c0a95080-6149-4ce9-8a98-87f28e3cc258">

## From Idea to Solution

<img width="800" alt="Chapter 7 (59)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/508281c0-15f6-40e5-88be-731d3e8b4c2c">

<img width="589" alt="Chapter 7 (60)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/72166f45-3d8a-49ac-a74c-dc55cacca289">

<img width="585" alt="Chapter 7 (61)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/ea16b22d-8562-4253-804a-2c3a3c0a4b9f">

<img width="574" alt="Chapter 7 (62)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/0380b2e2-4a5d-4380-b4d0-45489154f89d">

## Wrap it in a Method

<img width="817" alt="Chapter 7 (63)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/ce266590-4a43-4140-b6cc-e06095d28485">

## The Arrays.sort Method

— Since sorting is frequently used in programming, Java provides several overloaded sort methods for sorting an array of int, double, char, short, long, and float in the java.util.Arrays class. For example, the following code sorts an array of numbers and an array of characters.

```java
double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
java.util.Arrays.sort(numbers);

char[] chars = {'a','A','4','F','D','P'};
java.util.Arrays.sort(chars);
```

— Java 8 now provides Arrays.parallelSort(list) that utilizes multicore for fast sorting.

## The Arrays.toString(list) Method

— The Arrays.toString(list) method can be used to return a string representation for the list.

## Main Method is Just a Regular Method

— You can call a regular method by passing actual parameters. Can you pass arguments to main? Of course, yes. For example, the main method in class B is invoked by a method in A, as shown below:

<img width="853" alt="Chapter 7 (64)" src="https://github.com/Caoskii/Coding-Journey/assets/146856547/2398efdc-8a94-4dae-a9da-433775e15c46">

## Command-Line Parameters

```java
class TestMain {
	public static void main(String[] args) {
	...
	}
}

java TestMain arg0 arg1 arg2 ... argn
```

## Processing Command-Line Parameters

— In the main method, get the arguments from args[0], args[1], …, args[n], which corresponds to arg0, arg1, …, argn in the command line.
