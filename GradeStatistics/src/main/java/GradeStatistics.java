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

public class GradeStatistics {
    private ArrayList<Grade> grades;
    
    public GradeStatistics() {
        this.grades = new ArrayList<>();
    }
    
    public void add(Grade grade) {
        this.grades.add(grade);
    }
    
    public int count() {
        int count = 0;
        
        for (Grade grade : grades) {
            count++;
        }
        
        return count;
    }
    
    public int countPassing() {
        int count = 0;
        
        for (Grade grade : this.grades) {
            if (grade.isPassing()) {
                count++;
            }
        }
        
        return count;
    }
    
    public double getAveragePoints() {
        int sum = 0;
        
        for (Grade grade : this.grades) {
            sum += grade.getPoints();
        }
        
        return (double) sum / this.count();
    }
    
    public double getAveragePassingPoints() {
        int sum = 0;
        
        for (Grade grade : this.grades) {
            if (grade.isPassing())
            sum += grade.getPoints();
        }
        
        return (double) sum / this.countPassing();
    }
    
    public double passPercentage() {
        return 100.0 * this.countPassing() / this.count();
    }
    
    public void gradeDistribution() {
        System.out.println("Grade distribution:");
        
        for (int i = 5; i >= 0; i--) {
            int stars = 0;
            
            for (Grade grade : grades) {
                if (grade.getGrade() == i) {
                    stars++;
                }
            }
            
            System.out.print(i + ":");
            printStars(stars);
        }
    }
    
    public void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    
    
}
