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

public class Stack {
    private ArrayList<String> list;
    
    public Stack() {
        this.list = new ArrayList<>();
    }
    
    public boolean isEmpty() {
        return this.list.isEmpty();
    }
    
    public void add(String value) {
        this.list.add(value);
    }
    
    public ArrayList<String> values() {
        return this.list;
    }
    
    public String take() {
        int lastValueIndex = this.list.size()-1;
        String lastValue = this.list.get(lastValueIndex);
        
        this.list.remove(lastValueIndex);        
        
        return lastValue;
    }
}
