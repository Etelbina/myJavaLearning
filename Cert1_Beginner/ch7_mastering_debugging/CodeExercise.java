import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class CodeExercise{

        // divide by 0
        public static int divide(int a, int b) {
            return a / b;
        }

        // file not found
        static void readFile() throws IOException {
            FileReader fr = new FileReader("file.txt");
        }

        // Declares a method dangerousMethod() that throws IOException, handle it in main()        
        static void dangerousMethod() throws IOException {
            FileReader fileToRead = new FileReader("data.txt");
        }
        
        // logic error
        static int calculateArea(int figureLength) {
            int result = 1;
            for(int i = 0; i <= 2; i++) {
                result = result * figureLength;
            }
            return result;
        }

    // ------- MAIN ---------
    public static void main(String[] args){

        // enter two integers and divides them, safely handling division by zero
        int unerNum1 = 10;
        int unerNum2 = 0;

        System.out.println("User numbers are: " + unerNum1 + " and " + unerNum2);
        try {
            System.out.println(divide(unerNum1, unerNum2));
        } catch (ArithmeticException e) {
            System.out.println("You can't divide by 0.\nError: " + e + "\n");
        }

        // Reads from a non-existent file (`data.txt`) and catches FileNotFoundException
        System.out.println("Looking for your file");
        try { // Catching the exception where the method is called
            readFile();
        } catch (IOException e) {
            System.out.println("File not found!\nError: " + e);
        } finally {
            System.out.println("Next task\n");
        }

        // Uses a `finally` block to print: `"Cleaning up resources..."`
        System.out.println("Is this a dangerousMethod...");
        try {
            dangerousMethod();
        } catch (IOException e) {
            System.out.println("Non existent.\nError: " + e);
        } finally {
            System.out.println("Cleaning up resources...\n");
        }
        
        // Uses an array and intentionally triggers and catches an ArrayIndexOutOfBoundsException
        int[] arr = {3, 2, 1};
        System.out.println("Wondering what happens if you exceed an array length?");
        try {
            System.out.println(arr[unerNum1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Your number " + unerNum1 + " is too big. Array is " + arr.length + " long.\nError: " + e);
        } finally {
            System.out.println("Last one\n");
        }

        // Simulates a logic error: Use a loop that runs one too many times,
        //print the wrong value, then fix it
        int squareLength = 2;
        
        try {
            System.out.println("The size of one side of your square is: " + squareLength + ".\nIt's area is: " + calculateArea(squareLength) + ".");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (calculateArea(squareLength) == (squareLength * squareLength)) {
                System.out.println("That's correct! The area of your square is equal to " + squareLength + " * " + squareLength);
            } else {
                System.out.println("There's a logic error. The area of your square is equal to " + squareLength + " * " + squareLength + ".\nThe correct answer is: " + (squareLength * squareLength) + ".");
            }
        }

        

        /*
        Write a Java program that intentionally triggers different error types and
        handles them properly using `try`, `catch`, `finally`, `throws`, and custom logic.
        
        
        // Print custom error messages to help the user interpret stack traces

        ```
        Enter two numbers: 10 0
        Oops! You can't divide by zero.

        Trying to read file...
        Error: File not found: data.txt

        Calling dangerousMethod...
        Caught IOException: Something went wrong!

        Accessing array...
        Index out of bounds caught!

        Cleaning up resources...

        Logic Error: Printed 5 elements, but array only has 4. Fxed!
        ```
        */
    }
}