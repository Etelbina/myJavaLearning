import java.util.Arrays;

public class CodeExercise{
    
    // Create two overloaded `greet()` methods* —
    //one takes a name, one takes a name and city
    static void greet() {
        System.out.println("Hi");
    }
    static void greet(String name, String city) {
        System.out.println("Hi " + name + " from " + city);
    }

    // Write a method `calculateHypotenuse(double a, double b)` that
    // returns the hypotenuse using `Math.pow()` and `Math.sqrt()`
    static double calculateHypotenuse(double a, double b) {
        a = Math.pow(a, 2);
        b = Math.pow(b, 2);
        
        return Math.sqrt(a + b);
    }

    // Write a `void` method that prints the sorted version of an array
    // using `Arrays.sort()` and `Arrays.toString()`
    static void sortedArray(int[] array) {
        Arrays.sort(array);
        System.out.println("Sorted: " + Arrays.toString(array));
    }

    // Write a method `cleanAndUpper(String input)` that trims and converts
    // a string to uppercase (show function chaining)
    // Demonstrate using at least one method inside another (function chaining from your own functions)
    static String triming(String str) {
        return str.trim();
    }

    static String cleanAndUpper(String str) {
        str = triming(str);
        return str.toUpperCase();
    }

    static String joining(String toTrim, String str) {
        return String.join(" ", cleanAndUpper(toTrim), str);
    }

    // Write a method that compares the lengths of two strings using
    // built-in methods and returns the longer one
    static String comparing(String first, String second) {
        // if(first.length() > second.length()) {
        //     return first;
        // } else if (first.length() < second.length()) {
        //     return second;
        // } else {
        //     return "Both are equaly long";
        // }

        // nestet ternary
        return (first.length() > second.length()) ? first : (first.length() < second.length()) ? second : "Both";
    }

    // ------- Main -------
    public static void main(String[] args){
        
        greet();
        greet("Maria", "Denver");

        System.out.println("\nHypotenuse of 3, 4: " + calculateHypotenuse(3, 4) + "\n");
        sortedArray(new int[] {5, 2, 7, 3});

        System.out.println(joining("    This is to trimm   ", "(with 3 chained functions)"));


        System.out.println(comparing("Ana", "Otto"));
        /*
        ```
        Hello, name!
        Hi name from city
        Hypotenuse: 5.0
        Sorted: [1, 2, 3, 9]
        CLEANED: JAVA CODE
        Longer string: Programming
        ```

        - Function declarations with return and `void`
        - Function **overloading**
        - Use of **built-in methods** (Math, Arrays, String)
        - **Function chaining**
        */
    }
}