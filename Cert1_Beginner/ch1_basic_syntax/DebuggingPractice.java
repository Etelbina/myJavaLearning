public class DebuggingPractice {
    public static void main(String[] args) {
        //System.out.println("Hello, World!");
        
        // Variable declaration
        int age = 30;
        final float pi = 3.14f;
        char grade = 'A';
        String message = null;
        System.out.println("Welcome! Your age is: " + age);
        System.out.println("Your grade: " + grade);
        System.out.println("PI is about: " + pi);
        System.out.println(message);

        // Arithmetic and comparison
        int a = 10, b = 20;
        if (a > b) {
            System.out.println("A is greater");
        } else if (a == b) {
            System.out.println("They are equal!");
        } else {
            System.out.println("B is greater");
        }

        // Logical operations
        boolean isAdult = age >= 18;
        if (isAdult) {
            System.out.println("You are an adult!");
        } else {
            System.out.println("You are not adult");
        }

        // Type conversion
        String strNum = "100";
        int num = Integer.parseInt(strNum);
        double d = 12.5;
        int dInt = (int) d;
        System.out.println(strNum + ", " + num + ", " + d + ", " + dInt);

        // String concatenation
        String part1 = "Hello, ";
        String part2 = "World!";
        String full = part1.concat(part2);

        System.out.println(full.toString());
    }
}