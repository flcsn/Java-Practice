
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        String beginningString = "The collection " + name;
        
        if (this.elements.isEmpty()) {
            return beginningString + " is empty.";
        }
        
        String printElements = "";
        int elementCount = 0;
        
        for (String element : elements) {
            elementCount++;
            printElements += "\n" + element ;
        }
        
        String endingString = "";
        
        if (elementCount == 1) {
            endingString = " has 1 element:";
        } else if (elementCount > 1) {
            endingString = " has " + elementCount + " elements:";
        }
        
        return beginningString + endingString + printElements;
    }
    
}
