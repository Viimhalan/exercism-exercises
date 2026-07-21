import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();

    public boolean isEmpty() {
        if(languages.size() == 0){
            return true;
        }
        else{
            return false;
        }
        //throw new UnsupportedOperationException("Please implement the isEmpty() method");
    }

    public void addLanguage(String language) {
        languages.add(language);
        //throw new UnsupportedOperationException("Please implement the addLanguage() method");
    }

    public void removeLanguage(String language) {
        languages.remove(language);
        //throw new UnsupportedOperationException("Please implement the removeLanguage() method");
    }

    public String firstLanguage() {
        return languages.get(0);
        //throw new UnsupportedOperationException("Please implement the firstLanguage() method");
    }

    public int count() {
        return languages.size();
        //throw new UnsupportedOperationException("Please implement the count() method");
    }

    public boolean containsLanguage(String language) {
        boolean contains = false;
        for(int i = 0; i < languages.size(); i++){
            if(languages.get(i).equalsIgnoreCase(language)){
                contains = true;
            }
        }
        return contains;
        //throw new UnsupportedOperationException("Please implement the containsLanguage() method");
    }

    public boolean isExciting() {
        boolean exciting = false;
        for(int i = 0; i < languages.size(); i++){
            if(languages.get(i).equalsIgnoreCase("Java") || languages.get(i).equalsIgnoreCase("Kotlin")){
                exciting = true;
            }
        }
        return exciting;
        //throw new UnsupportedOperationException("Please implement the isExciting() method");
    }
}
