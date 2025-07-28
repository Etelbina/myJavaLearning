import java.util.*;

public class DebuggingPractice{
    public static void main(String[] args){

        // Array of grades
        int[] grades = new int[3];
        grades[0] = 90;
        grades[1] = 85;
        grades[2] = 70;

        // Print array
        System.out.println("Grades array: " + Arrays.toString(grades));

        // Multi-dimensional array
        int[][] matrix = { {1, 2}, {3, 4}, {5, 6} };
        System.out.println("[2][1] of matrix: " + matrix[2][1]);

        // Autoboxing and comparison
        Integer a = 100;
        int b = a;
        if (a == b) {
            System.out.println("a and b are == autoboxed int");
        }

        Integer x = 128;
        Integer y = 128;
        if (x.equals(y)) {
            System.out.println("x and y are .equals() Integer");
        }

        // ArrayList of names
        ArrayList<String> names = new ArrayList<>();
        names.add("Ana");
        names.add("Luis");
        names.add("Marta");
        System.out.println("Firsof listt: " + names.get(0));

        // Multidimensional ArrayList
        List<List<Integer>> multiList = Arrays.asList(
            Arrays.asList(0, 10, 20),
            Arrays.asList(30, 40, 50)
        );
        System.out.println("My multiList: " + multiList);

        // HashMap of countries and capitals
        HashMap<String, String> capitals = new HashMap<>();
        capitals.put("France", "Paris");
        capitals.put("Germany", "Berlin");
        System.out.println("Germany's capital: " + capitals.get("Germany"));
        System.out.println("Do we know Italy's capital: " + capitals.containsKey("Italy"));

        // HashSet of IDs
        HashSet<Integer> ids = new HashSet<>();
        ids.add(1);
        ids.add(2);
        ids.add(2);
        ids.add(3);
        if (ids.contains(3)) {
            ids.remove(3);
        }

        System.out.println("Unique IDs: " + ids);
            
    }
}