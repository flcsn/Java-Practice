
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> listOfPoints;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.listOfPoints = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.listOfPoints.add(points);
        this.grades.add(pointsToGrade(points));
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    
    public double averageOfGrades() {
        if (this.grades.isEmpty()) {
            return -1;
        }
        
        int sumOfGrades = 0;
        for (int grade : grades) {
            sumOfGrades += grade;
        }
        
        int countOfGrades = this.grades.size();
        double average = (double) sumOfGrades / countOfGrades;
        
        return average;
    }
    
    public double averageOfPoints() {
        if (this.listOfPoints.isEmpty()) {
            return -1;
        }
        
        int sumOfPoints = 0;
        for (int value : this.listOfPoints) {
            sumOfPoints += value;
        }
        
        int countOfPoints = this.listOfPoints.size();
        double average = (double) sumOfPoints / countOfPoints;
        
        return average;
    }
}
