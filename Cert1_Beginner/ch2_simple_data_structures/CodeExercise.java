import java.util.*;

public class CodeExercise{
    public static void main(String[] args){
        /*
        Create a school system program using:

        - Arrays, multidimensional arrays
        - Auto-boxing/unboxing and `.equals()`
        - ArrayLists (1D and 2D)
        - HashMaps and HashSets
        
        Build a program that:
        */
        //Stores** a fixed array of student grades (ints) and prints them using `Arrays.toString()`
        int[] mathGrades = {90, 87, 83};
        System.out.println("Math grades: " + Arrays.toString(mathGrades));

        // Uses** a 2D array of class schedules (Strings, like `"Math"`, `"Biology"`)
        String[][] classSchedule = { {"Math", "Biology", "Arts"}, {"Biology", "Sports", "Ethics"}, {"Arts", "Math", "Sports"}, {"Biology", "Arts", "Ethics"}, {"Math", "Sports", "Ethics"} };
        String[] daysOfWeek = {"Mon.", "Tue.", "Wed.", "Thu.", "Fri."};
        int day = 3;

        switch (day) {
            case 1:
                System.out.println(daysOfWeek[0] + " classes: " + Arrays.toString(classSchedule[0]));
                break;
            case 2:
                System.out.println(daysOfWeek[1] + " classes: " + Arrays.toString(classSchedule[1]));
                break;
            case 3:
                System.out.println(daysOfWeek[2] + " classes: " + Arrays.toString(classSchedule[2]));
                break;
            case 4:
                System.out.println(daysOfWeek[3] + " classes: " + Arrays.toString(classSchedule[3]));
                break;
            case 5:
                System.out.println(daysOfWeek[4] + " classes: " + Arrays.toString(classSchedule[4]));
                break;
        }

        //Creates** an `ArrayList<String>` for teacher names and updates one
        List<String> teachers = new ArrayList<>(Arrays.asList("Mrs. Smith", "Mr. Lee", "Ms. Gomez"));
        teachers.remove(2);
        teachers.add("Ms. Perez");
        System.out.println("My teachers names: " + teachers);

        // Initializes** a 2D `ArrayList<Integer>` representing students' weekly attendance (days present per week)
        List<List<Integer>> assistance = Arrays.asList(
            Arrays.asList(5, 4, 5),
            Arrays.asList(3, 4,3),
            Arrays.asList(4, 3, 5)
        );
        
        String[] students = new String[3];
        //students = new String[3];
        students[0]= "Ana";
        students[1]= "John";
        students[2]= "Pam";
        int student = 2;
        switch (student) {
            case 1:
                System.out.println(students[0] + "'s atendance: " + assistance.get(0));
                break;
            case 2:
                System.out.println(students[1] + "'s atendance: " + assistance.get(1));
                break;
            case 3:
                System.out.println(students[2] + "'s atendance: " + assistance.get(2));
            break;
        }

        //Declares** a `HashMap<String, Integer>` with student names as keys and their average grade as values.
        //Use `getOrDefault()` to handle missing students
        HashMap<String, Double> averageGrades = new HashMap<>();
        averageGrades.put(students[0], 8.3);
        averageGrades.put(students[1], 9.2);
        averageGrades.put(students[2], 8.5);
        System.out.println(students[0] + "'s average grade: " + averageGrades.get(students[0]));
        System.out.println("Mikel's average grade: " + averageGrades.getOrDefault("Mikels", null));

        //Uses** a `HashSet<String>` to track clubs a student joined. Prevent duplicate entries
        HashSet<String> clubs = new HashSet<>();
        clubs.add("Music");
        clubs.add("Running");
        clubs.add("Reading");
        
        System.out.println(students[0] + " joined: " + clubs);

        //Uses** `==` and `.equals()` properly when comparing objects and primitives
        if (students[0] == "Ana") {
            System.out.println("The first student is " + students[0]);
        }

        // Shows** use of auto-boxing/unboxing by calculating total grades with Integer objects
        if (averageGrades.get(students[0]).equals(averageGrades.get(students[1]))) {
            System.out.println(students[0] + " and " + students[1] + " has the same grades");
        } else {
            System.out.println(students[0] + " and " + students[1] + " has diferent grades");
        }

        // Casting types
        Double grupAverage = averageGrades.get(students[0]) + averageGrades.get(students[1]) + averageGrades.get(students[2]);
        float grupAverageFloat = grupAverage.floatValue();
        int grupAverageInt = (int) grupAverageFloat;
        Integer grupAverageBoxed = grupAverageInt;
        System.out.println("5th grades average: " + grupAverageFloat);

        System.out.println("\nCasting types:");
        System.out.println(averageGrades.get(students[0]) + " Student average: " + (averageGrades.get(students[0])).getClass().getName());
        System.out.println(grupAverage + " Group average Double: " + grupAverage.getClass().getName());
        System.out.println(grupAverageFloat + " Group average float: " + ((Object) grupAverageFloat).getClass().getName());
        System.out.println(grupAverageInt + " Group average int: " + ((Object) grupAverageInt).getClass().getName());
        System.out.println(grupAverageBoxed + " Auto-boxed: " + grupAverageBoxed.getClass().getName());
        //System.out.println("Group average string: " + grupAverageString.getClass().getName());
        //System.out.println(grupAverageFloat);
        /*

        

        Example Output:
        Grades: [85, 90, 78]
        Schedule on Monday: Math
        Teachers: [Mrs. Smith, Mr. Lee, Ms. Gomez]
        Ana's attendance: [5, 5, 4, 4]
        Luis' average grade: 88
        Marco not found. Default grade: 0
        Clubs joined: [Chess, Music]

        */
    }
}