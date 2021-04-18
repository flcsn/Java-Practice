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

public class BirdDatabase {
    ArrayList<Bird> birds;
    
    public BirdDatabase() {
        this.birds = new ArrayList<>();
    }
    
    public void addBird(String name, String latinName) {
        Bird bird = new Bird(name, latinName);
        this.birds.add(bird);
    }
    
    public boolean containsBird(String name) {
        for (Bird bird : this.birds) {
            if (name.equals(bird.getName())) {
                return true;
            }
        }
        return false;
    }
    
    public void printAll() {
        for (Bird bird : this.birds) {
            System.out.println(bird);
        }
    }
    
    public Bird getBird(String name) {
        for (Bird bird : this.birds) {
            if (name.equals(bird.getName())) {
                return bird;
            }
        }
        return null;
    }
    
}
