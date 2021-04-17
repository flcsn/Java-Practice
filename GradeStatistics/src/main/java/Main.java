
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //String test = "-42\n" + "24\n" + "42\n" + "72\n" + "80\n" + "52\n" + "-1\n";
        Scanner scanner = new Scanner(System.in);
        GradeStatistics grades = new GradeStatistics();
        
        System.out.println("Enter point totals, -1 stops: ");
        
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {
                break;
            }
            
            if (input < 0 || input > 100) {
                continue;
            }
            
            Grade grade = new Grade(input);
            grades.add(grade);
        }
        
        System.out.println("Point average (all): " + grades.getAveragePoints());
        System.out.println("Point average (passing): " + grades.getAveragePassingPoints());
        System.out.println("Pass percentage: " + grades.passPercentage());
        grades.gradeDistribution();
    }
}
