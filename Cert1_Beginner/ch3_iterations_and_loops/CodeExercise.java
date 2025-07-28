import java.util.Arrays;

public class CodeExercise{
    public static void main(String[] args){
        //Loops through an array of students test scores (`int[]`) 
        int[] testScores = {55, 90, 100};

        for (int score: testScores) {
            //Uses aternary operator to mark scores as "even" or "odd"`
            String isEvenOrOdd = (score % 2 == 0) ? "Even" : "Odd";

            //Uses a if-else to classify each score: "Fail" (<60),"Pass"`, `"Excellent" (>90)`
            if (score > 90) {
                System.out.println("Score: " + score + " - Excellent | " + isEvenOrOdd);
            } else if (score >= 60 && score <= 90) {
                System.out.println("Score: " + score + " - Pass | " + isEvenOrOdd);
            } else {
                System.out.println("Score: " + score + " - Fail | " + isEvenOrOdd);
            }

            int extraTasks = 0;
            int studentScore = score;
            while(studentScore < 100 ) {
                extraTasks++;
                studentScore = studentScore + 5;
            }
            String improveMessage = "You will need " + extraTasks + " extra tasks to get " + studentScore + ".\n";
            System.out.println(improveMessage);
        }

        //Uses a nested loop wuth do-while loop to simulate bonus point addition until a student reaches 100
        int[] extraTasksSubmitted = {5, 3};
        String message = "";
        for(int i = 0 ; i < extraTasksSubmitted.length; i++) {
            int currentScore = testScores[i];
            for (int j = 0; j < extraTasksSubmitted[i]; j++) {
                while (currentScore < 100) {
                    currentScore = currentScore + 5;
                }
                message = "Student " + (i + 1) + ". You submited: " + (j + 1) + " extra tasks. Your current score is: " + currentScore;
            }
            System.out.println(message);
        }
        
        // Uses a switch statement to comment based on score level (A, B, C...)
        // Demonstrates both break (stop processing at first perfect score) and
        // continue (skip processing for absent student, marked by `1` score)
        char[] studentGrades = {'B', 'C', 'D', 'C', 'A', 'B'};
        System.out.println("\nThe firs grade A of the group is:");
        int i = 0;
        while(i < studentGrades.length) {
            switch (studentGrades[i]) {
                case 'B':
                    System.out.println("Student: " + (i + 1) + " - Grade: " + studentGrades[i] + ". Next");
                    break;
                case 'C':
                    System.out.println("Student: " + (i + 1) + " - Grade: " + studentGrades[i] + ". Next");
                    break;
                case 'D':
                    i++;
                    continue;
                case 'A':
                    System.out.println("Student: " + (i + 1) + " - Grade: " + studentGrades[i] + ". You won");
                    i++;
                    break;
            }
            i++;
        }

        /* 
        ```
        Score 55: Fail | odd
        Score 90: Pass | even
        Score 100: Excellent | even
        Adding bonus... now: 95
        Warning: Score below threshold!
        Student 1, Assignment 1
        Student 1, Assignment 2
        ...
        Grade comment: B -> Good job
        Perfect score found, ending early!

        ```
        */
    }
}