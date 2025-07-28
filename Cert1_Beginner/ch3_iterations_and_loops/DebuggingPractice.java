import java.util.*;
public class DebuggingPractice{
    public static void main(String[] args){

        int[] numbers = {10, 15, 20, 25, 30};

        // Ternary operator and if-else
        for (int i : numbers) {
            String result = (i % 2 == 0) ? "Even" : "Odd";
            if (i > 20)
                System.out.println(i + " is biger than 20 and " + result);
            else if (i == 20)
                System.out.println(i + " is 20 and " + result);
            else
                System.out.println(i + " is smaller than 20 and " + result);
        }
        
        // While loop with continue
        int count = 0;
        while (count < 10) {
            count++;
            if (count == 3 || count == 6) {
                System.out.println("Skipped " + count);
                continue;
            }
            if (count == 8)
                break;
            System.out.println("Count: " + count);
        }
    
        // do-while loop
        int j = 5;
        do {
            System.out.println("j is " + j);
            j--;
        } while (j >= 4);
        
        // Nested loops
        for (int row = 1; row <= 3; row++) {
            int col = 1;
            while (col <= 2) {
                System.out.println("Row " + row + ", Col " + col);
                col++;
            }
        }
         
        // Switch case
        String grade = "B";
        switch (grade) {
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Good job");
                break;
            case "C":
                System.out.println("Needs improvement");
                break;
            default:
                System.out.println("Unknown grade");
        }
    }
}