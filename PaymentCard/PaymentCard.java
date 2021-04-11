/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Frankie
 */
public class PaymentCard {
    private double balance;
    
    public PaymentCard(double balance) {
        this.balance = balance;
    }
    
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
    
    public void eatAffordably() {
        if (sufficientBalance(2.60)) {
            this.balance = this.balance - 2.60;
        }
    }
    
    public void eatHeartily() { 
        if (sufficientBalance(4.60)) {
            this.balance = this.balance - 4.60;
        }
    }
    
    public boolean sufficientBalance(double price) {
        return this.balance >= price;
    }
    
    public void addMoney(double amount) {
        if (amount < 0) {
            return;
        }
        
        this.balance = this.balance + amount;
        
        if (this.balance > 150.0) {
            this.balance = 150.0;
        }
    }
    
    
    
    
    
    
    
}
