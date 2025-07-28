import java.util.*;

public class CodeExercise{
    public static void main(String[] args){

        // Asks for a full name with extra spaces (simulate via string variable)
        // Trims it and prints it in proper case (first letter uppercase)
        String fullName = "   maria isabella torres fuentes  ";
        String city = "Denver";
        String quote = "I'm learning java and I code daily.";
        String[] hobbies = {"Gym", "Bouldering", "Video games"};

        String trimed = fullName.trim();
        String[] splited = trimed.split(" ");
        List<String> newFullName = new ArrayList<>();
        for (int i = 0; i< splited.length; i++) {
            //String initial = (String.valueOf(splited[i].charAt(0)).toUpperCase());
            String initial = (splited[i].substring(0,1));
            String upper = (splited[i].substring(0,1)).toUpperCase();
            String word = splited[i];
            newFullName.add(word.replace(initial, upper));
        }
        System.out.println(fullName + "\n Corrected:");
        System.out.println(String.join(" ", newFullName));

        // Formats a sentence using `String.format()` with their name and city
        System.out.println(String.format("\nWelcome: %s from %s\n", newFullName.get(0), city));
        // Shows the number of characters in their favorite quote using `.length()`
        System.out.println("Your quote has " + quote.length() + " characters.");
        // Replaces all instances of `"Java"` with `"Java ❤️"`
        System.out.println("But is better this way:\n" + quote.replace("java", "Java ❤️ "));
        
        // Checks if the quote contains `"code"` using `.contains()`
        System.out.println("\nDo you code daily?");
        System.out.println(quote.contains("code"));

        //Splits a CSV-style hobby list and joins it with `" | "`
        System.out.println("\nHobbies: " + String.join(" | ", hobbies));
        
        //Prints output using escape characters: `\n`, `\t`, etc.
        System.out.println("\nSee\n\tyou\n\t\tlater");

        /*
        ```
        Original name: "   maria isabella torres fuentes  "
        Trimmed: "Maria Isabella Torres Fuentes"
        Welcome to the system, Maria Isabella Torres Fuentes from Denver.
        Quote length: 42
        Updated quote: "I love Java ❤️ and I code daily."
        Does the quote mention 'code'? true
        Hobbies: Reading | Music | Hiking
        Details:\n\tName: Maria\n\tCity: Denver
        ```
        */
    }
}