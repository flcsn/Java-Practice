
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics allStatistics = new Statistics();
        Statistics evenStatistics = new Statistics();
        Statistics oddStatistics = new Statistics();
        int input;
        
        System.out.println("Enter numbers:");
        
        while (true) {
            input = Integer.valueOf(scanner.nextLine());
            
            if (input == -1) {
                break;
            }
            
            if (input % 2 == 0) {
                evenStatistics.addNumber(input);
            } else {
                oddStatistics.addNumber(input);
            }
            
            allStatistics.addNumber(input);
        }
        
        System.out.println("Sum: " + allStatistics.sum());
        System.out.println("Sum of even numbers: " + evenStatistics.sum());
        System.out.println("Sum of odd numbers: " + oddStatistics.sum());
        

    }
}
