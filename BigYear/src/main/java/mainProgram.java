
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {
        // NB! Do not create other scanner objects than the one below
        // if and when you create other classes, pass the scanner to them
        // as a parameter
        BirdDatabase birds = new BirdDatabase();
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            System.out.print("? ");
            String command = scan.nextLine();
            
            if (command.equals("Quit")) {
                break;
                
            } else if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Name in Latin: ");
                String latinName = scan.nextLine();
                birds.addBird(name, latinName);

            } else if (command.equals("Observation")) {
                System.out.print("Bird? ");
                String bird = scan.nextLine();
                if (!(birds.containsBird(bird))) {
                    System.out.println("Not a bird!");
                    continue;
                }
                birds.getBird(bird).addObservation();
                
            } else if (command.equals("All")) {
                birds.printAll();
                
            } else if (command.equals("One")) {
                System.out.print("Bird? ");
                String bird = scan.nextLine();
                System.out.println(birds.getBird(bird));
            }
        }
    }
    
}
