package Strategy;

import Strategy.Strategy;

public class VowelsSymbolsStrategy implements Strategy {
    @Override
    public String execute(String a, String b) {
        System.out.println("Executing Vowels-Symbols Strategy");
        return a.replaceAll("[BbCcDdFfGgHhJjKkLlMmNnPpQqRrSsTtVvWwXxYyZz]","").concat(b.replaceAll("[^_\\W]*",""));
    }
}
