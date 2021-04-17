
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File to read: ");
        String file = scanner.nextLine();
        RecipeList recipeList = new RecipeList();
        
        recipeList.add(readRecipes(file));
        
        System.out.println("Commands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        
        while (true) {
            System.out.print("Enter command: ");
            String command = scanner.nextLine();
            
            if (command.equals("stop")) {
                break;
            } else if (command.equals("list")) {
                recipeList.printAllRecipes();

            } else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String nameToSearch = scanner.nextLine();
                recipeList.searchFor(nameToSearch);

            } else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int cookingTimeToSearch = Integer.valueOf(scanner.nextLine());
                recipeList.searchFor(cookingTimeToSearch);

            } else if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredientToSearch = scanner.nextLine();
                recipeList.withIngredient(ingredientToSearch);
            }    
       }    
    }
    
    public static ArrayList<Recipe> readRecipes(String file) {
        ArrayList<Recipe> recipes = new ArrayList<>();
        
        try (Scanner fileScanner = new Scanner(Paths.get(file))) {
            ArrayList<String> data = new ArrayList<>();
            while (fileScanner.hasNextLine()) {
                String row = fileScanner.nextLine();

                if (row.isEmpty()) {
                    recipes.add(convertToRecipe(data));
                    continue;
                }
                data.add(row);
            }
            recipes.add(convertToRecipe(data));
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return recipes;
    }
    
    public static Recipe convertToRecipe(ArrayList<String> data) {
        String recipeName = data.get(0);
        int cookingTime = Integer.valueOf(data.get(1));
        ArrayList<String> ingredients = readIngredients(data);
        data.clear();
        
        Recipe recipe = new Recipe(recipeName, cookingTime, ingredients);
        return recipe;
    }
    
    public static ArrayList<String> readIngredients(ArrayList<String> data) {
        ArrayList<String> ingredients = new ArrayList<>();
        
        for (int i = 2; i < data.size(); i++) {
            ingredients.add(data.get(i));
        }
        
        return ingredients;
    }

}
