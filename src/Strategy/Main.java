package Strategy;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        String s1 = "AaBcCcDd01234_-|:;'";
        String s2 = "EeFfGgHhIi5_^6%7&8(9)";

        context.setStrategy(new NumbersOnlyStrategy());
        System.out.println(context.executeStrategy(s1,s2));

        context.setStrategy(new VowelsSymbolsStrategy());
        System.out.println(context.executeStrategy(s1,s2));

        context.setStrategy(new LettersNumbersStrategy());
        System.out.println(context.executeStrategy(s1,s2));
    }
}
