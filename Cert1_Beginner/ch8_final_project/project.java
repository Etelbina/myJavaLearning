import java.util.*;

public class project{
    public static void main(String[] args){
        
        // 1. Create a class `Student` with:
        // - Attributes: `name`, `int age`, `ArrayList<Integer> grades`, `HashSet<String> clubs`
        // - A method `calculateAverage()` that returns the average grade
        // - A method `getProfile()` that returns a formatted `String` with name and average
        // - A method `joinClub(String club)` that prevents duplicates
        class Student {
            public String name;
            public int age;
            List<Integer> grades = new ArrayList<>();
            HashSet<String> clubs = new HashSet<>();

            public double calculateAverage() {
                int sum = 0;
                for (int i = 0; i < this.grades.size(); i++) {
                    sum = sum + this.grades.get(i);
                }
                return sum / this.grades.size();
            }

            public String getProfile() {
                String profile = String.format("[INFO] Strudent profile: %s | Average grade: %.2f |\n", this.name, this.calculateAverage());
                return profile;
            }

            public String joinClub(String club) {
                if (this.clubs.contains(club)) {
                    return club + " already registered";
                } else if (this.clubs.size() == 3) {
                    return "You can't join to " + club + " club. You have already registered into 3 clubs.";
                } else {
                    this.clubs.add(club);
                    return "You have joined to " + club + " club successfully!!";
                }
            }

            // constructor
            Student(String name, int age, List<Integer> grades, HashSet<String> clubs) {
                this.name = name;
                this.age = age;
                this.grades = grades;
                this.clubs = clubs;
            }
        }

        // creating a student
        Student maria = new Student("Maria", 20, Arrays.asList(85, 90, 87), new HashSet<>(Arrays.asList("Arts", "Sports")));
        Student alan = new Student("Alan", 19, Arrays.asList(86, 98, 88), new HashSet<>(Arrays.asList("Sports", "Science")));
        Student beto = new Student("Beto", 21, Arrays.asList(83, 100, 89), new HashSet<>(Arrays.asList("Science", "Reading")));
        
        // calling student info
        System.out.println("\n-------- SCHOOL PORTAL --------\n");
        System.out.println(maria.getProfile());
        System.out.println("Student name: " + maria.name);
        System.out.println("Student age: " + maria.age);
        System.out.println("Student subjects: " + maria.grades.size());
        System.out.println("Student grades: " + maria.grades.get(0) + ", " + maria.grades.get(1) + ", " + maria.grades.get(2));
        System.out.println("Student average grades: " + maria.calculateAverage());
        System.out.println("Student clubs number: " + maria.clubs.size());
        System.out.println("Student clubs: " + maria.clubs  + "\n");
        System.out.println(maria.joinClub("Reading"));
        System.out.println("Student clubs number update: " + maria.clubs.size());
        System.out.println("Student clubs update: " + maria.clubs + "\n");
        System.out.println(maria.joinClub("Arts"));
        System.out.println(maria.joinClub("Science"));
        System.out.println("Student clubs number: " + maria.clubs.size());
        System.out.println("Student clubs: " + maria.clubs  + "\n");
        System.out.println("--------------------------------\n");
        
        // 2. Create a class `School`:
        // - Attribute: `HashMap<String, Student>` (keyed by student name)
        // - Method addStudent(Student s)`
        // - Method getStudent(String name)` – returns `Student`, or throws custom `StudentNotFoundException`
        // - MethodprintAllStudents()`
        // - Method loadGrades(String[] names, int[][] gradesArray)` – applies nested loops
        class School {
            public HashMap<String, String> enrolledStudents = new HashMap<>();

            public void addStudent(String name, String id) {
                this.enrolledStudents.put(name, id);
            }

            public String getStudent(String name) {
                try {
                    if (this.enrolledStudents.containsKey(name)) {
                        return name + " id: " + this.enrolledStudents.get(name);
                    } else {
                        throw new Exception("StudentNotFoundException for " + name);
                    }
                } catch (Exception e) {
                    return e.getMessage();
                }
                
            }

            public void printAllStudents() {
                ArrayList<String> students = new ArrayList<>(this.enrolledStudents.keySet());
                for (String student: students) {
                    System.out.println(student + ": " + this.enrolledStudents.get(student));
                }
            }

            public void loadGrades(String[] names, int[][] gradesArray) {
                for(int i = 0; i < names.length; i++){
                    String message = "";
                    message = message + names[i] + ": ";
                    for(int j = 0; j < gradesArray.length; j++) {
                        message = message + gradesArray[i][j] + ", ";
                    }
                    System.out.println(message);
                }
            }
        }

        // creating a school
        School wgu = new School();

        // calling school info
        System.out.println("\n-------- STUDENT PORTAL --------\n");
        System.out.println(wgu.enrolledStudents);
        wgu.enrolledStudents.put("Marco", "X7JQ2");
        System.out.println(wgu.enrolledStudents);
        System.out.println("Marco ID: " + wgu.enrolledStudents.get("Marco"));
        System.out.println("Mikel ID: " + wgu.enrolledStudents.get("Mikel"));
        System.out.println("Susan ID: " + wgu.enrolledStudents.getOrDefault("Susan", "Not found"));
        wgu.addStudent("Mikel", "M9LTA");
        wgu.addStudent("Susan", "Z3N8W");
        System.out.println("Adding students...");
        System.out.println("Students update: " + wgu.enrolledStudents);
        System.out.println(wgu.getStudent("Marco"));
        System.out.println(wgu.getStudent("Emma"));
        wgu.printAllStudents();
        
        String[] sNames = {"Fulano", "Mengano", "Perengano"};
        int[][] gradesArray = {{1,2,3}, {4,5,6}, {7,8,9}};
        wgu.loadGrades(sNames, gradesArray);
        System.out.println("--------------------------------\n");*/

        // ### 3. Create an interface `Attendable` with:
        // - `markAttendance(String studentName)`
        // - `printAttendanceReport()`
        interface Attendable {
            // public HashMap<String, Integer> markAttendance(String studentName);
            public HashMap<String, Integer> markAttendance(String studentName, Integer days);
            public void printAttendanceReport(String student, Integer days);
        }
        
        // Then create a class `AttendanceSystem` that:
        // - Implements `Attendable`
        // - Stores attendance in a `HashMap<String, Integer>` (number of days present)
        class AttendanceSystem implements Attendable {
            HashMap<String, Integer> attendance = new HashMap<>();

            public HashMap<String, Integer> markAttendance(String studentName, Integer days) {
                this.attendance.put(studentName, days);
                return attendance;
            }
            public void printAttendanceReport(String student, Integer days) {
                markAttendance(student, days);
                System.out.println("[ATTENDANCE] " + student + ": " + attendance.get(student) + " days");
            }
        }

        AttendanceSystem attendanceInfo = new AttendanceSystem();
        attendanceInfo.printAttendanceReport("Ana", 5);

        /*
        apply syntax, data structures, loops, string manipulation,
        functions, OOP, and exception handling in a real-world simulation.
        
        - Manages student profiles
        - Calculates and formats grades
        - Tracks attendance
        - Uses object-oriented principles
        - Handles errors gracefully with exceptions
        
        | 1 | Java syntax, variables, data types, conversions |
        | 2 | Arrays, ArrayLists, HashMaps, HashSet |
        | 3 | Loops, conditionals, nested structures |
        | 4 | String formatting, methods, splitting, replacing |
        | 5 | Functions with return and overloading, built-in methods |
        | 6 | Classes, attributes, constructors, inheritance, interfaces |
        | 7 | Exception handling (checked + unchecked) |
        
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
        
        ```
        [INFO] Adding students...
        [INFO] Loading grades...
        [INFO] Ana joined Music Club.
        [INFO] Ana's profile: ANA (Average: 87.50)
        [ATTENDANCE] Marked Ana present. Total: 3 days
        
        [ERROR] Student 'Marco' not found.
        [WARNING] Division by zero attempted! Value defaulted.
        
        [REPORT]
        Students: Ana, Luis, Marta
        Clubs: Music, Robotics
        Attendance:
        - Ana: 3 days
        - Luis: 2 days
        
        Grades: [85, 90, 88]
        Max grade: 90
        ```

        cd Cert1_Beginner
        cd ch8_final_project
        javac project.java
        java project
        */
    }
}