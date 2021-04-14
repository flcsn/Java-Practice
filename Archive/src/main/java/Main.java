
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
        
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            
            Item item = new Item(identifier, name);
            items.add(item);
        }
        
        ArrayList<Item> toPrint = new ArrayList<>();
        
        
        for (Item item : items) {
            if (!(toPrint.contains(item))) {
                toPrint.add(item);
            }
        }
        
        for (Item item : toPrint) {
            System.out.println(item);
        }


    }
}
