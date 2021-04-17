/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Frankie
 */
import java.util.ArrayList;

public class RecipeList {
    private ArrayList<Recipe> recipes;
    
    public RecipeList() {
        this.recipes = new ArrayList<>();
    }
    
    public void add(Recipe recipe) {
        this.recipes.add(recipe);
    }
    
    public void add(ArrayList<Recipe> recipes) {
        for (Recipe recipe : recipes) {
            this.recipes.add(recipe);
        }
    }
    
    public void printAllRecipes() {
        for (Recipe recipe : this.recipes) {
            System.out.println(recipe);
        }
    }
    
    public void printFoundRecipes(ArrayList<Recipe> recipes) {
        System.out.println("Recipes: ");
        
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }
    
    public void searchFor(String name) {
        ArrayList<Recipe> foundRecipes = new ArrayList<>();
        
        for (Recipe recipe : this.recipes) {
            if (recipe.getName().contains(name)) {
                foundRecipes.add(recipe);
            }
        }
        
        this.printFoundRecipes(foundRecipes);
    }
    
    public void searchFor(int cookingTime) {
        ArrayList<Recipe> foundRecipes = new ArrayList<>();
        
        for (Recipe recipe : this.recipes) {
            if (recipe.getCookingTime() <= cookingTime) {
                foundRecipes.add(recipe);
            }
        }
        
        this.printFoundRecipes(foundRecipes);
    }
    
    public void withIngredient(String ingredient) {
        ArrayList<Recipe> foundRecipes = new ArrayList<>();
        
        for (Recipe recipe : this.recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                foundRecipes.add(recipe);
            }
        }
        
        this.printFoundRecipes(foundRecipes);
    }
}
