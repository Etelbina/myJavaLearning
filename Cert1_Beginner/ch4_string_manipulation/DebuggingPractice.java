import java.util.*;

public class DebuggingPractice{
    public static void main(String[] args){

        String firstName = " Ana ";
        String lastName = "lopez";
        String fullName = firstName + lastName;

        // Incorrect comparison
        if (firstName.equals("Ana")) {
            System.out.println("Hello Ana!");
        }

        // String formatting with errors
        float score = 95.5f;
        String result = String.format("Score: %f", score);
        System.out.printf("Formatted score: %05f\n", score);
        System.out.printf(String.format("Formated %s\n", result));

        // String methods
        String sentence = "  Java Programming is Powerful  ";
        System.out.println("\nOriginal sentence:");
        System.out.println(sentence);
        System.out.println("Short: " + sentence.substring(2, 5));
        System.out.println("To lower:");
        System.out.println(sentence.toLowerCase());
        System.out.println("To upper:");
        System.out.println(sentence.toUpperCase());
        System.out.println("Trimed:");
        System.out.println(sentence.trim());    
        
        // Search and replace
        System.out.println("Index of 'Pro': " + sentence.indexOf("Pro"));
        sentence = sentence.replace("Powerful", "Awesome");
        System.out.println(sentence);

        // Splitting and joining
        String csv = "apple,banana,cherry";
        String[] fruits = csv.split(",");
        System.out.println("\nFruits: " + Arrays.toString(fruits));
        String joined = String.join(" | ", fruits);
        System.out.println(joined);
        
        // Special character sequences
        System.out.println("Line1\nLine2\tTabbed");
    }
}