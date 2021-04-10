
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int value;

        while (true) {
            value = Integer.valueOf(scanner.nextLine());
            
            if (value == 9999) {
                break;
            }
            
            list.add(value);
        }
        
        // Keeps track of the indices of the smallest integers
        ArrayList<Integer> indices = new ArrayList<>();
        
        // Sets smallest number to first element in the list by default and tracks its index
        int smallest = list.get(0);
        indices.add(0);
        
        for (int i = 0; i < list.size(); i++) {
            
            // If smaller number is found , clear list of indices, update smallest variable, and keep track of its index
            // Else if more than one instance of smallest number found, adds its index to the list
            if (list.get(i) < smallest) {
                indices.clear();
                smallest = list.get(i);
                indices.add(i);
            } else if (list.get(i) == smallest) {
                indices.add(i);
            }
        }
        
        System.out.println("Smallest number: " + smallest);
        for (int i = 0; i < indices.size(); i++) {
            System.out.println("Found at index: " + indices.get(i));
        }
    }
}
