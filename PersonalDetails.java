
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        String longestName = "";
        int sumOfBirthYears = 0;
        int count = 0;
        
        while (true) { 
            input = scanner.nextLine();
            
            if (input.equals("")) {
                break;
            }
            
            String[] splittedInput = input.split(",");
            
            if (splittedInput[0].length() > longestName.length()) {
                longestName = splittedInput[0];
            }
            
            sumOfBirthYears = sumOfBirthYears + Integer.valueOf(splittedInput[1]);
            count++;
        }
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (1.0 * sumOfBirthYears / count));

    }
}
