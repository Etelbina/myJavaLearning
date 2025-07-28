import java.util.*;

public class DebuggingPractice{

    

    public static void main(String[] args){
        

        // Compile-time error: syntax
        int x = 5;
        System.out.println("X is: " + x);

        // Runtime error: division by zero
        // int result = divide(10, 0);
        int a = 10;
        int b = 0;
        if (b == 0) {
            System.out.println("You can't divide by 0");
        } else {
            int result = a / b;
            System.out.println("Result: " + result);
        }
        
        // Logic error: off-by-one
        int[] numbers = {1, 2, 3, 4};
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // NullPointerException
        String name = null;
        if (name == null) {
            System.out.println("name is: " + name);
        } else if (name.equals("Ana")) {
            System.out.println("Hello Ana!");
        }

        
        // File reading without exception handling
        // Scanner file = new Scanner(new File("data.txt"));
        // while (file.hasNext()) {
        //     System.out.println(file.nextLine());
        // }

        String input = "0";
        int number;

        try {
            number = Integer.parseInt(input);
            int result = 100 / number;
            System.out.println("Result is: " + result);
        } catch (NumberFormatException e) {
            System.out.println("The input was not a valid number.");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        }

        /*
        public static int divide(int a, int b) {
            return a / b;
        }
        */
    }
}