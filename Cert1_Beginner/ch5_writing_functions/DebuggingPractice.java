import java.util.*;

public class DebuggingPractice{

    // + overloading
    static void greet(){
        System.out.println("Hi");
    }

    static void greet(String name){
        System.out.println("Hi " + name);
    }

    public static void greet(String name, String city){
        System.out.println("Hi " + name + ". You are from " + city);
    }

    // Intended to return max of two numbers
    public static double maxNumber(int a, double b) {
        return Math.max(a, b);
    }

    public static void sortAndPrint(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int getLength(String str) {
        return str.length();
    }

    public static String trim(String input) {
        return input.trim();
    }

    public static String toUpperCase(String input) {
        return input.toUpperCase();
    }

    // ----- MAIN ------
    public static void main(String[] args){

        int x = 9;
        double y = 2;
        System.out.println("Max is: " + Math.max(x, y));
        
        greet();
        greet("Ana");
        greet("Ana", "Seattle");
        
        int[] numbers = {5, 2, 9, 1};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        
        String word = "Hello";
        System.out.println("Length of word: " + word.length());
        System.out.println(String.join(" ", "Chained:", word, ((" Java ").trim()).toUpperCase()));
        
        double root = Math.sqrt(16);
        double cube = Math.pow(root, 3);
        System.out.println("Cube of square root: " + cube);

        System.out.println("Max 8-1.5: " + maxNumber(8, 1.5));
        
        sortAndPrint(new int[] {4, 6, 2});

        System.out.println(getLength("This is the string"));

        System.out.println(trim("  To trim.    "));
        
        System.out.println(toUpperCase("to upper case"));
    }
}