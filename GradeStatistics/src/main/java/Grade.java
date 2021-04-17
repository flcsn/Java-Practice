/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Frankie
 */
public class Grade {
    private int grade;
    private int points;
    
    public Grade(int points) {
        this.grade = pointsToGrade(points);
        this.points = points;
    }
    
    public int pointsToGrade(int points) {
        if (points < 50) {
            return this.grade = 0;
            
        } else if (points < 60) {
            return this.grade = 1;
            
        } else if (points < 70) {
            return this.grade = 2;
            
        } else if (points < 80) {
            return this.grade = 3;
            
        } else if (points < 90) {
            return this.grade = 4;
            
        } else if (points >= 90) {
            return this.grade = 5;
        }
        
        return -1;
    }
    
    public boolean isPassing() {
        return this.points >= 50;
    }

    public int getGrade() {
        return this.grade;
    }

    public int getPoints() {
        return this.points;
    }
    
    
}
