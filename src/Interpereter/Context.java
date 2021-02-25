package Interpereter;

public class Context {
    public String getWithoutVowels(String s){
        return s.replaceAll("[AaEeIiOoUu]","");
    }
    public String getWithoutConsonants(String s){
        return s.replaceAll("[BbCcDdFfGgHhJjKkLlMmNnPpQqRrSsTtVvWwXxYyZz]","");
    }
    public String getLettersOnly(String s){
        return s.replaceAll("[^A-Za-z]","");
    }
}
