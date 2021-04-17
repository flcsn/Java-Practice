/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Frankie
 */
public class Container {
    private int containedLiquid;
    
    public Container() {
        this.containedLiquid = 0;
    }
    
    public int contains() {
        return this.containedLiquid;
    }
    
    public void add(int amount) {
        if (amount > 0) {
            this.containedLiquid += amount;
        }
        
        if (this.containedLiquid> 100) {
            this.containedLiquid = 100;
        }
    }
    
    public void remove(int amount) {
        if (amount > 0) {
            this.containedLiquid -= amount;
        }
        
        if (this.containedLiquid < 0) {
            this.containedLiquid = 0;
        }
    }
    
    public String toString() {
        return this.containedLiquid + "/100";
    }
    
}
