
import java.util.HashMap;

public class SimpleDictionary {

    private HashMap<String, String> translations;

    public SimpleDictionary() {
        this.translations = new HashMap<>();
    }

    public String translate(String word) {
        String translation = this.translations.get(word);
        if (translation == null) {
            return "Word " + word + " was not found.";
        }
        
        return translation;
    }

    public void add(String word, String translation) {
        this.translations.put(word, translation);
    }
}
