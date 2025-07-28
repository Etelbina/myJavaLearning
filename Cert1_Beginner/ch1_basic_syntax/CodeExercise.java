public class CodeExercise{
    public static void main(String[] args){
        String name = "Ethel";
        int age = 36;
        char gender = 'F';
        boolean isEnrolled = true;
        float gpa = 3.5f;
        Integer payment = null;
        String courseStatus;
        String program;

        StringBuilder infoToPay = new StringBuilder();
        infoToPay.append(name).append(" - ").append(age).append(". - (").append(gender).append(") - GPA: ").append(gpa);

        System.out.println("Welcome " + name + " to your portal.\n");
        System.out.println(String.format("Student info:\nAge: %d\nGender: %s\nGPA: %.1f\nEnrolled: %s\n", age, gender, gpa, isEnrolled));

        if (age < 18 && gpa >= 3.0) {
            program = "You are eligible for an honors program in your next course.";
        } else if (gpa >= 3.0 && age >= 18) {
            program = "You can apply for excellence program in your next course.";
        } else {
            program = "You can assist to the improvement program in your next course.";
        }

        if (isEnrolled == false) {
            courseStatus = "No courses left.\n";
            program = " No program abailable.";
        } else if (isEnrolled == true && payment == null) {
            courseStatus = "Course start soon.\n";
        } else {
            courseStatus = "Course started. Pending payment.\n";
        }

        System.out.println("Course Status: " + courseStatus.concat(program));
        System.out.println("\nReceipt information: " + infoToPay);
    }
}