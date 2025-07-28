# myJavaLearning

Exercises to practice Java basic topics from my course.

I asked an AI for **2 exercises per chapter**, covering all chapter content:  
- One for **debugging practice**  
- One for **coding from scratch**  

Plus, a final project that integrates all topics.

## Course General Content

**Java Programming for Beginners**

1. [Java Basic Syntax](#1-java-basic-syntax)  
2. [Simple Data Structures](#2-simple-data-structures)  
3. [Iterations and Loops](#3-iterations-and-loops)  
4. [String Manipulation for Beginners](#4-string-manipulation-for-beginners)  
5. [Writing Functions](#5-writing-functions)  
6. [Object Oriented Programming](#6-object-oriented-programming)  
7. [Mastering Debugging](#7-mastering-debugging)
8. [Final project](#8-final-project)

---

## Exercises

### 1. Java Basic Syntax

**Chapter Content:**  
- Basic syntax  
- Variables  
- Primitive data types  
- Comparison operators  
- Arithmetic operators  
- Logical operations  
- Data type conversion  
- Concatenation  

#### Debugging Practice: Fix the Broken Code

**Objective:**  
- Identify and fix all syntax, logic, and conceptual errors in the code.

**Instructions:**  
- Fix syntax issues (semicolons, parentheses, etc.)  
- Correct variable types and conversions  
- Ensure proper logic for conditionals and comparisons  
- Correct usage of `StringBuilder`, constants, and type casting  

---

#### Code Exercise: Student Profile Validator

**Objective:**  
Write a program from scratch that:  
- Declares and initializes variables of **each primitive type**  
- Uses **arithmetic**, **comparison**, and **logical operators**  
- Uses **comments**, **blocks**, and **printing**  
- Performs **type conversions**  
- Demonstrates **string concatenation with StringBuilder**  

**Description:**  
- Create a program that simulates a student's profile check.
- Use variables to store:  
  - Age (`int`), GPA (`float`), gender (`char`), name (`String`), `isEnrolled` (`boolean`)  
- Print a welcome message using `System.out.println()` and concatenation with `+` and `concat`
- Check if the student is an adult (18+) and if GPA is over 3.0  
- Use `&&` and `||` to determine honors eligibility  
- Convert GPA from float to String  
- Concatenate strings using `StringBuilder`  
- Add a null `String` variable and handle it properly  

---

### 2. Simple Data Structures

**Chapter Content:**  
- Arrays  
- Primitive vs. Class Types  
- ArrayLists  
- HashMaps  
- HashSet  

#### Debugging Practice: Fix the Data Chaos

**Objective:**  
- Debug this broken program that tries to handle multiple simple data structures but has syntax and logical mistakes throughout.

**Instructions:**   
- Fix all array index and method misuse
- Correct improper comparisons (`==` vs `.equals()`)
- Handle missing elements in ArrayLists
- Prevent `NullPointerException`s in multi-dimensional structures
- Improve printing of arrays and collections using proper utility methods

---

#### Code Exercise: School Directory System

**Objective:**  
Create a school system program using:

- Arrays, multidimensional arrays
- Auto-boxing/unboxing and `.equals()`
- ArrayLists (1D and 2D)
- HashMaps and HashSets

**Description:**  
Build a program that:
- **Stores** a fixed array of student grades (ints) and prints them using `Arrays.toString()`
- **Uses** a 2D array of class schedules (Strings, like `"Math"`, `"Biology"`)
- **Creates** an `ArrayList<String>` for teacher names and updates one
- **Initializes** a 2D `ArrayList<Integer>` representing students' weekly attendance (days present per week)
- **Declares** a `HashMap<String, Integer>` with student names as keys and their average grade as values. Use `getOrDefault()` to handle missing students
- **Uses** a `HashSet<String>` to track clubs a student joined. Prevent duplicate entries
- **Uses** `==` and `.equals()` properly when comparing objects and primitives
- **Shows** use of auto-boxing/unboxing by calculating total grades with Integer objects

---

### 3. Iterations and Loops

**Chapter Content:**  
- Conditionals  
- For loops  
- While, Do-While  
- Conditional statements  
- Nested loops  
- Break and Continue  

#### Debugging Practice: Control Flow Mayhem

**Objective:**  
- Fix logic and syntax issues related to loops, conditionals, break/continue, and switch statements.

**Instructions:**   
- Fix syntax: assignment operators, brackets, semicolons
- Use ternary properly
- Ensure break and continue work correctly
- Correct loop structures (e.g., nested `for` + `while`)
- Ensure `switch` uses `break` and handles `default` appropriately

---

#### Code Exercise: Student Performance

**Objective:**  
- Use all types of loops and conditionals to simulate tracking a group of students' test scores and behaviors.

**Description:**  
Write a program that:
- Loops through an array of students’ test scores (`int[]`)
- Uses a **for** loop and **if-else** to classify each score: `"Fail" (<60)`, `"Pass"`, or `"Excellent" (>90)`
- Uses a **ternary operator** to mark scores as `"even"` or `"odd"`
- Uses a **while loop** to simulate bonus point addition until a student reaches 100
- Uses a **do-while loop** to give at least one warning message regardless of score
- Uses **nested loops** to print a simple grid: students vs assignments
- Uses a **switch** statement to comment based on score level (A, B, C...)
- Demonstrates both **break** (stop processing at first perfect score) and **continue** (skip processing for absent student, marked by `1` score)

---

### 4. String Manipulation for Beginners

**Chapter Content:**  
- Essential methods  
- String formatting  
- Special character sequences  
- Search and replace  
- Splitting and joining  

#### Debugging Practice: The Sloppy String Formatter

**Objective:**  
- Fix syntax and logic errors in a program that’s trying to demonstrate common string operations, formatting, search, and manipulation.

**Instructions:**   
- Fix all method calls (`indexOf`, `substring`, etc.)
- Correct formatting types and precision
- Replace bad comparisons with `.equals()`
- Correct array printing, trimming, joining
- Fix invalid method names or parameters

---

#### Code Exercise: Personal Info Formatter

**Objective:**  
- Write a program that collects and processes a user’s name, city, and favorite quote using string methods, formatting, search/replace, and joining.

**Description:**  
Create a program that:
- Asks for a full name with extra spaces (simulate via string variable)
- Trims it and prints it in proper case (first letter uppercase)
- Formats a sentence using `String.format()` with their name and city
- Shows the number of characters in their favorite quote using `.length()`
- Replaces all instances of `"Java"` with `"Java ❤️"`
- Checks if the quote contains `"code"` using `.contains()`
- Splits a CSV-style hobby list and joins it with `" | "`
- Prints output using escape characters: `\n`, `\t`, etc.

---

### 5. Writing Functions

**Chapter Content:**  
- Function introduction  
- Overloading  
- Built-in functions  
- Function chaining  

#### Debugging Practice: The Function Fiesta (with Errors) 

**Objective:**  
- Fix this faulty code full of broken function declarations, misused return types, wrong overloads, and logic issues in built-in and chained function usage.

**Instructions:**   
- Fix return types and method parameters
- Correct use of `Math`, `String`, and `Arrays` built-in methods
- Resolve overload conflicts and fix wrong argument order
- Ensure correct chaining and return values for `trim().toUpperCase()`, etc.

---

#### Code Exercise: Utility Toolbox

**Objective:**  
Write a reusable utility class that demonstrates:
- Function declarations with return and `void`
- Function **overloading**
- Use of **built-in methods** (Math, Arrays, String)
- **Function chaining**

**Description:**  
Create a Java class called `UtilityToolbox` and inside `main()` do the following:
- Create **two overloaded `greet()` methods** — one takes a name, one takes a name and city
- Write a method `calculateHypotenuse(double a, double b)` that returns the hypotenuse using `Math.pow()` and `Math.sqrt()`
- Write a `void` method that prints the sorted version of an array using `Arrays.sort()` and `Arrays.toString()`
- Write a method `cleanAndUpper(String input)` that trims and converts a string to uppercase (show function chaining)
- Write a method that compares the lengths of two strings using built-in methods and returns the longer one
- Demonstrate using at least one method inside another (function chaining from your own functions)

---

### 6. Object Oriented Programming

**Chapter Content:**  
- Classes introduction  
- Attributes and methods  
- Constructors  
- Encapsulation  
- Interfaces, abstract classes, inheritance  
- Overriding  

#### Debugging Practice: The Broken Zoo

**Objective:**  
- Fix the code below. It includes multiple errors in class structure, constructors, encapsulation, inheritance, interfaces, and method overriding.

**Instructions:**   
- Fix syntax for interface and class implementation
- Add missing `super()` constructor calls
- Properly implement access to private fields via getters/setters
- Fix misuse of `this`, `final`, and access modifiers
- Ensure `@Override` is placed and used correctly

---

#### Code Exercise: Library System

**Objective:**  
Create a small object-oriented system that includes:
- Class with attributes and methods
- Constructors (default + parameterized)
- Encapsulation with getters/setters
- Inheritance + interface
- Method overriding

**Description:**  
- Create a class `Book` with attributes: `title`, `author`, `final String genre`
- Include a default constructor and a parameterized one
- Create `getTitle()`, `getAuthor()`, and `setAuthor()`
- Create a method `describe()` that prints book details
- Create an interface `Borrowable` with `borrow()` and `returnBook()` methods
- Create a subclass `LibraryBook` that:
    - Extends `Book`
    - Implements `Borrowable`
    - Overrides `describe()` to include borrowing status
    - Uses `@Override` and `protected` if appropriate

---

### 7. Mastering Debugging

**Chapter Content:**  
- Error messages  
- Syntax errors  
- Logic errors (off-by-one, infinite loops, division by zero)  
- Java exceptions  
- Exception handling in functions  

#### Debugging Practice: Chaos in ExceptionLand

**Objective:**  
- Fix and explain a program with multiple types of errors: syntax, logic, and exception handling.

**Instructions:**   
- Fix the syntax error (missing `;`)
- Add logic to **avoid division by zero**
- Fix off-by-one error in the loop
- Prevent `NullPointerException` before calling `.equals()`
- Wrap file reading in a **try-catch**, and add `throws FileNotFoundException` if needed

---

#### Code Exercise: Error Classifier

**Objective:**  
Write a Java program that intentionally triggers different error types and handles them properly using try, catch, finally, throws, and custom logic.

**Description:**  
Build a program that:
- Prompts the user to enter two integers and divides them, safely handling **division by zero**
- Reads from a non-existent file (`data.txt`) and catches **FileNotFoundException**
- Declares a method `dangerousMethod()` that **throws** an `IOException`, and handle it in `main()`
- Uses an array and intentionally triggers and catches an **ArrayIndexOutOfBoundsException**
- Uses a `finally` block to print: `"Cleaning up resources..."`
- Simulates a **logic error**: Use a loop that runs one too many times, print the wrong value, then fix it
- Print custom error messages to help the user interpret **stack traces**

---

### 7. Final project
Student Management

**Objective:**  
Design a **console-based Student Management System** that:
- Manages student profiles
- Calculates and formats grades
- Tracks attendance
- Uses object-oriented principles
- Handles errors gracefully with exceptions

**Description:**  
## Requirements

### 1. Create a class `Student` with:

- Attributes: `name`, `int age`, `ArrayList<Integer> grades`, `HashSet<String> clubs`
- A method `calculateAverage()` that returns the average grade
- A method `getProfile()` that returns a formatted `String` with name and average
- A method `joinClub(String club)` that prevents duplicates

### 2. Create a class `School`:

- Attribute: `HashMap<String, Student>` (keyed by student name)
- Methods:
    - `addStudent(Student s)`
    - `getStudent(String name)` – returns `Student`, or throws custom `StudentNotFoundException`
    - `printAllStudents()`
    - `loadGrades(String[] names, int[][] gradesArray)` – applies nested loops

### 3. Create an interface `Attendable` with:

- `markAttendance(String studentName)`
- `printAttendanceReport()`

Then create a class `AttendanceSystem` that:

- Implements `Attendable`
- Stores attendance in a `HashMap<String, Integer>` (number of days present)

### 4. In `main()`:

- Create several students
- Add them to the school
- Load grades using a 2D array
- Join clubs using `.joinClub()`
- Print student profiles using `String.format()`
- Mark attendance and print attendance report
- Handle exceptions:
    - Division by zero (simulated)
    - Student not found
    - ArrayIndexOutOfBounds
    - FileNotFoundException (fake read attempt)

---

## 🔧 Bonus Challenges

- Use `Math.max()` or `Math.sqrt()` in grade calculations
- Demonstrate function overloading with multiple `printStudentInfo()` methods
- Use `.split()` and `.join()` to process hobbies or comments
- Demonstrate function chaining with string formatting and trimming

---
