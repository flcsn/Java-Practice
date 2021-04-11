import java.util.ArrayList;

public class Statistics {
    private int count;
    private ArrayList<Integer> numbers = new ArrayList<>();
    
    public Statistics() {
        this.count = 0;
    }
    
    public void addNumber(int number) {
        numbers.add(number);
        count++;
    }
    
    public int getCount() {
        return this.count;
    }
    
    public int sum() {
        if (numbers.size() == 0) {
            return 0;
        }
        
        int sum = 0;
        
        for (int i = 0; i < numbers.size(); i++) {
            sum = sum + numbers.get(i);
        }
        
        return sum;
    }
    
    public double average() {
        if (numbers.size() == 0) {
            return 0;
        }
        
        return (double) this.sum() / this.count;
    }
    
    
}
