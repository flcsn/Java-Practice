/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Frankie
 */
import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dict;
    
    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                System.out.println("Bye bye!");
                break;
            }
            
            if (input.equals("add")) {
                System.out.println("Word: ");
                String word = scanner.nextLine();
                System.out.println("Translation: ");
                String translation = scanner.nextLine();
                
                this.dict.add(word, translation);
            }
            
            if (input.equals("search")) {
                System.out.println("To be translated: ");
                String toBeTranslated = scanner.nextLine();
                
                String translation = this.dict.translate(toBeTranslated);
                
                System.out.println("Translation: " + translation);
            }
            
            System.out.println("Unknown command");
        }
        
        
        
    }
}
