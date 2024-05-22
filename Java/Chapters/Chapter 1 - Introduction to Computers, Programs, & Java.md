# Objectives

- To understand computer basics, programs, and operating systems (1.2 - 1.4)
- To describe the relationship between Java and the World Wide Web (1.5)
- To understand the meaning of Java language specification, API, JDK, and IDE (1.6)
- To write a simple Java program (1.7)
- To display output on the console (1.7)
- To explain the basic syntax of a Java program (1.7)
- To create, compile, and run Java programs (1.8)
- To use sound Java programming style and document programs properly (1.9)
- To explain the differences between syntax errors, runtime errors, and logic errors (1.10)
- To develop Java programs using NetBeans (1.11)
- To develop Java programs using Eclipse (1.12)

## What is a Computer?

— A computer consists of a CPU, memory, hard disk, floppy disk, monitor, printer, and communication devices

— Storage Devices

- Disk, CD, & Tape

— Memory

— CPU

— Communication Devices

- Modem & NIC

— Input Devices

- Keyboard & Mouse

— Output Devices

- Monitor & Printer

## CPU

— The Central Processing Unit (CPU) is the brain of the computer. It retrieves instructions from memory and executes them. The unit of measurement of a clock speed is the Hertz (Hz), with 1 hertz equaling 1 pulse per second. 

— In the 1990s, computers measured clock speed in Megahertz (MHz), but CPU speed has been improving continuously; the clock speed of a computer is now usually stated in Gigahertz (GHz). Intel’s newest processors run at about 3 GHz.

## Memory

— Memory is to store data and program instructions for CPU to execute. A memory unit is an ordered sequence of bytes, each holds eight bits. 

— A program and its data must be brought to memory before they can be executed. A memory byte is never empty, but its initial content may be meaningless to your program. The current content of a memory byte is lost whenever new information is placed in it.

## How Data is Stored?

— Data of various kinds, such as numbers, characters, and strings, are encoded as a series of bits (zeros and ones). Computers use zeros and ones because digital devices have two stable states, which are referred to as zero and one by convention.

— The programmers need not to be concerned about the encoding and decoding of data, which is performed automatically by the system based on the encoding scheme. The encoding scheme varies.

— For example, character “J” is represented by **01001010** in one byte. A small number such as three can be stored in a single byte, it uses a number of adjacent bytes. No two data can share or split a same byte.

— A byte is the minimum storage unit.

## Output Devices: Monitor

— The monitor displays information (text and graphics). The resolution and dot pitch determine the quality of the display.

- Resolution: The screen resolution specifies the number of pixels in horizontal and vertical dimensions of the display device. Pixels (short for “picture elements”) are tiny dots that form an image on the screen. A common resolution for a 17-inch screen, for example, is 1,024 pixels wide and 768 pixels high (1,024 x 768). The resolution can be set manually. The higher the resolution, the sharper and clearer the image is.
- Dot Pitch: The dot pitch is the amount of space between pixels, measured in millimeters. The smaller the dot pitch, the sharper the display.

## Communication Devices

— A **regular Modem** uses a phone line and can transfer data in a speed up to 56,000 bps (bits per second). 

— A **DSL** (**Digital Subscriber Line**) also uses a phone line and can transfer data in a speed 20 times faster than a regular modem.

— A **cable Modem** uses the TV cable line maintained by the cable company. A cable modem is as fast as a DSL. 

— **Network Interface Card** (**NIC**) is a device to connect a computer to a local area network (LAN). The Lan is commonly used in business, universities, and government organization. A high-speed NIC, called 1000BaseT, can transfer data at 1000 mbps (million bits per second).

## Programs

— To create or develop software.

— Computer Programs, known as Software, are instructions to the computer

— You tell a computer what to do through programs. Without programs, a computer is an empty machine. Computers do not understand human languages, so you need to use computer languages to communicate with them.

— Programs are written using programming languages.

## Programming Languages

— Machine Language

- Machine language is a set of primitive instructions built into every computer. The instructions are in the form of binary code, so you have to enter binary codes for various instructions.
- Program with native machine language is a tedious process. Moreover the programs are highly difficult to read and modify. For example, to add two numbers, you might write an instruction in binary like this: **1101101010011010 (56314)**

— Assembly Language

- Assembly languages were developed to make programming easy. Since the computer cannot understand assembly language, however, a program called assembler is used to convert assembly language programs into machine code. For example, to add two numbers, you might write an instruction in assembly code like this: **ADDF3 R1, R2, R3**

— High-Level Language

- The high-level languages are English-like and easy to learn and program. For example: the following is a high-level language statement that computes the area of a circle with radius 5: **area = 5 * 5 * 3.1415;**

## Popular High-Level Languages

- **Ada** - Ada Lovelace, who worked on mechanical general-purpose computers. Developed for the Department of Defense and is used in defense projects.
- **BASIC** - Beginners’s All-purpose Symbolic Instruction Code. Designed to be learned and used easily by beginners.
- **C** - Developed by Bell Laboratories. Combines the power of an assembly language with the ease of use and portability of a high-level language.
- **C++** - C++ is an object-oriented language, based on C.
- **C#** - Pronounced “C Sharp”. It is a hybrid of Java and C++ and was developed by Microsoft.
- **COBOL** - COmm on Business Oriented Language. Used for business applications.
- **FORTRAN** - FORmula TRANslation. Used for scientific and mathematical applications.
- **Java** - Developed by Sun Microsystems, now part of Oracle. It is widely used for developing platform-independent Internet applications. Initial language was called ‘Oak’. It was introduced on May 20, 1995 at Sun World conference.
- **Pascal** - Blaise Pascal, who pioneered calculating machines in the seventeenth century. It is a simple, structured, general-purpose language primarily for teaching programming.
- **Python** - Simple general-purpose scripting language good for writing short programs.
- **Visual Basic** - Developed by Microsoft and it enables the programmers to rapidly develop graphical user interfaces.

## Interpreting / Compiling Source Code

— A program written in a high-level language is called a Source Program or Source Code. Because a computer cannot understand a source program, a source program must be translated into machine code for execution. This can be done using another programming tool called an Interpreter or a Compiler.

— An Interpreter reads one statement from the source code, translates it into the machine code or virtual machine code, then executes it right away. A statement from the source code may be translated into several machine instructions.

- High-Level Source File > Interpreter > Output

## Compiling Source Code

A compiler translates the entire source code into a machine-code file, and the machine-code file is then executed.

- High-Level Source File > Compiler > Machine-Code File > Executor > Output

## Operating Systems

— The Operating System (OS) is a program that manages and controls a computer’s activities. Most popular operating systems for general-purpose computers are Microsoft Windows, Mac OS, and Linux.

— Application programs, such as a Web Browser or a word processor, cannot run unless an operating system is installed and running on the computer.

- User <> Application Programs <> Operating System <> Hardware

## Why Java?

— Java enables users to develop and deploy applications on the Internet for servers, desktop computers, and small hand-held devices. Computing is influenced by the Internet, and Java promises to remain a big part of that future. Java is the Internet programming language.

- Java is a general purpose programming language
- Java is the Internet programming language

## Java, Web, & Beyond

- Java can be used to develop standalone applications.
- Java can be used to develop applications running from a browser.
- Can be also used to develop applications for hand-held devices
- Used to develop applications for Web servers.
- Java is Simple
    - Java is partially modeled on C++, but greatly simplified and improved. Some refer Java as “C++—” because its like C++ but with more functionality and fewer negative aspects.
- Java is Object-Oriented
    - Inherently object-oriented. Although many object-oriented languages began strictly as procedural languages, Java was designed to be object-oriented. Object-Oriented Programming (OOP) is a popular programming approach that is replacing traditional procedural programming techniques.
    - One of the central issues in software development is how to reuse code. Object-Oriented Programming provides flexibility, modularity, clarity, and reusability through encapsulation, inheritance, and polymorphism.
- Java is Distributed
    - Distributed computing involves several computers working together on a network. Java is designed to make that easy. Since networking capability is inherently integrated into Java, writing network programs is like sending and receiving data to and from a file.
- Java is Interpreted
    - Need an Interpreter to run Java programs. The programs are compiled into the Java Virtual Machine code called bytecode. The bytecode is machine-independent and can run on any machine that has a Java interpreter, which is part of the Java Virtual Machine (JVM).
- Java is Robust
    - Java compilers can detect many problems that would first show up at execution time in other languages.
    - Java eliminates certain types of error-prone programming constructs found in other languages.
    - Java has a runtime exception-handling feature to provide programming support for robustness.
- Java is Secure
    - Implements several security mechanisms to protect system against harm caused by stray programs.
- Java is Architecture-Neutral
    - Write once, run anywhere.
    - With Java Virtual Machine (JVM), you can write one program that will run on any platform.
- Java is Portable
    - Because Java is architecture neutral, Java programs are portable. Can be run on any platform without being recompiled.
- Java’s Performance
    - Has been improved impressively over the years with every new version.
- Java is Multithreaded
    - Multithread programming is smoothly integrated in Java, whereas other languages you have to call procedures specific to the operating systems to enable multithreading.
- Java is Dynamic
    - Java was designed to adapt to an evolving environment. New code can be loaded on the fly without recompilation. No need for developers to create, and for users to install major new software versions. New features can be incorporated transparently as needed.

## JDK Editions & Versions

- JDK 1.02 (1995)
- JDK 1.1 (1996)
- JDK 1.2 (1998)
- JDK 1.3 (2000)
- JDK 1.4 (2002)
- JDK 1.5 (2004) a. k. a. JDK 5 or Java 5
- JDK 1.6 (2006) a. k. a. JDK 6 or Java 6
- JDK 1.7 (2011) a. k. a. JDK 7 or Java 7
- JDK 1.8 (2014) a. k. a. JDK 8 or Java 8
- Java 9, 10, 11, 12, 13, 14.
- Java Standard Edition (J2SE)
    - — J2SE can be used to develop client-side standalone applications or applets.
- Java Enterprise Edition (J2EE)
    - — J2EE can be used to develop server-sided applications such as Java servlets, Java ServerPages, and Java ServerFaces.
- Java Micro Edition (J2ME)
    - — J2ME can be used to develop applications for mobile devices such as cell phones.
- Popular Java IDEs are NetBeans & Eclipse

## A Simple Java Program

— // This program prints Welcome to Java!

public class Welcome {

public static void main(String[] args) {

System.out.printIn(”Welcome to Java!”);

}

}

## Trace a Program Execution

— // This program prints Welcome to Java!

public class Welcome {

public static void main(String[] args) —**Enter main method**— {

System.out.println(”Welcome to Java!”); —**Execute statement** —

}

}

## Compiling Java Source Code

— You can port a source program to any machine with appropriate compilers. The source program must be recompiled, however, because the object program can only run on a specific machine. 

— Nowadays computers are networked to work together. Java was designed to run object programs on any platform. With Java, you can write the program once, and compile the source program into a special type of object code, known as ***bytecode***.

— The bytecode can then run on any computer with a Java Virtual Machine. A Java Virtual Machine (JVM) is a software that interprets Java bytecode.

- [Welcome.java](http://Welcome.java) (Java source-code file) -compiled by- → Java Compiler -generates- → Welcome.class (Java bytecode executable file) -executed by- → JVM
    
    Library Code → JVM
    

## Class Name

— Every Java program must have at least one class. Each class has a name. By contention, class names start with an uppercase letter. In this example, the class name is ‘Welcome’.

- // This program prints Welcome to Java!

public class **Welcome ← (Class Name)** {

## Main Method

— Line 2 defines the main method. In order to run a class, the class must contain a method named main. The program is executed from the main method.

- // This program prints Welcome to Java!

public class Welcome {

**public static void main(String[] args) ← (Main Method)** {

## Statement

— A statement represents an action or a sequence of actions. The statement **System.out.PrintIn(”Welcome to Java!”)** in the program is a statement to display the greeting.

- // This program prints Welcome to Java!

public class Welcome {

public static void main(String[] args) {

**System.out.Println(”Welcome to Java!”); ← (Statement)**

}

}

## Statement Terminator

— Every statement in Java ends with a semicolon (;).

- // This program prints Welcome to Java!

public class Welcome {

public static void main(String[] args) {

System.out.Println(”Welcome to Java!”)**; ← (Semicolon)**

}

}

## Keywords

— Keywords are words that have a specific meaning to the compiler and cannot be used for other purposes in the program. For example, when the compiler sees the word class, it understands that the word after class is the name for the class.

- // This program prints Welcome to Java!

**public class ← (Keywords)** Welcome {

**public static void ← (Keywords)** main(String[] args)

## Blocks

— A pair of braces in a program forms a block that groups components of a program

- public class Test { ← (Class Block)
    
    public static void main(String[] args) { ← (Method Block)
    
    System.out.println(”Welcome to Java!”); 
    
    } ← (Method Block)
    

} ← (Class Block)

## Special Symbols

Character Name                                      Description

---

{} - Opening and Closing braces   -      Denotes a block to enclose statements

() - Opening and Closing parentheses - Used with methods.

[ ] - Opening and Closing brackets  -   Denotes an array.

// - Double slashes                      -            Precedes a comment line.

“” - Opening and Closing quotation marks - Enclosing a string (i.e., sequence of characters).

; - Semicolon                                 -         Marks the end of a statement.

---

## Programming Style and Documentation

- Appropriate Comments
    - Includes a summary at the beginning of the program to explain what the program does, its key features, supporting data structures, and any unique techniques it uses.
    - Include your name, class section, instructor, date, and a brief description at the beginning of the program.
        - Ex:
            
            ```jsx
            /**
            	* Class: COSC1436- Programming Fundamentals I <br />
            	* Instructor: Mustapha ElMiloudi <br />
            	* Description: Learn how to program using Java. <br />
            	* Due: 1/1/2014 <br />
            	* I pledge by honor that I have completed the programming assignment independently. <br />
            		I have not copied the code from a student or any source. <br />
            		I have not given my code to any student. <br />
            		<br />
            		Sign here: _________ <br />
            */
            
            public class Exercise1 {
            	/** The main method displays three message */
            	public static void main(String[] args) {
            		//Use the println statements to display three messages
            		System.out.println("Programming is fun");
            		System.out.println("Welcome to Computer Programming");
            		System.out.println("Java is a programming language");
            	}
            }
            ```
            
- Naming Conventions
    - Choose meaningful and descriptive names.
    - Class names:
        - Capitalize the first letter of each word in the name. Ex: ComputeExpression.
- Proper Indentation and Spacing Lines
    - Indent two spaces.
        - Example:
        
        ```jsx
        public class Welcome {
        	public static void main(String[] args) {
        		// Display message Welcome to Java! on the console
        		System.out.println("Welcome to Java!");
        	}
        }
        ```
        
    - Spacing
        - Use blank line to separate segments of the code.
            - Example:
                - 
                
                ```jsx
                System.out.println(3 + 4 * 4);
                // Good Style: Separate operand and operator with one space
                
                System.out.println(3+4*4);
                // Bad Style: Too crowded and hard to read.
                ```
                
- Block Styles
    - Use end-of-line style for braces
    
    ```jsx
    public class Test
    { // <- Next-line Style
    	public static void main(String[] args)
    	{
    		System.out.println("Block Styles");
    	}
    }
    ```
    
    ```jsx
    public class Test { // <- End-of-line Style
    	public static void main(String[] args) { // <- End-of-line Style
    		System.out.println("Block Styles");
    	}
    }
    ```
    

---

## Programming Errors

- Syntax Errors
    - Detected by the Compiler
- Runtime Errors
    - Causes the program to abort
        - Example:
            
            ```jsx
            // ShowRuntimeErrors.java: Program contains runtime errors
            public class ShowRuntimeErrors {
            	public static void main(String[] args) {
            		System.out.println(1 / 0); 
            	}
            }
            
            // Correct Way
            public class ShowRuntimeErrors {
            	public static void main(String[] args) {
            		System.out.println(1 / 0.5);
            
            // Turn the 0 -> 0.5
            ```
            
- Logic Errors
    - Produces incorrect results
        - Example:
            
            ```jsx
            public class ShowLogicErrors {
            	public static void main(String[] args) {
            		System.out.print("Celsius 35 is Fahrenheit degree");
            		System.out.println((9 / 5) * 35 + 32);
            	}
            }
            
            // Correct Way
            public class ShowLogicErrors {
            	public static void main(String[] args) {
            		System.out.print("Celsius 35 is Fahrenheit degree");
            		System.out.println((9 / 5.0) * 35 + 32);
            	}
            }
            
            // Turn the 5 -> 5.0
            ```
            

## Steps on [Welcome.java](http://Welcome.java) and Compiling

- Open Terminal
- Type “cd” → whatever directory. (ex: cd Documents)
    - If in another folder, type (cd Documents → cd “Programming Fundamentals I”)
- Type “ls” to list all the files within the folder.
- Type “Javac Welcome.java” to compile the file
- File turns into “Welcome.class”
- Type “Java Welcome” as result.
